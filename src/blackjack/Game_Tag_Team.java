package blackjack;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import java.awt.Font;

public class Game_Tag_Team extends JFrame{
	
	private JTextField Cards1;
	private JTextField Sum1;
	private JTextField Wins1;
	private JTextField Cards2;
	private JTextField Sum2;
	private JTextField Wins2;
	private JTextField Instructions;
	private JButton btnEnd = new JButton();
	private JButton btnStop = new JButton();
	private JButton btnHit = new JButton();
	private JLabel Player1 = new JLabel();
	private JLabel Player2 = new JLabel();
	private int counter1;
	private int counter2;
	private Player[][] turn = new Player[4][2];
	private Tag_Team t = new Tag_Team();
	private Deck deck = new Deck();
	private boolean flag = true;
	private JButton btnStart = new JButton();
	private JLabel label;
	private JFrame frame;
	private ImageIcon icon;
	
	
	public Game_Tag_Team(Tag_Team tag) {
		
		t = tag;
		counter1 = 0;
		counter2 = 0;
		turn = t.Choose_Players();
		deck.DeckLoad();
		
		frame = new JFrame();//dhmiourgia tou frame kai label(eikonas)
		icon = new ImageIcon("CardTable.jpg");
		label = new JLabel(icon);
		
		


		
		Player1 = new JLabel(turn[counter1][counter2].getNickname());//eisagwgh onomatwn 
		Player1.setFont(new Font("Times New Roman", Font.ITALIC, 18));	
		Player1.setBounds(190, 100, 150, 30);
		
		
		Player2 = new JLabel(turn[counter1][counter2 + 1].getNickname());
		Player2.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		Player2.setBounds(190, 175, 150, 30);
		
		
		JLabel lblCards = new JLabel("Cards");
		lblCards.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblCards.setBounds(353, 60, 46, 30);
		
		
		JLabel lblSum = new JLabel("Summary");
		lblSum.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblSum.setBounds(444, 60, 70, 30);
		
		
		JLabel lblTeamWins = new JLabel("Team Wins");
		lblTeamWins.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblTeamWins.setBounds(535, 60, 100, 30);
		
		Cards1 = new JTextField();//eisagwgh plaisiwn pou emfanizontai oi arithmoi
		Cards1.setBounds(330, 100, 92, 30);		
		Cards1.setColumns(10);
		
		Cards2 = new JTextField();
		Cards2.setBounds(330, 175, 92, 30);		
		Cards2.setColumns(10);
		
		Sum1 = new JTextField();
		Sum1.setBounds(440, 100, 70, 30);
		Sum1.setColumns(10);
		
		Sum2 = new JTextField();
		Sum2.setBounds(440, 175, 70, 30);
		Sum2.setColumns(10);
		
		Wins1 = new JTextField();
		Wins1.setBounds(528, 100, 50, 30);
		Wins1.setColumns(10);
		
		Wins2 = new JTextField();
		Wins2.setBounds(528, 175, 50, 30);
		Wins2.setColumns(1000);
		
		btnStart = new JButton("Start");
		btnStart.setBounds(540, 380, 80, 30);
		
		btnHit = new JButton("Hit");
		btnHit.setBounds(220, 380, 80, 30);
		
		btnStop = new JButton("Stop");
		btnStop.setBounds(382, 380, 80, 30);
		
		Instructions = new JTextField(turn[0][t.set_Dealer(counter1)].getNickname() + " is the dealer.\nClick Hit to take a card");
		Instructions.setBounds(200, 250, 450, 100);
		Instructions.setColumns(10);
		
		btnEnd = new JButton("End Game");
		btnEnd.setBounds(370, 430, 100, 30);
		
		ButtonListener A = new ButtonListener();
		btnEnd.addActionListener(A);
		btnHit.addActionListener(A);
		btnStop.addActionListener(A);
		btnStart.addActionListener(A);
		
		label.setLayout(null);
		
		label.add(Player1);
		label.add(Player2);
		label.add(lblCards);
		label.add(lblSum);
		label.add(lblTeamWins);
		label.add(Cards1);
		label.add(Sum1);
		label.add(Wins1);
		label.add(Cards2);
		label.add(Sum2);
		label.add(Wins2);
		label.add(btnHit);
		label.add(btnStop);
		label.add(Instructions);
		label.add(btnEnd);
		label.add(btnStart);
		
		frame.add(label);
		frame.setSize(825,570);
		frame.setVisible(true);
		label.setOpaque(true);
		frame.setTitle("Tag Team");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	class ButtonListener implements ActionListener{
		
		
		public void actionPerformed(ActionEvent e){
			

			if (t.getWinsofTeam1(turn[0][0], turn[1][0]) == t.getNumber_wins()){
				frame.setVisible(false);
				Menu mn = new Menu();
				JOptionPane.showMessageDialog(null,t.getPlayer1().getNickname() + " and " + t.getPlayer2().getNickname() + " WON!", "Team 1 WON" , JOptionPane.INFORMATION_MESSAGE);							
			}
			else if(t.getWinsofTeam2(turn[0][1], turn[1][1]) == t.getNumber_wins()){
				frame.setVisible(false);
				Menu mn = new Menu();
				JOptionPane.showMessageDialog(null,t.getPlayer3().getNickname() + " and " + t.getPlayer4().getNickname() + " WON!", "Team 2 WON" , JOptionPane.INFORMATION_MESSAGE);							
			}
			
			if (e.getSource().equals(btnEnd)){
				Menu mn = new Menu();
				frame.setVisible(false);
			}
			else if (e.getSource().equals(btnStart)){								
				deck.DeckLoad();
				t.ClearHands(turn[0][0], turn[0][1], turn[1][0], turn[1][1]);
				Instructions.setText(turn[counter1][t.set_Dealer(counter1)].getNickname() + " is the dealer.\n" + turn[counter1][counter2].getNickname() + "'s turn.\nClick Hit to draw cards.");				
				Player1.setText(turn[counter1][0].getNickname());
				Player2.setText(turn[counter1][1].getNickname());
				Cards1.setText(turn[counter1][0].printHand());
				Sum1.setText(String.valueOf(turn[counter1][0].print_sum_hand()));
				Wins1.setText(String.valueOf(turn[0][0].getWins() + turn[1][0].getWins()));
				Cards2.setText(turn[counter1][1].printHand());
				Sum2.setText(String.valueOf(turn[counter1][1].print_sum_hand()));
				Wins2.setText(String.valueOf(turn[0][1].getWins() + turn[1][1].getWins()));
				flag = true;
			
			}
			else if (e.getSource().equals(btnStop)){
				if (counter2 == 1){					
					if (turn[counter1][counter2].print_sum_hand() > 21){
						Instructions.setText(turn[counter1][0].getNickname() + " won the round.\n" + turn[counter1][counter2].getNickname() + " got burned.\nClick Start for next round.");
						turn[counter1][0].setWins(turn[counter1][0].getWins() + 1);
					}					
					else if(turn[counter1][0].print_sum_hand() == turn[counter1][1].print_sum_hand()){
						Instructions.setText(turn[counter1][t.set_Dealer(counter1)].getNickname() + " is the dealer and won the round.\nClick Start for next round.");
						t.AddWin(turn[counter1][t.set_Dealer(counter1)]);
					}
					else if (turn[counter1][0].print_sum_hand() > turn[counter1][1].print_sum_hand()){
						t.AddWin(turn[counter1][0]);
						Instructions.setText(turn[counter1][0].getNickname() + " won the round.\nClick Start for next round.");
					}
					else if(turn[counter1][0].print_sum_hand() < turn[counter1][1].print_sum_hand()){
						turn[counter1][1].setWins(turn[counter1][1].getWins() + 1);
						Instructions.setText(turn[counter1][1].getNickname() + " won the round.\nClick Start for next round.");
					}
					counter2 = 0;
					if (counter1 == 3)
						counter1 = 0;
					else
						counter1 += 1;
				}
				else if(counter2 == 0){
					if (turn[counter1][counter2].print_sum_hand() > 21){
						Instructions.setText(turn[counter1][1].getNickname() + " won the round.\n" + turn[counter1][counter2].getNickname() + " got burned.\nClick Start for next round.");
						turn[counter1][1].setWins(turn[counter1][1].getWins() + 1);
						if (counter1 == 3)
							counter1 = 0;
						else
							counter1 += 1;
					}
					else{
						counter2 += 1;
						flag = true;
						Instructions.setText(turn[counter1][t.set_Dealer(counter1)].getNickname() + " is the dealer.\n" + turn[counter1][counter2].getNickname() + "'s turn.\nClick Hit to draw cards.");
					}
					
				}
			}
			else if (e.getSource().equals(btnHit)){
				if (counter2 == 0){
					if (flag){
						turn[counter1][counter2].Draw_phase_wins(deck, 0);
						Cards1.setText(turn[counter1][0].printHand());
						Sum1.setText(String.valueOf(turn[counter1][0].print_sum_hand()));
						if (t.Check_21(turn[counter1][counter2])){
							Instructions.setText(turn[counter1][counter2].getNickname() + " won the round with blackjack.\nClick Start for next round");
							turn[counter1][counter2].setWins(turn[counter1][counter2].getWins() + 1);
							counter1 += 1;
							counter2 = 0;
						}else
							flag = false;
					}else if (!flag){
						turn[counter1][counter2].Draw_phase_wins(deck, 1);
						Cards1.setText(turn[counter1][0].printHand());
						Sum1.setText(String.valueOf(turn[counter1][0].print_sum_hand()));
					}
					
				}else if(counter2 == 1){
					if (flag){
						turn[counter1][counter2].Draw_phase_wins(deck, 0);
						Cards2.setText(turn[counter1][1].printHand());
						Sum2.setText(String.valueOf(turn[counter1][1].print_sum_hand()));
						if (t.Check_21(turn[counter1][counter2])){
							Instructions.setText(turn[counter1][counter2].getNickname() + " won the round with blackjack.\nClick Start for next round");
							turn[counter1][counter2].setWins(turn[counter1][counter2].getWins() + 1);
							counter1 += 1;
							counter2 = 0;
						}else
							flag = false;
					}else if (!flag){
						turn[counter1][counter2].Draw_phase_wins(deck, 1);	
						Cards2.setText(turn[counter1][1].printHand());
						Sum2.setText(String.valueOf(turn[counter1][1].print_sum_hand()));
					}
				}
				
			}

		}
	}
}