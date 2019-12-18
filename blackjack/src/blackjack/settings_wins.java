package blackjack;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JLabel labe8;
	private JLabel labe2;
	private JLabel labe3;
	private JLabel labe4;
	private JLabel labe5;
	private JLabel labe6;	
	private JLabel labe7;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JPanel panel;
	private Wins win;
	
	public settings_wins(Wins w) {
		
		this.win = w;
		Text1 = new JTextField("Give a nickname");
		Text2 = new JTextField("Give a nickname");
		Text3 = new JTextField("Give a nickname");
		Text4 = new JTextField("Give a nickname");
		Text5 = new JTextField("Give a nickname");
		Text6 = new JTextField("Give a nickname");
		Text7 = new JTextField("");
		this.labe8 = new JLabel("Player1");
		this.labe2 = new JLabel("Player2");
		this.labe3 = new JLabel("Player3");
		this.labe4 = new JLabel("Player4");
		this.labe5 = new JLabel("Player5");
		this.labe6 = new JLabel("Player6");
		this.labe7 = new JLabel("Amount of wins");
		this.button1 = new JButton("Enter");
		this.button2 = new JButton("Enter");
		this.button3 = new JButton("Enter");
		this.button4 = new JButton("Enter");
		this.button5 = new JButton("Enter");
		this.button6 = new JButton("Enter");
		this.button7 = new JButton("Enter");
		this.button8 = new JButton("Start");
		this.button9 = new JButton("Cancel");
		panel = new JPanel();
		
		
		panel.add(labe8);
		panel.add(Text1);
		panel.add(button1);
		panel.add(labe2);
		panel.add(Text2);
		panel.add(button2);
		panel.add(labe3);
		panel.add(Text3);
		panel.add(button3);
		panel.add(labe4);
		panel.add(Text4);
		panel.add(button4);
		panel.add(labe5);
		panel.add(Text5);
		panel.add(button5);
		panel.add(labe6);
		panel.add(Text6);
		panel.add(button6);
		panel.add(labe7);
		panel.add(Text7);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		
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
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(250, 300);
		this.setTitle("Settings_wins");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				setVisible(false);
			}
			
			if (e.getSource().equals(button9))
			{
				Menu menu = new Menu();
				setVisible(false);
			}
			
		}
		
	}
	

}
