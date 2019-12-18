//Εμφανιζει ενα μηνυμα ο χρηστης να δωσει τον αριθμο των παιχτων που θα παιξουν και επειτα τον αποθηκεθευει.
//Tελος εμφανιζει την οθονη sertings_wins.

package blackjack;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class numberofplayers_wins extends JFrame{
	
	private JLabel label1;
	private JLabel label;
	private JButton button1;
	private JButton button2;
	private JTextField text1;
	private JPanel panel;
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	private Player player5;
	private Player player6;
	private Player Dealer;
	private Wins win;
	private Boolean flag;
	private ImageIcon icon;
	private JFrame frame;
	
	public numberofplayers_wins()
	{
		frame = new JFrame();
		icon = new ImageIcon("CardTable.jpg");
		label = new JLabel(icon);
		
		
		flag = true;
		this.Dealer = new Player();
		this.player1 = new Player();
		this.player2 = new Player();
		this.player3 = new Player();
		this.player4 = new Player();
		this.player5 = new Player();
		this.player6 = new Player();
		this.label1 = new JLabel(" Number Of Players ");
	    label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		label1.setBounds(310, 130, 300, 30);
		button1 = new JButton("Enter");
		button1.setBounds(300, 270, 100, 30);
		button2 = new JButton("Next");
		button2.setBounds(420, 270, 100, 30);
		text1 = new JTextField("Up to 6 players");
		text1.setBounds(250, 200, 300, 30);
		
		label1.setLayout(null);
		
		label.add(label1);
		label.add(text1);
		label.add(button1);
		label.add(button2);
		
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		frame.add(label);
		frame.setSize(825,570);
		frame.setVisible(true);
		label.setOpaque(true);
		frame.setTitle("Number Of players Wins");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	

	
	
	class ButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
			{
				
				if (e.getSource().equals(button1))
				{
					if (Integer.parseInt(text1.getText())>1 && Integer.parseInt(text1.getText())<7)
					{
					int i = Integer.parseInt(text1.getText());
					 win = new Wins(player1,player2,player3,player4,player5,player6,Dealer,i,0);
					 flag = false;
					}
					else
						text1.setText("The number of players must be between 2 and 6!");
				}
				else 
				{
					if (flag == false)
					{
					settings_wins w = new settings_wins(win);
					frame.setVisible(false);
				}
				}
			}
			
		}
		
	}

}
