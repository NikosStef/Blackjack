package blackjack;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class Game_Tag_Team extends JFrame{
	
	private JPanel panel;
	private JTextField Cards1;
	private JTextField Cards2;
	private JTextField Sum1;
	private JTextField Sum2;
	private JTextField Wins1;
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
	private boolean[] flag = {true};
	
	
	public Game_Tag_Team(Tag_Team tag) {
		
		t = tag;
		counter1 = 0;
		counter2 = 0;
		turn = t.Choose_Players();
		
		this.panel = new JPanel();


		
		Player1 = new JLabel(turn[counter1][counter2].getNickname());
		Player1.setFont(new Font("Tahoma", Font.BOLD, 13));
		Player1.setBounds(12, 45, 75, 19);
		
		
		Player2 = new JLabel(turn[counter1][counter2 + 1].getNickname());
		Player2.setFont(new Font("Tahoma", Font.BOLD, 13));
		Player2.setBounds(12, 96, 75, 19);
		
		
		JLabel lblCards = new JLabel("Cards");
		lblCards.setBounds(136, 15, 46, 16);
		
		
		JLabel lblSum = new JLabel("Summary");
		lblSum.setBounds(227, 15, 61, 16);
		
		
		JLabel lblTeamWins = new JLabel("Team Wins");
		lblTeamWins.setBounds(300, 15, 70, 16);
		
		Cards1 = new JTextField();
		Cards1.setBounds(109, 44, 92, 21);		
		Cards1.setColumns(10);
		
		Cards2 = new JTextField();
		Cards2.setBounds(227, 44, 55, 20);		
		Cards2.setColumns(10);
		
		Sum1 = new JTextField();
		Sum1.setBounds(310, 45, 46, 20);
		Sum1.setColumns(10);
		
		Sum2 = new JTextField();
		Sum2.setBounds(109, 96, 92, 21);
		Sum2.setColumns(10);
		
		Wins1 = new JTextField();
		Wins1.setBounds(227, 95, 55, 22);
		Wins1.setColumns(10);
		
		Wins2 = new JTextField();
		Wins2.setBounds(310, 96, 46, 21);
		Wins2.setColumns(10);
		
		btnHit = new JButton("Hit");
		btnHit.setBounds(39, 248, 75, 25);
		
		btnStop = new JButton("Stop");
		btnStop.setBounds(136, 248, 75, 25);
		
		Instructions = new JTextField(turn[0][t.set_Dealer(counter1)].getNickname() + " is the dealer.\nClick Hit to take a card");
		Instructions.setBounds(29, 150, 322, 80);
		Instructions.setColumns(10);
		
		btnEnd = new JButton("End Game");
		btnEnd.setBounds(260, 248, 92, 25);
		
		ButtonListener A = new ButtonListener();
		btnEnd.addActionListener(A);
		btnHit.addActionListener(A);
		btnStop.addActionListener(A);
		
		panel.setLayout(null);
		
		panel.add(Player1);
		panel.add(Player2);
		panel.add(lblCards);
		panel.add(lblSum);
		panel.add(lblTeamWins);
		panel.add(Cards1);
		panel.add(Cards2);
		panel.add(Sum1);
		panel.add(Sum2);
		panel.add(Wins1);
		panel.add(Wins2);
		panel.add(btnHit);
		panel.add(btnStop);
		panel.add(Instructions);
		panel.add(btnEnd);
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(400, 350);
		this.setTitle("Tag Team");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener{
		
		
		public void actionPerformed(ActionEvent e){
			
			if (t.getWinsofTeam1() == t.getNumber_wins()){
				setVisible(false);
				Menu mn = new Menu();
				JOptionPane.showMessageDialog(null,t.getPlayer1().getNickname() + " and " + t.getPlayer2().getNickname() + " WON!", "Team 1 WON" , JOptionPane.INFORMATION_MESSAGE);							
			}
			else if(t.getWinsofTeam2() == t.getNumber_wins()){
				setVisible(false);
				Menu mn = new Menu();
				JOptionPane.showMessageDialog(null,t.getPlayer3().getNickname() + " and " + t.getPlayer4().getNickname() + " WON!", "Team 2 WON" , JOptionPane.INFORMATION_MESSAGE);							
			}
			
			if (e.getSource().equals(btnEnd)){
				Menu mn = new Menu();
				setVisible(false);
			}
			else if (e.getSource().equals(btnStop)){
				if (counter2 == 1){
					Instructions.setText(t.CompareHands(turn[counter1][0], turn[counter1][counter2]).getNickname() + " won the round. Click Hit for next round.");
				}
			}
		}
	}
}
