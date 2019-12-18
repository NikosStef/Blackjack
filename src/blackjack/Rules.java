package blackjack;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame {

	 private JPanel panel = new JPanel();
	private JButton BackButton;
	private JButton ExhibitionButton;
	private JButton MoneyButton;
	private JButton WinsButton;
	private JButton TagTeamButton;
	private JScrollPane scrollPane;
	private JLabel myLabel;
	private JLabel label;
	private JFrame frame;
	private ImageIcon icon;
	
	
	
	
	
	public Rules(){
		
	frame = new JFrame();
	icon = new ImageIcon("CardTable.jpg");
	label = new JLabel(icon);
		
	label.setOpaque(true);
		
		
	BackButton = new JButton("Back to login screen");
	BackButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));
	BackButton.setBounds(270, 100, 300, 30);
	ExhibitionButton = new JButton("Exhibition");
	ExhibitionButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));
	//ExhibitionButton.setBackground(Color.WHITE);
	ExhibitionButton.setBounds(150, 200, 200, 30);
	MoneyButton = new JButton("Money");
	MoneyButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));
	MoneyButton.setBounds(450, 200, 200, 30);
	WinsButton = new JButton("Wins");
	WinsButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));
	WinsButton.setBounds(150, 350, 200, 30);
	TagTeamButton = new JButton("Tag Team");
	TagTeamButton.setFont(new Font("Times New Roman", Font.ITALIC, 15));
	TagTeamButton.setBounds(450, 350, 200, 30);
	
	myLabel=new JLabel("Choose a mode");
	myLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
	myLabel.setForeground(Color.WHITE);
	myLabel.setBounds(340, 135, 300, 30);
	
	
	
	label.add(BackButton);
	
	label.add(myLabel);
	
	label.add(ExhibitionButton);
	label.add(MoneyButton);
	label.add(WinsButton);
	label.add(TagTeamButton);
	
	
	this.setContentPane(label);
	
	ButtonListener listener = new ButtonListener();
	BackButton.addActionListener(listener);
	ExhibitionButton.addActionListener(listener);
	MoneyButton.addActionListener(listener);
	WinsButton.addActionListener(listener);
	TagTeamButton.addActionListener(listener);
	
	frame.add(label);
	frame.setSize(825,570);
	frame.setVisible(true);
	label.setOpaque(true);
	frame.setTitle("Rules");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
	

	class ButtonListener implements ActionListener{

		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource().equals(BackButton))
			{
				frame.setVisible(false);
				new Menu();
			}
			else if(e.getSource().equals(ExhibitionButton) )
			{
				String file= new String("Exhibition.txt");
				frame.setVisible(false);
				 new Serialization(file);
			}
			else if(e.getSource().equals(MoneyButton) )
			{
				frame.setVisible(false);
				String file= new String("Money.txt");
				 new Serialization(file);
			}
			else if(e.getSource().equals(WinsButton) )
			{
				frame.setVisible(false);
				String file= new String("Wins.txt");
				new Serialization(file);
			}
			else
			{
				frame.setVisible(false);
				String file= new String("TagTeam.txt");
				 new Serialization(file);
			}
				
		}
		



}}
