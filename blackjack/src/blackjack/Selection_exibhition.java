package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class Selection_exibhition extends JFrame{

	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JLabel label1;
	private JLabel label2;
	private JButton Button1;
	private JButton Button2;
	private JPanel panel;
	private Exibhition ex;
	private Boolean flag;
	
	public Selection_exibhition(Exibhition ex)
	{
		flag = false;
	this.ex = ex;
	 label1 = new JLabel("player1");
	 label1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	 label1.setBounds(65, 10, 54, 28);
	 label2 = new JLabel("player2");
	 label2.setFont(new Font("Tahoma", Font.PLAIN, 15));
	 label2.setBounds(197, 10, 67, 28);
	 Text1 = new JTextField("            ");
	 Text1.setBounds(65, 51, 54, 22);
	 Text2 = new JTextField("            ");
	 Text2.setBounds(197, 51, 54, 22);
	 Text3 = new JTextField("                                                             ");
	 Text3.setBounds(23, 127, 250, 22);
	 Button1 = new JButton("SELECT");
	 Button1.setBounds(106, 89, 89, 25);
	Button2 = new JButton("Start");
	Button2.setBounds(118, 162, 61, 25);
	panel = new JPanel();
	panel.setLayout(null);
	
	panel.add(label1);
	panel.add(Text1);
	panel.add(label2);
	panel.add(Text2);
	panel.add(Button1);
	panel.add(Text3);
	panel.add(Button2);
	
	
	ButtonListener listener = new ButtonListener();
	Button1.addActionListener(listener);
	Button2.addActionListener(listener);
	
	setContentPane(panel);
	this.setVisible(true);
	this.setSize(333, 259);
	this.setTitle("Who starts");
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class ButtonListener implements ActionListener
	{


		public void actionPerformed(ActionEvent e) {
			
			
			if (e.getSource().equals(Button1))
			{
			
				if (flag == false)
				{
				ex.getPlayer1().getNumber();
				ex.getPlayer2().getNumber();
			String player1_random_number = Integer.toString(ex.getPlayer1().getRandom_number()); 
			String player2_random_number = Integer.toString(ex.getPlayer2().getRandom_number()); 
				Text1.setText( player1_random_number);
				Text2.setText( player2_random_number);
				flag = true;
				if (ex.getPlayer1().getRandom_number()==ex.getPlayer2().getRandom_number())
				{
					Text3.setText("is equel press again 'select'");
					flag = false;
				}
				
				if(ex.getPlayer1().getRandom_number()>ex.getPlayer2().getRandom_number())
				{
					Text3.setText("Player1 is the dealer in first round");
				}
				
				if(ex.getPlayer1().getRandom_number()<ex.getPlayer2().getRandom_number())
				{
					Text3.setText("Player2 is the dealer in first round");
				}
				
				}
			}
			
			
			if (e.getSource().equals(Button2))
			{
				if (ex.getPlayer1().getRandom_number()!=ex.getPlayer2().getRandom_number())
				{
				Game_exibhition game = new Game_exibhition(ex);
				setVisible(false);
			}
			}
		}
		
	}
	
	
	
	
	
}
