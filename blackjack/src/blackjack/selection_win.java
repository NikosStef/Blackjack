package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class selection_win extends JFrame{

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JTextField Text4;
	private JTextField Text5;
	private JTextField Text6;
	private JTextField Text7;
	private JButton button1;
	private JButton button2;
	private JPanel panel;
	private Wins win;
	private ArrayList<Player> order;
	
	
	public selection_win(Wins win) {
		
		order = new ArrayList<Player>();
		this.win = win;
		this.label1 = new JLabel(win.getPlayer1().getNickname());
		label1.setBounds(12, 25, 73, 22);
		this.label2 = new JLabel(win.getPlayer2().getNickname());
		label2.setBounds(12, 60, 73, 22);
		this.label3 = new JLabel(win.getPlayer3().getNickname());
		label3.setBounds(12, 95, 73, 22);
		this.label4 = new JLabel(win.getPlayer4().getNickname());
		label4.setBounds(157, 24, 73, 25);
		this.label5 = new JLabel(win.getPlayer5().getNickname());
		label5.setBounds(155, 60, 75, 22);
		this.label6 = new JLabel(win.getPlayer6().getNickname());
		label6.setBounds(155, 95, 73, 22);
		 Text1 = new JTextField("            ");
		 Text1.setBounds(89, 25, 54, 22);
		 Text2 = new JTextField("            ");
		 Text2.setBounds(89, 60, 54, 22);
		 Text3 = new JTextField("            ");
		 Text3.setBounds(89, 95, 54, 22);
		 Text4 = new JTextField("            ");
		 Text4.setBounds(242, 25, 54, 22);
		 Text5 = new JTextField("            ");
		 Text5.setBounds(242, 60, 54, 22);
		 Text6 = new JTextField("            ");
		 Text6.setBounds(242, 95, 54, 22);
		 Text7 = new JTextField("            ");
		 Text7.setBounds(23, 179, 273, 34);
		 button1 = new JButton("Select");
		 button1.setBounds(118, 141, 67, 25);
		 button2 = new JButton("Start");
		 button2.setBounds(124, 220, 61, 25);
		this.panel = new JPanel();;
		panel.setLayout(null);
		
		panel.add(label1);
		panel.add(Text1);
		panel.add(label2);
		panel.add(Text2);
		panel.add(label3);
		panel.add(Text3);
		panel.add(label4);
		panel.add(Text4);
		panel.add(label5);
		panel.add(Text5);
		panel.add(label6);
		panel.add(Text6);
		panel.add(button1);
		panel.add(Text7);
		panel.add(button2);
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(343,305);
		this.setTitle("Selection");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	class ButtonListener implements ActionListener
	{


		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource().equals(button1))
			{
				/*
				String a1 = "-1";
				String a2 = "-1";
				String a3 = "-1";
				String a4 = "-1";
				String a5 = "-1";
				String a6 = "-32";
				
				
				win.First_player(a1,a2,a3,a4,a5,a6);
				Text1.setText(a1);
				Text2.setText(a2);
				Text3.setText(a3);
				Text4.setText(a4);
				Text5.setText(a5);
				Text6.setText(a6);
				*/
				
				
				
				if (win.getNumber_players()==2)
				{
					win.getPlayer1().getNumber();
					win.getPlayer2().getNumber();
					while (win.getPlayer1().getRandom_number()==win.getPlayer2().getRandom_number())
					{
						win.getPlayer1().getNumber();
						win.getPlayer2().getNumber();
					}
					Text1.setText(Integer.toString(win.getPlayer1().getRandom_number()));
					Text2.setText(Integer.toString(win.getPlayer2().getRandom_number()));
					Text3.setText("-1");
					Text4.setText("-1");
					Text5.setText("-1");
					Text6.setText("-1");
					
					order.add(win.getPlayer1());
					order.add(win.getPlayer2());
				}
				
				if (win.getNumber_players()==3)
				{
					
					win.getPlayer1().getNumber();
					win.getPlayer2().getNumber();
					win.getPlayer3().getNumber();
					
					while ((win.getPlayer1().getRandom_number()==win.getPlayer2().getRandom_number()) || (win.getPlayer1().getRandom_number()==win.getPlayer3().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer3().getRandom_number()))
					{
						win.getPlayer1().getNumber();
						win.getPlayer2().getNumber();
						win.getPlayer3().getNumber();
					}
					Text1.setText(Integer.toString(win.getPlayer1().getRandom_number()));
					Text2.setText(Integer.toString(win.getPlayer2().getRandom_number()));
					Text3.setText(Integer.toString(win.getPlayer3().getRandom_number()));
					Text4.setText("-1");
					Text5.setText("-1");
					Text6.setText("-1");
					
					order.add(win.getPlayer1());
					order.add(win.getPlayer2());
					order.add(win.getPlayer3());
					
				}
				
				if (win.getNumber_players()==4)
				{
					win.getPlayer1().getNumber();
					win.getPlayer2().getNumber();
					win.getPlayer3().getNumber();
					win.getPlayer4().getNumber();
					
					while ((win.getPlayer1().getRandom_number()==win.getPlayer2().getRandom_number()) || (win.getPlayer1().getRandom_number()==win.getPlayer3().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer3().getRandom_number())
							|| (win.getPlayer1().getRandom_number()==win.getPlayer4().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer4().getRandom_number()) || (win.getPlayer3().getRandom_number()==win.getPlayer4().getRandom_number()))
					{
						win.getPlayer1().getNumber();
						win.getPlayer2().getNumber();
						win.getPlayer3().getNumber();
						win.getPlayer4().getNumber();
					}
					Text1.setText(Integer.toString(win.getPlayer1().getRandom_number()));
					Text2.setText(Integer.toString(win.getPlayer2().getRandom_number()));
					Text3.setText(Integer.toString(win.getPlayer3().getRandom_number()));
					Text4.setText(Integer.toString(win.getPlayer4().getRandom_number()));
					Text5.setText("-1");
					Text6.setText("-1");
					
					order.add(win.getPlayer1());
					order.add(win.getPlayer2());
					order.add(win.getPlayer3());
					order.add(win.getPlayer4());
										
				}
				
				if (win.getNumber_players()==5)
				{
					win.getPlayer1().getNumber();
					win.getPlayer2().getNumber();
					win.getPlayer3().getNumber();
					win.getPlayer4().getNumber();
					win.getPlayer5().getNumber();
					
					
					while ((win.getPlayer1().getRandom_number()==win.getPlayer2().getRandom_number()) || (win.getPlayer1().getRandom_number()==win.getPlayer3().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer3().getRandom_number())
							|| (win.getPlayer1().getRandom_number()==win.getPlayer4().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer4().getRandom_number()) || (win.getPlayer3().getRandom_number()==win.getPlayer4().getRandom_number())
							|| (win.getPlayer1().getRandom_number()==win.getPlayer5().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer5().getRandom_number()) || (win.getPlayer3().getRandom_number()==win.getPlayer5().getRandom_number())
							|| (win.getPlayer4().getRandom_number()==win.getPlayer5().getRandom_number()))
					{
						win.getPlayer1().getNumber();
						win.getPlayer2().getNumber();
						win.getPlayer3().getNumber();
						win.getPlayer4().getNumber();
						win.getPlayer5().getNumber();
					}
					Text1.setText(Integer.toString(win.getPlayer1().getRandom_number()));
					Text2.setText(Integer.toString(win.getPlayer2().getRandom_number()));
					Text3.setText(Integer.toString(win.getPlayer3().getRandom_number()));
					Text4.setText(Integer.toString(win.getPlayer4().getRandom_number()));
					Text5.setText(Integer.toString(win.getPlayer5().getRandom_number()));
					Text6.setText("-1");
					
					order.add(win.getPlayer1());
					order.add(win.getPlayer2());
					order.add(win.getPlayer3());
					order.add(win.getPlayer4());
					order.add(win.getPlayer5());
				}
				
				if (win.getNumber_players()==6)
				{
					win.getPlayer1().getNumber();
					win.getPlayer2().getNumber();
					win.getPlayer3().getNumber();
					win.getPlayer4().getNumber();
					win.getPlayer5().getNumber();
					win.getPlayer6().getNumber();
					
					while ((win.getPlayer1().getRandom_number()==win.getPlayer2().getRandom_number()) || (win.getPlayer1().getRandom_number()==win.getPlayer3().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer3().getRandom_number())
							|| (win.getPlayer1().getRandom_number()==win.getPlayer4().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer4().getRandom_number()) || (win.getPlayer3().getRandom_number()==win.getPlayer4().getRandom_number())
							|| (win.getPlayer1().getRandom_number()==win.getPlayer5().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer5().getRandom_number()) || (win.getPlayer3().getRandom_number()==win.getPlayer5().getRandom_number())
							|| (win.getPlayer4().getRandom_number()==win.getPlayer5().getRandom_number()) || (win.getPlayer1().getRandom_number()==win.getPlayer6().getRandom_number()) || (win.getPlayer2().getRandom_number()==win.getPlayer6().getRandom_number())
							|| (win.getPlayer3().getRandom_number()==win.getPlayer6().getRandom_number()) || (win.getPlayer4().getRandom_number()==win.getPlayer6().getRandom_number()) || (win.getPlayer5().getRandom_number()==win.getPlayer6().getRandom_number()))
					{
						win.getPlayer1().getNumber();
						win.getPlayer2().getNumber();
						win.getPlayer3().getNumber();
						win.getPlayer4().getNumber();
						win.getPlayer5().getNumber();
						win.getPlayer6().getNumber();
					}
					
					Text1.setText(Integer.toString(win.getPlayer1().getRandom_number()));
					Text2.setText(Integer.toString(win.getPlayer2().getRandom_number()));
					Text3.setText(Integer.toString(win.getPlayer3().getRandom_number()));
					Text4.setText(Integer.toString(win.getPlayer4().getRandom_number()));
					Text5.setText(Integer.toString(win.getPlayer5().getRandom_number()));
					Text6.setText(Integer.toString(win.getPlayer6().getRandom_number()));
					
					order.add(win.getPlayer1());
					order.add(win.getPlayer2());
					order.add(win.getPlayer3());
					order.add(win.getPlayer4());
					order.add(win.getPlayer5());
					order.add(win.getPlayer6());
				}
				
			
			}
			if (e.getSource().equals(button2))
			{
				Game_wins wins = new Game_wins(win);
				setVisible(false);
			}
			
			
		}
		
	}
	
	
}
