package blackjack;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class settings_wins extends JFrame{
	
	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JTextField Text4;
	private JTextField Text5;
	private JTextField Text6;
	private JTextField Text7;
	private JLabel label;
	private JLabel label8;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;	
	private JLabel label7;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JFrame frame;
	private Wins win;
	private ImageIcon icon;
	
	public settings_wins(Wins w) {
		
		frame = new JFrame();
		icon = new ImageIcon("CardTable.jpg");
		label = new JLabel(icon);
		
		
		this.win = w;
		Text1 = new JTextField("Give a nickname");
		Text1.setBounds(100, 30, 150, 30);
		Text2 = new JTextField("Give a nickname");
		Text2.setBounds(100, 100, 150, 30);
		Text3 = new JTextField("Give a nickname");
		Text3.setBounds(100, 170, 150, 30);
		Text4 = new JTextField("Give a nickname");
		Text4.setBounds(100, 240, 150, 30);
		Text5 = new JTextField("Give a nickname");
		Text5.setBounds(100, 310, 150, 30);
		Text6 = new JTextField("Give a nickname");
		Text6.setBounds(100, 380, 150, 30);
		Text7 = new JTextField("");
		Text7.setBounds(550, 170, 100, 30);
		this.label8 = new JLabel("Player1");
		label8.setForeground(Color.WHITE);
		label8.setFont(new Font("Tahoma", Font.BOLD, 15));
		label8.setBounds(30, 30, 100, 30);
		this.label2 = new JLabel("Player2");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Tahoma", Font.BOLD, 15));
		label2.setBounds(30, 100, 100, 30);
		this.label3 = new JLabel("Player3");
		label3.setForeground(Color.WHITE);
		label3.setFont(new Font("Tahoma", Font.BOLD, 15));
		label3.setBounds(30, 170, 100, 30);
		this.label4 = new JLabel("Player4");
		label4.setForeground(Color.WHITE);
		label4.setFont(new Font("Tahoma", Font.BOLD, 15));
		label4.setBounds(30, 240, 100, 30);
		this.label5 = new JLabel("Player5");
		label5.setForeground(Color.WHITE);
		label5.setFont(new Font("Tahoma", Font.BOLD, 15));
		label5.setBounds(30, 310, 100, 30);
		this.label6 = new JLabel("Player6");
		label6.setForeground(Color.WHITE);
		label6.setFont(new Font("Tahoma", Font.BOLD, 15));
		label6.setBounds(30, 380, 100, 30);
		this.label7 = new JLabel("Amount of wins");
		label7.setForeground(Color.WHITE);
		label7.setFont(new Font("Tahoma", Font.BOLD, 15));
		label7.setBounds(550, 140, 200, 30);
		this.button1 = new JButton("Enter");
		button1.setBounds(300, 30, 100, 30);
		this.button2 = new JButton("Enter");
		button2.setBounds(300, 100, 100, 30);
		this.button3 = new JButton("Enter");
		button3.setBounds(300, 170, 100, 30);
		this.button4 = new JButton("Enter");
		button4.setBounds(300, 240, 100, 30);
		this.button5 = new JButton("Enter");
		button5.setBounds(300, 310, 100, 30);
		this.button6 = new JButton("Enter");
		button6.setBounds(300, 380, 100, 30);
		this.button7 = new JButton("Enter");
		button7.setBounds(670, 170, 100, 30);
		this.button8 = new JButton("Start");
		button8.setBounds(570, 250, 100, 30);
		this.button9 = new JButton("Cancel");
		button9.setBounds(570, 330, 100, 30);
		
		
		
		label.add(label8);
		label.add(Text1);
		label.add(button1);
		label.add(label2);
		label.add(Text2);
		label.add(button2);
		label.add(label3);
		label.add(Text3);
		label.add(button3);
		label.add(label4);
		label.add(Text4);
		label.add(button4);
		label.add(label5);
		label.add(Text5);
		label.add(button5);
		label.add(label6);
		label.add(Text6);
		label.add(button6);
		label.add(label7);
		label.add(Text7);
		label.add(button7);
		label.add(button8);
		label.add(button9);
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
		button7.addActionListener(listener);
		button8.addActionListener(listener);
		button9.addActionListener(listener);
		
		
		frame.add(label);
		frame.setSize(825,570);
		frame.setVisible(true);
		label.setOpaque(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	class ButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource().equals(button1))
				if (win.getNumber_players()>=2)
				{
					win.getPlayer1().setNickname(Text1.getText());
				
				}
				else 
					win.getPlayer1().setNickname("No use");
			
			if (e.getSource().equals(button2))
			if (win.getNumber_players()>=2)
			{
				win.getPlayer2().setNickname(Text2.getText());
			
			}
			else 
				win.getPlayer1().setNickname("No use");
			
			if (e.getSource().equals(button3))
			if (win.getNumber_players()>=3)
			{
				win.getPlayer3().setNickname(Text3.getText());
				
			}
			else 
				win.getPlayer3().setNickname("No use");
			
			if (e.getSource().equals(button4))
			if (win.getNumber_players()>=4)
			{
				win.getPlayer4().setNickname(Text4.getText());
			}
			else 
				win.getPlayer4().setNickname("No use");
			
			if (e.getSource().equals(button5))
			if (win.getNumber_players()>=5)
			{
				win.getPlayer5().setNickname(Text5.getText());
			}
			else 
				win.getPlayer5().setNickname("No use");
			
			if (e.getSource().equals(button6))
			if (win.getNumber_players()==6)
			{
				win.getPlayer6().setNickname(Text6.getText());
				
			}
			else 
				win.getPlayer6().setNickname("No use");
			
			
			
			if (e.getSource().equals(button7))
			{
				win.setNumber_wins(Integer.parseInt(Text7.getText()));
			}
			
			
			
			
			if (e.getSource().equals(button8))
			{
				Game_wins gm = new Game_wins(win);
				frame.setVisible(false);
			}
			
			if (e.getSource().equals(button9))
			{
				Menu menu = new Menu();
				frame.setVisible(false);
			}
			
		}
		
	}
	

}
