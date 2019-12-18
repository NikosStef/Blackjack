package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class numberofplayers_money extends JFrame{
	
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
	private Money money;
	private Boolean flag;
	
	public numberofplayers_money()
	{
		flag = true;
		this.Dealer = new Player();
		this.player1 = new Player();
		this.player2 = new Player();
		this.player3 = new Player();
		this.player4 = new Player();
		this.player5 = new Player();
		this.player6 = new Player();
		label = new JLabel("Number of Players");
		label.setBounds(29, 35, 105, 16);
		button1 = new JButton("Enter");
		button1.setBounds(59, 79, 63, 25);
		button2 = new JButton("Next");
		button2.setBounds(169, 79, 57, 25);
		text1 = new JTextField("");
		text1.setBounds(146, 32, 73, 22);
		panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(label);
		panel.add(text1);
		panel.add(button1);
		panel.add(button2);
		
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(300, 200);
		this.setTitle("Number of players");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
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
					 money = new Money(player1,player2,player3,player4,player5,player6,Dealer,i);
					 flag = false;
					}
					else
						text1.setText("The number of players must be between 2 and 6!");
				}
				else 
				{
					if (flag == false)
					{
					settings_money m = new settings_money(money);
					setVisible(false);
				}
				}
			}
			
		}
		
	}

}