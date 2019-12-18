//Εμφανιζει ενα μηνυμα ο χρηστης να δωσει τον αριθμο των παιχτων που θα παιξουν και επειτα τον αποθηκεθευει.
//Tελος εμφανιζει την οθονη settings_money.
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
	private JLabel label1;
	private JFrame frame;
	private ImageIcon icon;
	
	
	public numberofplayers_money()
	{
		frame = new JFrame();
		icon = new ImageIcon("CardTable.jpg");
		label1 = new JLabel(icon);
		
		label1.setOpaque(true);
		
		flag = true;
		this.Dealer = new Player();
		this.player1 = new Player();
		this.player2 = new Player();
		this.player3 = new Player();
		this.player4 = new Player();
		this.player5 = new Player();
		this.player6 = new Player();
		label = new JLabel("Number of Players");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		label.setBounds(310, 130, 300, 30);
		button1 = new JButton("Enter");
		button1.setBounds(300, 270, 100, 30);
		button2 = new JButton("Next");
		button2.setBounds(420, 270, 100, 30);
		text1 = new JTextField("");
		text1.setBounds(250, 200, 300, 30);
		label.setLayout(null);
		
		label1.add(label);
		label1.add(text1);
		label1.add(button1);
		label1.add(button2);
		
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		frame.add(label1);
		frame.setSize(825,570);
		frame.setVisible(true);
		frame.setTitle("Number Of players Money");
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
					frame.setVisible(false);
				}
				}
			}
			
		}
		
	}

}