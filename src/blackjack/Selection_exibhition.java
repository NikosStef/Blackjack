package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class Selection_exibhition extends JFrame{

	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JLabel label1;
	private JLabel label2;
	private JLabel  label;
	private JButton Button1;
	private JButton Button2;
	private JPanel panel;
	private Exibhition ex;
	private Boolean flag;
	private JFrame frame;
	
	public Selection_exibhition(Exibhition ex)
	{
		
		frame = new JFrame();
		panel = new JPanel();
		ImageIcon icon = new ImageIcon("CardTable.jpg");
		label = new JLabel(icon);
		panel.add(label);
		label.setOpaque(true);
		
		flag = false;
		this.ex = ex;
		label1 = new JLabel("Player 1");
		label1.setForeground(Color.WHITE);
		label1.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		label1.setBounds(270, 135, 100, 25);
		label2 = new JLabel("Player 2");
		label2.setForeground(Color.WHITE);
		label2.setFont(new Font("Times New Roman", Font.ITALIC, 20));
		label2.setBounds(470, 135, 100, 25);
	 	Text1 = new JTextField("              ");
	 	Text1.setBounds(250, 180, 100, 30);
	 	Text2 = new JTextField("              ");
	 	Text2.setBounds(450, 180, 100, 30);
	 	Text3 = new JTextField("                                                                ");
	 	Text3.setBounds(250, 280, 300, 30);
	 	Button1 = new JButton("SELECT");
	 	Button1.setBounds(350, 230, 100, 30);
	 	Button2 = new JButton("Start");
		Button2.setBounds(350, 350, 100, 30);
		panel = new JPanel();
		panel.setLayout(null);
	
		label.add(label1);
		label.add(Text1);
		label.add(label2);
		label.add(Text2);
		label.add(Button1);
		label.add(Text3);
		label.add(Button2);
	
	
		ButtonListener listener = new ButtonListener();
		Button1.addActionListener(listener);
		Button2.addActionListener(listener);
		
		frame.add(label);
		frame.setSize(825,570);
		frame.setVisible(true);
		label.setOpaque(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				frame.setVisible(false);
			}
			}
		}
		
	}
	
	
	
	
	
}
