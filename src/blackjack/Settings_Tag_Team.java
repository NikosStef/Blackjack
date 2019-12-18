package blackjack;

import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import blackjack.settings_wins.ButtonListener;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Font;

public class Settings_Tag_Team extends JFrame{
	
	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JTextField Text4;
	private JLabel Team1;
	private JLabel label1;
	private JLabel label2;
	private JLabel Team2;
	private JLabel label3;
	private JLabel label4;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton btnEnter = new JButton();
	private JButton btnStart;
	private Tag_Team tag_team = new Tag_Team();
	private JTextField textField;
	private JFrame frame;
	private ImageIcon icon;
	private JLabel label;
	
	
	public Settings_Tag_Team() throws HeadlessException {
		
		frame = new JFrame();
		icon = new ImageIcon("CardTable.jpg");
		label = new JLabel(icon);
		
		label.setOpaque(true);
		
		Text1 = new JTextField("Give a nickname");
		Text1.setBounds(280, 100, 139, 30);
		Text2 = new JTextField("Give a nickname");
		Text2.setBounds(280, 150, 139, 30);
		Text3 = new JTextField("Give a nickname");
		Text3.setBounds(280, 300, 139, 30);
		Text4 = new JTextField("Give a nickname");
		Text4.setBounds(280, 350, 139, 30);
		
		this.Team1 = new JLabel("Team 1");
		Team1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Team1.setBounds(381, 50, 63, 16);
		Team1.setForeground(Color.WHITE);
		this.Team2 = new JLabel("Team 2");
		Team2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Team2.setForeground(Color.WHITE);
		Team2.setBounds(381, 230, 63, 16);
		
		this.label1 = new JLabel("Player1");
		label1.setForeground(Color.WHITE);
		label1.setBounds(280, 80, 57, 16);
		this.label2 = new JLabel("Player2");
		label2.setForeground(Color.WHITE);
		label2.setBounds(280, 130, 57, 16);
		this.label3 = new JLabel("Player3");
		label3.setForeground(Color.WHITE);
		label3.setBounds(280, 280, 57, 16);
		this.label4 = new JLabel("Player4");
		label4.setForeground(Color.WHITE);
		label4.setBounds(280, 330, 55, 16);
		
		this.button1 = new JButton("Enter");
		button1.setBounds(439, 100, 80, 30);
		this.button2 = new JButton("Enter");
		button2.setBounds(439, 150, 80, 30);
		this.button3 = new JButton("Enter");
		button3.setBounds(439, 300, 80, 30);
		this.button4 = new JButton("Enter");
		button4.setBounds(439, 350, 80, 30);
		btnStart = new JButton("Start");
		btnStart.setBounds(364, 450, 97, 30);



		label.setLayout(null);
		
		label.add(Team1);
		label.add(Text1);
		
		label.add(label1);
		label.add(button1);
		label.add(label2);
		label.add(Text2);
		label.add(button2);
		label.add(Team2);
		label.add(label3);
		label.add(Text3);
		label.add(button3);
		label.add(label4);
		label.add(Text4);
		label.add(button4);
		label.add(btnStart);
		
		ButtonListener B = new ButtonListener();
		button1.addActionListener(B);
		button2.addActionListener(B);
		button3.addActionListener(B);
		button4.addActionListener(B);
		btnStart.addActionListener(B);
		
			
		
		JLabel lblNumberOfWins = new JLabel("Number of Wins");
		lblNumberOfWins.setBounds(280, 400, 97, 30);
		lblNumberOfWins.setForeground(Color.WHITE);
		label.add(lblNumberOfWins);
		
		textField = new JTextField();
		textField.setBounds(390, 400, 38, 30);
		label.add(textField);
		textField.setColumns(10);
		
		btnEnter = new JButton("Enter");
		btnEnter.setBounds(440, 400, 80, 30);
		btnEnter.addActionListener(B);
		label.add(btnEnter);
		
		frame.add(label);
		frame.setSize(825,570);
		frame.setVisible(true);
		label.setOpaque(true);
		frame.setTitle("Exibhition Settings");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener{
		
		int flag[] = {0,0,0,0,0};
		
		public void actionPerformed(ActionEvent e){
			if (e.getSource().equals(button1)){
				tag_team.getPlayer1().setNickname(Text1.getText());
				flag[0] = 1;
			}
			else if(e.getSource().equals(button2)){
				tag_team.getPlayer2().setNickname(Text2.getText());
				flag[1] = 1;
			}
			else if(e.getSource().equals(button3)){
				tag_team.getPlayer3().setNickname(Text3.getText());
				flag[2] = 1;
			}
			else if(e.getSource().equals(button4)){
				tag_team.getPlayer4().setNickname(Text4.getText());
				flag[3] = 1;
			}
			else if (e.getSource().equals(btnEnter)){
				tag_team.setNumber_wins(Integer.parseInt(textField.getText()));
				flag[4] = 1;
			}
			else if (flag[0]==1 && flag[1] == 1 && flag[2] == 1 && flag[3] == 1 && flag[4] == 1){
				if(e.getSource().equals(btnStart)){
					Game_Tag_Team g = new Game_Tag_Team(tag_team);
					frame.setVisible(false);
				}
			}
			else
				JOptionPane.showMessageDialog(label, "Please write the nicknames of the players and the number of wins, then click Enter." , "Error", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
}
