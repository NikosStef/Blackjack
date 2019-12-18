package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Menu extends JFrame {

	
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;
	private JPanel panel;
	
	public Menu()
	{
		setForeground(Color.GRAY);
		Button1 = new JButton("Exibhition");
		Button1.setBounds(27, 13, 87, 25);
		Button2 = new JButton("Wins");
		Button2.setBounds(37, 63, 61, 25);
		Button3 = new JButton("Money");
		Button3.setBounds(151, 13, 69, 25);
		Button4 = new JButton("Tag Team");
		Button4.setBounds(139, 63, 91, 25);
		Button5 = new JButton("Rules");
		Button5.setBounds(95, 115, 63, 25);
		panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(Button1);
		panel.add(Button2);
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
		this.setSize(300, 200);
		this.setTitle("Menu");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	class ButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource().equals(Button1))
			{
				Settings_exibhitions a = new Settings_exibhitions();
				setVisible(false);
			}
			
			if (e.getSource().equals(Button2))
			{
				numberofplayers_wins nb = new numberofplayers_wins();
				setVisible(false);
			}
			
			if (e.getSource().equals(Button3))
			{
				numberofplayers_money nm = new numberofplayers_money();
				setVisible(false);
			}
			if (e.getSource().equals(Button4)){
				
				Settings_Tag_Team stt = new Settings_Tag_Team();
				setVisible(false);
				
			}
		}
		
	}
}
