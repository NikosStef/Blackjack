package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class winner extends JFrame{
	
	private JLabel label1;
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	
	public winner(Player pl)
	{
		
		label1 = new JLabel(pl.getNickname() + " wins");
		button1 = new JButton("Menu");
		button2 = new JButton("Cancel");
		panel = new JPanel();
		
		panel.add(label1);
		panel.add(button1);
		panel.add(button2);
		
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(300, 200);
		this.setTitle("Winner");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	class ButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
		
			if (e.getSource().equals(button1))
			{
				Menu menu = new Menu();
				setVisible(false);
				
			}
			else 
			{
				setVisible(false);
			}
			
		}
		
	}
}
