package blackjack;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game_money extends JFrame{

	
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	
	private JTextField Text1;
	private JTextField Text2;
	private JTextField Text3;
	private JTextField Text4;
	private JTextField Text5;
	private JTextField Text6;
	private JTextField Text7;
	private JTextField Text8;
	private JTextField Text9;
	private JTextField Text10;
	private JTextField Text11;
	private JTextField Text12;
	private JTextField Text13;
	private JTextField Text14;
	private JTextField Text15;
	private JTextField Text16;
	private JTextField Text17;
	private JTextField Text18;
	private JTextField Text19;
	private JTextField Text20;
	private JTextField Text21;	
	private JTextField Text22;
	private JTextField Text23;
	private JTextField Text24;
	private JTextField Text25;
	
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	
	
	
	private Money money;
	
	private int counter;
	private Boolean flag1;
	private int i;
	private int bet ;
	
	private JLabel label;
	private JFrame frame;
	private ImageIcon icon;
	
	public Game_money(Money money) {
		
		counter = 0;
		i = 0;
		bet = money.getBlinds();
		flag1 = false;
		
		frame = new JFrame();//dhmiourgia tou frame kai label(eikonas)
		icon = new ImageIcon("CardTable.jpg");
		label = new JLabel(icon);
		
		label.setOpaque(true);
		
		this.money = money;
		
		this.label1 = new JLabel(money.getPlayer1().getNickname());//eisagwgh onomatwn twn xrhstwn sto frame
		 label1.setForeground(Color.WHITE);
		 label1.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label1.setBounds(100, 50, 150, 30);
		
		 this.label2 = new JLabel(money.getPlayer2().getNickname());
		 label2.setForeground(Color.WHITE);
		 label2.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label2.setBounds(100, 100, 150, 30);
		
		 this.label3 = new JLabel(money.getPlayer3().getNickname());
		 label3.setForeground(Color.WHITE);
		 label3.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label3.setBounds(100, 150, 150, 30);
		
		 this.label4 = new JLabel(money.getPlayer4().getNickname());
		 label4.setForeground(Color.WHITE);
		 label4.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label4.setBounds(100, 200, 150, 30);
		
		 this.label5 = new JLabel(money.getPlayer5().getNickname());
		 label5.setForeground(Color.WHITE);
		 label5.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label5.setBounds(100, 250, 150, 30);
		
		 this.label6 = new JLabel(money.getPlayer6().getNickname());
		 label6.setForeground(Color.WHITE);
		 label6.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label6.setBounds(100, 300, 150, 30);
		
		 this.label7 = new JLabel("Dealer");
		 label7.setForeground(Color.WHITE);
		 label7.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label7.setBounds(100, 350, 150, 30);
		
		this.label9 = new JLabel("Amount of bed");
		 label9.setForeground(Color.WHITE);
		 label9.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label9.setBounds(310, 400, 150, 30);
		
		 this.label8 = new JLabel("Blinds");
		 label8.setForeground(Color.WHITE);
		 label8.setFont(new Font("Tahoma", Font.BOLD, 15));
		 label8.setBounds(200, 400, 150, 30);

		
		
		Text1 = new JTextField("            ");
		Text1.setBounds(230, 50, 70, 30);
		Text2 = new JTextField("            ");
		Text2.setBounds(330, 50, 70, 30);
		Text3 = new JTextField("            ");
		Text3.setBounds(430, 50, 70, 30);
		
		Text4 = new JTextField("            ");
		Text4.setBounds(230, 100, 70, 30);
		Text5 = new JTextField("            ");
		Text5.setBounds(330, 100, 70, 30);
		Text6 = new JTextField("            ");
		Text6.setBounds(430, 100, 70, 30);
		
		Text7 = new JTextField("            ");
		Text7.setBounds(230, 150, 70, 30);
		Text8 = new JTextField("            ");
		Text8.setBounds(330, 150, 70, 30);
		Text9 = new JTextField("            ");
		Text9.setBounds(430, 150, 70, 30);
		
		Text10 = new JTextField("            ");
		Text10.setBounds(230, 200, 70, 30);
		Text11 = new JTextField("            ");
		Text11.setBounds(330, 200, 70, 30);
		Text12 = new JTextField("            ");
		Text12.setBounds(430, 200, 70, 30);
		
		Text13 = new JTextField("            ");
		Text13.setBounds(230, 250, 70, 30);
		Text14 = new JTextField("            ");
		Text14.setBounds(330, 250, 70, 30);
		Text15 = new JTextField("            ");
		Text15.setBounds(430, 250, 70, 30);
	    
		Text16 = new JTextField("            ");
		Text16.setBounds(230, 300, 70, 30);
		Text17 = new JTextField("            ");
		Text17.setBounds(330, 300, 70, 30);
		Text18 = new JTextField("            ");
		Text18.setBounds(430, 300, 70, 30);
		
		Text19 = new JTextField("            ");
		Text19.setBounds(230, 350, 70, 30);
		Text20 = new JTextField("            ");
		Text20.setBounds(330, 350, 70, 30);
		Text21 = new JTextField("            ");
		Text21.setBounds(430, 350, 70, 30);
		
		Text22 = new JTextField("press Start                                          ");
		Text22.setBounds(210, 450, 300, 30);
		
		
		
		this.button1 = new JButton("Draw");
		 button1.setBounds(550, 290, 100, 30);
		this.button2 = new JButton("Stop");
		 button2.setBounds(550, 360, 100, 30);
		this.button3 = new JButton("Start");
		 button3.setBounds(550, 80, 100, 30);
		this.button4 = new JButton("Cancel");
		 button4.setBounds(550, 150, 100, 30);
		this.button5 = new JButton("Bet");
		 button5.setBounds(550, 450, 100, 30);
		 
		Text23 = new JTextField(Integer.toString(money.getBlinds()));
		Text23.setBounds(270, 400, 30, 30);
			
		Text24 = new JTextField("");
		Text24.setBounds(680, 450, 30, 30);
			
		Text25 = new JTextField(Integer.toString(money.getBlinds()));
		Text25.setBounds(450, 400, 30, 30);
	
		label.add(label1);
		label.add(Text1);
		label.add(Text2);
		label.add(Text3);
		
		label.add(label2);
		label.add(Text4);
		label.add(Text5);
		label.add(Text6);
		
		label.add(label3);
		label.add(Text7);
		label.add(Text8);
		label.add(Text9);
		
		label.add(label4);
		label.add(Text10);
		label.add(Text11);
		label.add(Text12);
		
		label.add(label5);
		label.add(Text13);
		label.add(Text14);
		label.add(Text15);
		
		label.add(label6);
		label.add(Text16);
		label.add(Text17);
		label.add(Text18);
		
		label.add(label7);
		label.add(Text19);
		label.add(Text20);
		label.add(Text21);
		
		label.add(button1);
		label.add(button2);
		label.add(button3);
		label.add(button4);
		label.add(label8);
		label.add(Text23);
		label.add(label9);
		label.add(Text25);
		label.add(Text24);
		label.add(button5);
		label.add(Text22);
		
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button3.addActionListener(listener);
		button2.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		
		
		frame.add(label);
		frame.setSize(825,570);
		frame.setVisible(true);
		frame.setTitle("Money");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}




	public JTextField getText1() {
		return Text1;
	}



	public void setText1(JTextField text1) {
		Text1 = text1;
	}


	public JTextField getText2() {
		return Text2;
	}



	public void setText2(JTextField text2) {
		Text2 = text2;
	}



	public JTextField getText3() {
		return Text3;
	}


	public void setText3(JTextField text3) {
		Text3 = text3;
	}



	public JTextField getText4() {
		return Text4;
	}

	
	public void setText4(JTextField text4) {
		Text4 = text4;
	}



	public JTextField getText5() {
		return Text5;
	}



	public void setText5(JTextField text5) {
		Text5 = text5;
	}



	public JTextField getText6() {
		return Text6;
	}




	public void setText6(JTextField text6) {
		Text6 = text6;
	}



	public JTextField getText7() {
		return Text7;
	}


	public void setText7(JTextField text7) {
		Text7 = text7;
	}


	public JTextField getText8() {
		return Text8;
	}



	public void setText8(JTextField text8) {
		Text8 = text8;
	}



	public JTextField getText9() {
		return Text9;
	}



	public void setText9(JTextField text9) {
		Text9 = text9;
	}




	public JTextField getText10() {
		return Text10;
	}




	public void setText10(JTextField text10) {
		Text10 = text10;
	}



	public JTextField getText11() {
		return Text11;
	}


	public JTextField getText12() {
		return Text12;
	}



	public void setText12(JTextField text12) {
		Text12 = text12;
	}




	public JTextField getText13() {
		return Text13;
	}



	public void setText13(JTextField text13) {
		Text13 = text13;
	}




	public JTextField getText14() {
		return Text14;
	}




	public void setText14(JTextField text14) {
		Text14 = text14;
	}




	public JTextField getText15() {
		return Text15;
	}



	public void setText15(JTextField text15) {
		Text15 = text15;
	}



	public JTextField getText16() {
		return Text16;
	}



	public void setText16(JTextField text16) {
		Text16 = text16;
	}



	public JTextField getText17() {
		return Text17;
	}


	public void setText17(JTextField text17) {
		Text17 = text17;
	}




	public JTextField getText18() {
		return Text18;
	}


	public void setText18(JTextField text18) {
		Text18 = text18;
	}





	public JTextField getText19() {
		return Text19;
	}


	public void setText19(JTextField text19) {
		Text19 = text19;
	}




	public JTextField getText20() {
		return Text20;
	}



	public void setText20(JTextField text20) {
		Text20 = text20;
	}




	public JTextField getText21() {
		return Text21;
	}




	public void setText21(JTextField text21) {
		Text21 = text21;
	}

	public JTextField getText22() {
		return Text22;
	}




	public void setText22(JTextField text22) {
		Text22 = text22;
	}



	class ButtonListener implements ActionListener
	{

		
		public void actionPerformed(ActionEvent e) {
			
			if (e.getSource().equals(button3))
			{
				
				if (Text22.getText().equals("press Start                                          ") || Text22.getText().equals(money.getPlayer1().getNickname() + " won! press Start")
						 || Text22.getText().equals(money.getPlayer2().getNickname() + " won! press Start")  || Text22.getText().equals(money.getPlayer3().getNickname() + " won! press Start")
						 || Text22.getText().equals(money.getPlayer4().getNickname() + " won! press Start")  || Text22.getText().equals(money.getPlayer5().getNickname() + " won! press Start")
						 || Text22.getText().equals(money.getPlayer6().getNickname() + " won! press Start")  || Text22.getText().equals(money.getPlayer1().getNickname() + " lost please press Start")
						 || Text22.getText().equals(money.getPlayer1().getNickname() + " lost please press Start") || Text22.getText().equals(money.getPlayer3().getNickname() + " lost please press Start")
						 || Text22.getText().equals(money.getPlayer4().getNickname() + " lost please press Start") || Text22.getText().equals(money.getPlayer5().getNickname() + " lost please press Start")
						 || Text22.getText().equals(money.getPlayer6().getNickname() + " lost please press Start") || Text22.getText().equals(money.getPlayer2().getNickname() + " lost please press Start"))
				{
				money.winner();

				i = 0;
				money.clear_hands_mode();
				
				
				Text1.setText("            ");
				Text2.setText("            ");
				Text4.setText("            ");
				Text5.setText("            ");
				Text7.setText("            ");
				Text8.setText("            ");
				Text10.setText("            ");
				Text11.setText("            ");
				Text13.setText("            ");
				Text14.setText("            ");
				Text16.setText("            ");
				Text17.setText("            ");
				Text19.setText("            ");
				Text20.setText("            ");
				Text23.setText(Integer.toString(money.getBlinds()));
				Text24.setText("0");
				Text25.setText(Integer.toString(money.getBlinds()));
				
				Text3.setText(Integer.toString(money.getPlayer1().getMoney()));
				Text6.setText(Integer.toString(money.getPlayer2().getMoney()));
				Text9.setText(Integer.toString(money.getPlayer3().getMoney()));
				Text12.setText(Integer.toString(money.getPlayer4().getMoney()));
				Text15.setText(Integer.toString(money.getPlayer5().getMoney()));
				Text18.setText(Integer.toString(money.getPlayer6().getMoney()));
				
				bet = money.getBlinds();
				
				if (counter == money.getNumber_players())
					counter=0;
				
				
				
				
				while (flag1 == false)
				{
					counter = counter +1;
					money.whos_turn_money(counter, Text22);
					flag1 = true;
					
					
				}
				flag1 = false;
				
				}
			}
			
			if (e.getSource().equals(button1))
			{
				if (Text22.getText().equals("Draw or Stop!"))
				{
				Text24.setText("0");
				
				if (counter == 1)
				{
					if (money.getPlayer1().getMoney()>0)
					{
					money.game_phase(counter, i, Text1, Text2, Text22);
					money.check_21_or_plus(money.getPlayer1(),bet,Text22);
					i++;
					if (money.getPlayer1().print_sum_hand()<21)
					Text22.setText("Bet");
					}
					
				}
				
				if (counter == 2 )
				{
					if (money.getPlayer2().getMoney()>0)
					{
					money.game_phase(counter, i,Text4, Text5, Text22);
					money.check_21_or_plus(money.getPlayer2(),bet,Text22);
					i++;
					if (money.getPlayer2().print_sum_hand()<21)
					Text22.setText("Bet");
				}
				
				}
				if (counter == 3 )
				{
					if (money.getPlayer3().getMoney()>0)
					{
					money.game_phase(counter, i,Text7, Text8, Text22);
					money.check_21_or_plus(money.getPlayer3(),bet,Text22);
					if (money.getPlayer3().print_sum_hand()<21)
						Text22.setText("Bet");
					i++;
					}
					
					
				}
				
				
				if (counter == 4)
				{
					if (money.getPlayer4().getMoney()>0)
					{
			
					money.game_phase(counter, i,Text10, Text11, Text22);
					money.check_21_or_plus(money.getPlayer4(),bet,Text22);
					if (money.getPlayer4().print_sum_hand()<21)
					Text22.setText("Bet");
					i++;
					}
				
				}
				
				
				if (counter == 5)
				{
					if (money.getPlayer5().getMoney()>0)
					{
			
					money.game_phase(counter, i,Text13, Text14, Text22);
					money.check_21_or_plus(money.getPlayer5(),bet,Text22);
					if (money.getPlayer5().print_sum_hand()<21)
					Text22.setText("Bet");
					i++;
					}
					
				}
				
				if (counter == 6)
				{
					if (money.getPlayer6().getMoney()>0)
					{
				
					money.game_phase(counter, i, Text16, Text17, Text22);
					money.check_21_or_plus(money.getPlayer6(),bet,Text22);
					if (money.getPlayer6().print_sum_hand()<21)
					Text22.setText("Bet");
					i++;
					}
		
				
			}
			}
			}
			
			if (e.getSource().equals(button2))
			{
				if (Text22.getText().equals("Draw or Stop!"))
				{
				Text22.setText("Dealers turn");
				money.dealer_turn(counter, Text19, Text20);
				money.result_money(counter,Text22,bet);
				}
			}
			
			
			
			
			if (e.getSource().equals(button5))
			{
				
				if (Text22.getText().equals("Bet") || Text22.getText().equals("you can not afford that bet, make it less!") ||
				 Text22.getText().equals(money.getPlayer1().getNickname() + " Please bet!") || Text22.getText().equals(money.getPlayer2().getNickname() + " Please bet!") || 
				 Text22.getText().equals(money.getPlayer3().getNickname() + " Please bet!") || Text22.getText().equals(money.getPlayer4().getNickname() + " Please bet!") || 
				 Text22.getText().equals(money.getPlayer5().getNickname() + " Please bet!") || Text22.getText().equals(money.getPlayer6().getNickname() + " Please bet!"))
				{
				
				
				int i = bet;
				bet = bet + Integer.parseInt(Text24.getText());
				
				
				if (counter == 1)
				{
					if ((Integer.parseInt(Text24.getText())<=money.getPlayer1().getMoney()) && 
						bet<=money.getPlayer1().getMoney())
					{
						Text22.setText("Draw or Stop!");
						Text25.setText(Integer.toString(bet));
						Text24.setText("0");
					}
					else 
					{
						Text22.setText("you can not afford that bet, make it less!");
						bet = i;
						Text25.setText(Integer.toString(bet));
				}
				}
				
				if (counter == 2 )
				{
					if ((Integer.parseInt(Text24.getText())<money.getPlayer2().getMoney()) && 
							bet<=money.getPlayer2().getMoney())
						{
						Text22.setText("Draw or Stop!");
						Text25.setText(Integer.toString(bet));
						}
					else 
					{
						Text22.setText("you can not afford that bet, make it less!");
						bet = i;
						Text25.setText(Integer.toString(bet));
				}
				}
				
				
				if (counter == 3 )
				{
				
					if ((Integer.parseInt(Text24.getText())<money.getPlayer3().getMoney()) && 
							bet<=money.getPlayer3().getMoney())
						{
						Text22.setText("Draw or Stop!");
						Text25.setText(Integer.toString(bet));
						}
					else 
					{
						Text22.setText("you can not afford that bet, make it less!");
						bet = i;
						Text25.setText(Integer.toString(bet));
				}
				}
				
				
				if (counter == 4)
				{
					if ((Integer.parseInt(Text24.getText())<money.getPlayer4().getMoney()) && 
							bet<=money.getPlayer4().getMoney())
						{
						Text22.setText("Draw or Stop!");
						Text25.setText(Integer.toString(bet));
						}
					else 
					{
						Text22.setText("you can not afford that bet, make it less!");
						bet = i;
						Text25.setText(Integer.toString(bet));
				}
				}
				
				
				if (counter == 5)
				{
					if ((Integer.parseInt(Text24.getText())<money.getPlayer5().getMoney()) && 
							bet<=money.getPlayer5().getMoney())
						{
						Text22.setText("Draw or Stop!");
						Text25.setText(Integer.toString(bet));
						}
					else 
					{
						Text22.setText("you can not afford that bet, make it less!");
						bet = i;
						Text25.setText(Integer.toString(bet));
				}
				}
				
				if (counter == 6)
				{
					if ((Integer.parseInt(Text24.getText())<money.getPlayer6().getMoney()) && 
							bet<=money.getPlayer6().getMoney())
						{
						Text22.setText("Draw or Stop!");
						Text25.setText(Integer.toString(bet));
						}
							else 
							{
								Text22.setText("you can not afford that bet, make it less!");
								bet = i;
								Text25.setText(Integer.toString(bet));
						}
			}
				
				
				Text24.setText("0");
				}
				
				
				
			}
				
			if (e.getSource().equals(button4))
			{
				Menu mn = new Menu();
				frame.setVisible(false);
			}
				
				
			}
			
		}
	}




