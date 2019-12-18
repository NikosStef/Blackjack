/* Εμφανιζεται μια οθονη οπου εμφανιζει μηνυματα και ζηταει απο τον χρηστη να δωσει το nickname για τον καθε παιχτη και τον αριθμο 
 * των νικων που χρειαζεται ενας παικτες για να νικησει τα καταχωρει και επειτα εμφανιζει την οθονη selection_exhibition.
*/
package blackjack;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Settings_exibhitions extends JFrame {
	
	private JTextField Text1; // Το πεδίο για το πρώτο  nickname
	private JTextField Text2; // Το πεδίο για τοδεύτερο  nickname
	private JTextField Text3; // Το πεδίο για τον καθορισμό των νικών
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label;
	private JPanel panel;
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;
	private Player player1;
	private Player player2;
	private int wins = 0;
	private JFrame frame;
	private ImageIcon icon;
	
	public Settings_exibhitions()
	{
		frame = new JFrame();
		icon = new ImageIcon("CardTable.jpg");
		label = new JLabel(icon);
		
		label.setOpaque(true);
			
		player1 = new Player();
		player2 = new Player();
	
		Text1 = new JTextField("Give a nickname");
		Text1.setBounds(310, 130, 150, 30);
		Text2 = new JTextField("Give a nickname");
		Text2.setBounds(310, 230, 150, 30);
		Text3 = new JTextField("");
		Text3.setBounds(355, 330, 60, 30);
		Button1 = new JButton("ENTER");
		Button1.setBounds(500, 130, 100, 30);
		Button2 = new JButton("ENTER");
		Button2.setBounds(500, 230, 100, 30);
		Button3 = new JButton("ENTER");
		Button3.setBounds(500, 330, 100, 30);
		Button4 = new JButton("START");
		Button4.setBounds(260, 410, 100, 30);
		Button5 = new JButton("BACK");
		Button5.setBounds(410, 410, 100, 30);
		 label1 = new JLabel("Player 1");
	     label1.setForeground(Color.WHITE);
		 label1.setBounds(250, 135, 50, 20);
		 label2 = new JLabel("Player 2");
		 label2.setForeground(Color.WHITE);
		 label2.setBounds(250, 235, 135, 16);
		 label3 = new JLabel("Number of wins");
		 label3.setBounds(250, 335, 90, 16);
		 label3.setForeground(Color.WHITE);
		 label.setLayout(null);
		
		label.add(label1);
		label.add(Text1);
		label.add(Button1);
		label.add(label2);
		label.add(Text2);
		label.add(Button2);
		label.add(label3);
		label.add(Text3);
		label.add(Button3);
		label.add(Button4);
		label.add(Button5);
		
	
		ButtonListener listener = new ButtonListener();
		Button1.addActionListener(listener);
		Button2.addActionListener(listener);
		Button3.addActionListener(listener);
		Button4.addActionListener(listener);
		Button5.addActionListener(listener);
		
		frame.add(label);
		frame.setSize(825,570);
		frame.setVisible(true);
		label.setOpaque(true);
		frame.setTitle("Exibhition Settings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class ButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource().equals(Button1))
			{
						player1.setNickname(Text1.getText());
			}
			
			if (e.getSource().equals(Button2))
			{
			
				player2.setNickname(Text2.getText());
			}
			
			if (e.getSource().equals(Button3))
			{
			
			String a = Text3.getText();
			wins = Integer.parseInt(a);
	
			
			}
			
			if (e.getSource().equals(Button4))
			{
				Exibhition game = new Exibhition(wins,player1,player2);
				Selection_exibhition se = new Selection_exibhition(game);
				frame.setVisible(false);
			}
			
			if (e.getSource().equals(Button5))
			{
				Menu mn = new Menu();
				frame.setVisible(false);
			}
				
		}
		
	}
	
	
}