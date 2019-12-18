package blackjack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import blackjack.settings_wins.ButtonListener;

public class settings_money extends JFrame{

	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JTextField Text4;
	private JTextField Text5;
	private JTextField Text6;
	private JTextField Text7;
	private JTextField Text8;
	private JTextField Text9;
	private JLabel labe8;
	private JLabel labe2;
	private JLabel labe3;
	private JLabel labe4;
	private JLabel labe5;
	private JLabel labe6;	
	private JLabel labe7;
	private JLabel labe9;
	private JLabel labe10;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JPanel panel;
	private Money money;
	
	public settings_money(Money m) {
		
		this.money = m;
		Text1 = new JTextField("Give a nickname");
		Text2 = new JTextField("Give a nickname");
		Text3 = new JTextField("Give a nickname");
		Text4 = new JTextField("Give a nickname");
		Text5 = new JTextField("Give a nickname");
		Text6 = new JTextField("Give a nickname");
		Text7 = new JTextField("");
		Text8 = new JTextField("");
		Text9 = new JTextField("");
		this.labe8 = new JLabel("Player1");
		this.labe2 = new JLabel("Player2");
		this.labe3 = new JLabel("Player3");
		this.labe4 = new JLabel("Player4");
		this.labe5 = new JLabel("Player5");
		this.labe6 = new JLabel("Player6");
		this.labe7 = new JLabel("Starting money");
		this.labe10 = new JLabel("Finishing money");
		this.labe9 = new JLabel("Blinds");
		
		this.button1 = new JButton("Enter");
		this.button2 = new JButton("Enter");
		this.button3 = new JButton("Enter");
		this.button4 = new JButton("Enter");
		this.button5 = new JButton("Enter");
		this.button6 = new JButton("Enter");
		this.button7 = new JButton("Enter");
		this.button8 = new JButton("Start");
		this.button9 = new JButton("Cancel");
		this.button10 = new JButton("Enter");
		this.button11 = new JButton("Enter");
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
		panel.add(labe10);
		panel.add(Text9);
		panel.add(button11);
		panel.add(labe9);
		panel.add(Text8);
		panel.add(button10);
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
		button10.addActionListener(listener);
		button11.addActionListener(listener);
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(300, 300);
		this.setTitle("Settings_wins");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	class ButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource().equals(button1))
			{
				if (money.getNumber_players()>=2)
				{
					money.getPlayer1().setNickname(Text1.getText());
				
				}
				else 
					money.getPlayer1().setNickname("No use");
			}
			if (e.getSource().equals(button2))
			{
			if (money.getNumber_players()>=2)
			{
				money.getPlayer2().setNickname(Text2.getText());
			
			}
			else 
				money.getPlayer1().setNickname("No use");
			}
			if (e.getSource().equals(button3))
			{
			if (money.getNumber_players()>=3)
			{
				money.getPlayer3().setNickname(Text3.getText());
				
			}
			else 
				money.getPlayer3().setNickname("No use");
			}
			if (e.getSource().equals(button4))
			{
			if (money.getNumber_players()>=4)
			{
				money.getPlayer4().setNickname(Text4.getText());
			}
			else 
				money.getPlayer4().setNickname("No use");
			}
			if (e.getSource().equals(button5))
			{
			if (money.getNumber_players()>=5)
			{
				money.getPlayer5().setNickname(Text5.getText());
			}
			else 
				money.getPlayer5().setNickname("No use");
			}
			if (e.getSource().equals(button6))
			{
			if (money.getNumber_players()==6)
			{
				money.getPlayer6().setNickname(Text6.getText());
				
			}
			else 
				money.getPlayer6().setNickname("No use");
			
			
			}
			if (e.getSource().equals(button7))
			{
				money.setStart_money(Integer.parseInt(Text7.getText()));
				money.starting_money();
			}
			
			if (e.getSource().equals(button11))
			{
				money.setFinish_money(Integer.parseInt(Text9.getText()));
				
			}
			
			if (e.getSource().equals(button10))
			{
				money.setBlinds(Integer.parseInt(Text8.getText()));
				
			}
			
			if (e.getSource().equals(button8))
			{
				Game_money gm = new Game_money(money);
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