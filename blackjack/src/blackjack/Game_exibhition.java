package blackjack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game_exibhition extends JFrame{
	
	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JTextField Text4;
	private JTextField Text5;
	private JTextField Text6;
	private JTextField Text7;
	private JLabel label1;
	private JLabel label2;
	private JButton Button1;
	private JButton Button2;
	private JButton Button3;
	private JButton Button4;
	private JPanel panel;
	private Exibhition ex;

	public int i = 0;
	public int flag2;
	public Boolean flag = false;
	public Boolean flag1;

		
	
	public Game_exibhition(Exibhition ex)
	{
		
		this.ex = ex;
		flag1 = false;
		flag2 = 0;
		
		label1 = new JLabel(ex.getPlayer1().getNickname());
		 label2 = new JLabel(ex.getPlayer2().getNickname());
		 Text1 = new JTextField("            ");
		 Text2 = new JTextField("            ");
		 Text3 = new JTextField("            ");
		 Text4 = new JTextField("            ");
		 Text5 = new JTextField("            ");
		 Text6 = new JTextField("            ");
		 if (ex.getPlayer1().getRandom_number()>ex.getPlayer2().getRandom_number())
		 Text7 = new JTextField("Press START                         ");
		 else 
			 Text7 = new JTextField("Press START                         ");
		 Button1 = new JButton("DRAW");
		Button2 = new JButton("STOP");
		Button3 = new JButton("CANCEL");
		Button4 = new JButton("START");
		panel = new JPanel();
		
		panel.add(label1);
		panel.add(Text1);
		panel.add(Text2);
		panel.add(Text3);
		panel.add(label2);
		panel.add(Text4);
		panel.add(Text5);
		panel.add(Text6);
		panel.add(Button4);
		panel.add(Button1);
		panel.add(Button2);
		panel.add(Text7);
		panel.add(Button3);
		
		
		
		ButtonListener listener = new ButtonListener();
		Button1.addActionListener(listener);
		Button2.addActionListener(listener);
		Button4.addActionListener(listener);
		Button3.addActionListener(listener);
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(300, 200);
		this.setTitle("Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	

	

	public void setText1(JTextField text1) {
		Text1 = text1;
	}



	public void setText2(JTextField text2) {
		Text2 = text2;
	}




	public void setText3(JTextField text3) {
		Text3 = text3;
	}


	public void setText4(JTextField text4) {
		Text4 = text4;
	}



	public void setText5(JTextField text5) {
		Text5 = text5;
	}





	public void setText6(JTextField text6) {
		Text6 = text6;
	}





	public void setText7(JTextField text7) {
		Text7 = text7;
	}





	class ButtonListener implements ActionListener
	{

	
		public void actionPerformed(ActionEvent e) {
		
			
			
		
			
			if (e.getSource().equals(Button4))
			{
				
				if (Text7.getText().equals("Press START                         ") || Text7.getText().equals(ex.getPlayer1().getNickname() + " won!. Press START")
						 || Text7.getText().equals(ex.getPlayer2().getNickname() + " won!. Press START") || Text7.getText().equals(ex.getPlayer1().getNickname() + " you lost!. Press START")
								 || Text7.getText().equals(ex.getPlayer2().getNickname() + " you lost!. Press START"))
				{
				if (flag2 != 0)
					ex.switch_dealers();
				
				if (flag1==false)
				{
					flag2 = 1;
					flag1 = true;
				}
				
				ex.clear_hands();
				Text1.setText("            ");
				Text2.setText("            ");
				Text4.setText("            ");
				Text5.setText("            ");
				Text3.setText(Integer.toString(ex.getPlayer1().getWins()));
				Text6.setText(Integer.toString(ex.getPlayer2().getWins()));
				i = 0;
				flag = false;
				
				 if (ex.getPlayer1().getRandom_number()>ex.getPlayer2().getRandom_number())
					 Text7.setText(ex.getPlayer2().getNickname() + " Draw or Stop");
					 else 
						 Text7.setText(ex.getPlayer1().getNickname() + " Draw or Stop");
				 
				 
				}
			
			}
			
			if (e.getSource().equals(Button1))
			{
				if (Text7.getText().equals(ex.getPlayer1().getNickname() + " Draw or Stop")
						|| Text7.getText().equals(ex.getPlayer2().getNickname() + " Draw or Stop")
						|| Text7.getText().equals(ex.getPlayer1().getNickname() + " it is your turn")
						|| Text7.getText().equals(ex.getPlayer2().getNickname() + " it is your turn"))
				{
							ex.Dealer();
				
				
				
							//ama o player 2 einai o dealer kai paizei o player1
				if((ex.getPlayer1().getRandom_number()==0 && ex.getPlayer2().print_sum_hand()==0) && flag==false)
				{
					
					ex.Draw_phase_ex(ex.getPlayer1(),Text1, Text2, Text3, Text4, Text5, Text6, Text7,i,flag);
						i++;
					
					if (ex.getPlayer1().print_sum_hand()==0)
					{
						i = 0;
						
						flag = false;
					}
					
					if(ex.getPlayer1().getWins()==ex.getNumber_wins())
					{
						winner a = new winner(ex.getPlayer1());
						setVisible(false);
					}
					if(ex.getPlayer2().getWins()==ex.getNumber_wins())
					{
						winner a = new winner(ex.getPlayer2());
						setVisible(false);
					}
				}
				
				// ama o player1 einai o dealer kai paizei o player1
				if((ex.getPlayer1().getRandom_number()==1 && ex.getPlayer2().print_sum_hand()!=0) && flag==true)
				{
					ex.Draw_phase_ex(ex.getPlayer1(),Text1, Text2, Text3, Text4, Text5, Text6, Text7, i,flag);
					
					
					i++;
					if (ex.getPlayer1().print_sum_hand()==0)
					{
						i = 0;
						flag = false;
				
					}
					
					
					if(ex.getPlayer1().getWins()==ex.getNumber_wins())
					{
						winner a = new winner(ex.getPlayer1());
						setVisible(false);
					}
					if(ex.getPlayer2().getWins()==ex.getNumber_wins())
					{
						winner a = new winner(ex.getPlayer2());
						setVisible(false);
					}
					
					
				}
				
				
				// ama o player2 einai o dealer kai paizei o player2
				if((ex.getPlayer2().getRandom_number()==1 && ex.getPlayer1().print_sum_hand()!=0) && flag==true)
				{
					ex.Draw_phase_ex(ex.getPlayer2(),Text4, Text5, Text6, Text1, Text2, Text3, Text7,i,flag);
					i++;
					if (ex.getPlayer2().print_sum_hand()==0)
					{
						i = 0;
						flag = false;
						
					}
					
					
					if(ex.getPlayer1().getWins()==ex.getNumber_wins())
					{
						winner a = new winner(ex.getPlayer1());
						setVisible(false);
					}
					if(ex.getPlayer2().getWins()==ex.getNumber_wins())
					{
						winner a = new winner(ex.getPlayer2());
						setVisible(false);
					}
				}
					
				//ama o player1 einai o dealer kai paizei o player2
				if((ex.getPlayer2().getRandom_number()==0 && ex.getPlayer1().print_sum_hand()==0) && flag==false)
				{
					ex.Draw_phase_ex(ex.getPlayer2(),Text4, Text5, Text6, Text1, Text2, Text3, Text7,i,flag);
					
					i++;
					if (ex.getPlayer2().print_sum_hand()==0)
					{
						i = 0;
						flag = false;
						
					}
					
					if(ex.getPlayer1().getWins()==ex.getNumber_wins())
					{
						winner a = new winner(ex.getPlayer1());
						setVisible(false);
					}
					if(ex.getPlayer2().getWins()==ex.getNumber_wins())
					{
						winner a = new winner(ex.getPlayer2());
						setVisible(false);
					}
					
					
				}
				
		
						}
			}
				
				if (e.getSource().equals(Button2))
				{

					if (Text7.getText().equals(ex.getPlayer1().getNickname() + " Draw or Stop")
							|| Text7.getText().equals((ex.getPlayer2().getNickname() + " Draw or Stop")))
					{
					if(ex.getPlayer1().print_sum_hand()!=0 && ex.getPlayer2().print_sum_hand()!=0)
					{ 
						ex.Stop_compare_ex(Text1, Text2, Text3, Text4, Text5, Text6,Text7);
						flag = false;
						i = 0;
						ex.switch_dealers();
						
						if(ex.getPlayer1().getWins()==ex.getNumber_wins())
						{
							winner a = new winner(ex.getPlayer1());
							setVisible(false);
						}
						if(ex.getPlayer2().getWins()==ex.getNumber_wins())
						{
							winner a = new winner(ex.getPlayer2());
							setVisible(false);
						}
					}
					
				
					
					if (ex.getPlayer1().print_sum_hand()!=0 && ex.getPlayer2().print_sum_hand()==0)
					{
						flag = true;
						i = 0;
						Text7.setText(ex.getPlayer2().getNickname() + " it is your turn");
					}
					
					
					if (ex.getPlayer2().print_sum_hand()!=0 && ex.getPlayer1().print_sum_hand()==0)
					{
						flag = true;
						i = 0;
						Text7.setText(ex.getPlayer1().getNickname() + " it is your turn");
					}
					
				}
					
			
				}
				
				if (e.getSource().equals(Button3))	
				{
					Menu mn = new Menu();
					setVisible(false);
				}


}
	}
}