package blackjack;

import java.awt.Component;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private JPanel panel;
	private Tag_Team tag_team = new Tag_Team();
	private JTextField textField;
	
	
	public Settings_Tag_Team() throws HeadlessException {
		
		super();
		Text1 = new JTextField("Give a nickname");
		Text1.setBounds(9, 56, 139, 22);
		Text2 = new JTextField("Give a nickname");
		Text2.setBounds(9, 96, 139, 22);
		Text3 = new JTextField("Give a nickname");
		Text3.setBounds(9, 165, 139, 22);
		Text4 = new JTextField("Give a nickname");
		Text4.setBounds(9, 203, 139, 22);
		this.Team1 = new JLabel("Team 1");
		Team1.setFont(new Font("Tahoma", Font.BOLD, 15));
		Team1.setBounds(78, 13, 63, 16);
		this.Team2 = new JLabel("Team 2");
		Team2.setFont(new Font("Tahoma", Font.BOLD, 15));
		Team2.setBounds(78, 131, 63, 16);
		this.label2 = new JLabel("Player2");
		label2.setBounds(9, 78, 57, 16);
		this.label3 = new JLabel("Player3");
		label3.setBounds(9, 146, 57, 16);
		this.label4 = new JLabel("Player4");
		label4.setBounds(11, 186, 55, 16);
		this.button1 = new JButton("Enter");
		button1.setBounds(160, 55, 80, 25);
		this.button2 = new JButton("Enter");
		button2.setBounds(160, 95, 80, 25);
		this.button3 = new JButton("Enter");
		button3.setBounds(160, 164, 80, 25);
		this.button4 = new JButton("Enter");
		button4.setBounds(160, 202, 80, 25);
		btnStart = new JButton("Start");
		btnStart.setBounds(66, 265, 97, 25);


		this.panel = new JPanel();
		panel.setLayout(null);
		
		panel.add(Team1);
		panel.add(Text1);
		this.label1 = new JLabel("Player1");
		label1.setBounds(9, 38, 57, 16);
		panel.add(label1);
		panel.add(button1);
		panel.add(label2);
		panel.add(Text2);
		panel.add(button2);
		panel.add(Team2);
		panel.add(label3);
		panel.add(Text3);
		panel.add(button3);
		panel.add(label4);
		panel.add(Text4);
		panel.add(button4);
		panel.add(btnStart);
		
		ButtonListener B = new ButtonListener();
		button1.addActionListener(B);
		button2.addActionListener(B);
		button3.addActionListener(B);
		button4.addActionListener(B);
		btnStart.addActionListener(B);
		
		setContentPane(panel);		
		
		JLabel lblNumberOfWins = new JLabel("Number of Wins");
		lblNumberOfWins.setBounds(9, 238, 97, 16);
		panel.add(lblNumberOfWins);
		
		textField = new JTextField();
		textField.setBounds(108, 238, 38, 22);
		panel.add(textField);
		textField.setColumns(10);
		
		btnEnter = new JButton("Enter");
		btnEnter.setBounds(160, 234, 80, 25);
		btnEnter.addActionListener(B);
		panel.add(btnEnter);
		this.setVisible(true);
		this.setSize(270, 350);
		this.setTitle("Settings");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
					setVisible(false);
				}
			}
			else
				JOptionPane.showMessageDialog(panel, "Please write the nicknames of the players and the number of wins, then click Enter." , "Error", JOptionPane.INFORMATION_MESSAGE);
			
		}
	}
}
