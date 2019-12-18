package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Settings_exibhitions extends JFrame {
	
	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JPanel panel;
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;
	private Player player1;
	private Player player2;
	private int wins = 0;
	
	public Settings_exibhitions()
	{
		player1 = new Player();
		player2 = new Player();
	
		Text1 = new JTextField("Give a nickname");
		Text1.setBounds(64, 24, 121, 22);
		Text2 = new JTextField("Give a nickname");
		Text2.setBounds(64, 62, 120, 22);
		Text3 = new JTextField("");
		Text3.setBounds(128, 109, 56, 22);
		panel = new JPanel();
		Button1 = new JButton("ENTER");
		Button1.setBounds(207, 23, 71, 25);
		Button2 = new JButton("ENTER");
		Button2.setBounds(207, 61, 71, 25);
		Button3 = new JButton("ENTER");
		Button3.setBounds(207, 108, 71, 25);
		Button4 = new JButton("START");
		Button4.setBounds(76, 146, 73, 25);
		Button5 = new JButton("BACK");
		Button5.setBounds(171, 146, 63, 25);
		 label1 = new JLabel("player1");
		 label1.setBounds(5, 27, 42, 16);
		 label2 = new JLabel("player2");
		 label2.setBounds(5, 65, 42, 16);
		 label3 = new JLabel("Number of wins");
		 label3.setBounds(12, 112, 90, 16);
		panel.setLayout(null);
		
		
		panel.add(label1);
		panel.add(Text1);
		panel.add(Button1);
		panel.add(label2);
		panel.add(Text2);
		panel.add(Button2);
		panel.add(label3);
		panel.add(Text3);
		panel.add(Button3);
		panel.add(Button4);
		panel.add(Button5);
		
		
		ButtonListener listener = new ButtonListener();
		Button1.addActionListener(listener);
		Button2.addActionListener(listener);
		Button3.addActionListener(listener);
		Button4.addActionListener(listener);
		Button5.addActionListener(listener);
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(320, 231);
		this.setTitle("Settings");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				setVisible(false);
			}
			
			if (e.getSource().equals(Button5))
			{
				Menu mn = new Menu();
				setVisible(false);
			}
				
		}
		
	}
	
	
}