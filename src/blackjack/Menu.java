/*Ειναι η αρχικη οθονη και εμφανιζει ολα τα mode και τα rules και αμα επιλεξει το exibhition η το tag team εμφανιζει την οθονη με τα 
 *αντισοιχα settings η αμα επιλεξει τα υπολοιπα 2 mode θα εμφανισει της οθονες με τα αντοιστοιχα settings τελος αμα επιλεξει το rules 
 *θα εμφανισει την οθονη .*/
package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.LayoutManager;

public class Menu extends JFrame {

	
	private JButton Button1;//
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JButton Button5;
	private JPanel panel;
	private JLabel label;
	private JFrame frame;
	
	public Menu()
	{
	
		panel = new JPanel();
		ImageIcon icon = new ImageIcon("the-best-blackjack-betting-strategy.jpg");
		label = new JLabel(icon);
		panel.add(label);
		label.setOpaque(true);

		
		Button1 = new JButton("Exibhition");
		Button1.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		Button1.setBounds(100, 250, 100, 30);
		Button2 = new JButton("Wins");
		Button2.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		Button2.setBounds(100, 325, 100, 30);
		Button3 = new JButton("Money");
		Button3.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		Button3.setBounds(100, 400, 100, 30);
		Button4 = new JButton("Tag Team");
		Button4.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		Button4.setBounds(100, 475, 100, 30);
		Button5 = new JButton("Rules");
		Button5.setFont(new Font("Times New Roman", Font.ITALIC, 15));
		Button5.setBounds(250, 365, 100, 30);
		
		
			
		label.add(Button1);
		label.add(Button2);
		label.add(Button3);
		label.add(Button4);
		label.add(Button5);
		
		 
		
		ButtonListener listener = new ButtonListener();
		Button1.addActionListener(listener);
		Button2.addActionListener(listener);
		Button3.addActionListener(listener);
		Button4.addActionListener(listener);
		Button5.addActionListener(listener);
		
		
		frame = new JFrame();
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setTitle("BlackJack Menu");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	class ButtonListener implements ActionListener
	{

		
		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource().equals(Button1))
			{
				Settings_exibhitions ex = new Settings_exibhitions();
				frame.setVisible(false);
				
			}
			
			if (e.getSource().equals(Button2))
			{
				numberofplayers_wins nb = new numberofplayers_wins();
				frame.setVisible(false);
				
				
			}
			
			if (e.getSource().equals(Button3))
			{
				numberofplayers_money nm = new numberofplayers_money();
				frame.setVisible(false);
			}
			if (e.getSource().equals(Button4)){
				
				Settings_Tag_Team stt = new Settings_Tag_Team();
				frame.setVisible(false);
				
			}
			if (e.getSource().equals(Button5)){
				frame.setVisible(false);
				new Rules();
			}
		}
		
	}
}
