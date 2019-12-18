package blackjack;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Game_wins extends JFrame{

	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
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
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JPanel panel;
	private Wins win;
	
	private int counter;
	private Boolean flag1;
	
	private int i;
	
	public Game_wins(Wins win) {
		
		counter = 0;
		i = 0;
		flag1 = false;
		
		this.win = win;
		this.label1 = new JLabel(win.getPlayer1().getNickname());
		this.label2 = new JLabel(win.getPlayer2().getNickname());
		this.label3 = new JLabel(win.getPlayer3().getNickname());
		this.label4 = new JLabel(win.getPlayer4().getNickname());
		this.label5 = new JLabel(win.getPlayer5().getNickname());
		this.label6 = new JLabel(win.getPlayer6().getNickname());
		
		
		this.label7 = new JLabel("Dealer");
		Text1 = new JTextField("            ");
		Text2 = new JTextField("            ");
		Text3 = new JTextField("            ");
		Text4 = new JTextField("            ");
		Text5 = new JTextField("            ");
		Text6 = new JTextField("            ");
		Text7 = new JTextField("            ");
		Text8 = new JTextField("            ");
		Text9 = new JTextField("            ");
		Text10 = new JTextField("            ");
		Text11 = new JTextField("            ");
		Text12 = new JTextField("            ");
		Text13 = new JTextField("            ");
		Text14 = new JTextField("            ");
		Text15 = new JTextField("            ");
		Text16 = new JTextField("            ");
		Text17 = new JTextField("            ");
		Text18 = new JTextField("            ");
		Text19 = new JTextField("            ");
		Text20 = new JTextField("            ");
		Text21 = new JTextField("            ");
		Text22 = new JTextField("press Start                                          ");
		this.button1 = new JButton("Draw");
		this.button2 = new JButton("Stop");
		this.button3 = new JButton("Start");
		this.button4 = new JButton("Cancel");
		this.panel = new JPanel();
		
		panel.add(label1);
		panel.add(Text1);
		panel.add(Text2);
		panel.add(Text3);
		panel.add(label2);
		panel.add(Text4);
		panel.add(Text5);
		panel.add(Text6);
		panel.add(label3);
		panel.add(Text7);
		panel.add(Text8);
		panel.add(Text9);
		panel.add(label4);
		panel.add(Text10);
		panel.add(Text11);
		panel.add(Text12);
		panel.add(label5);
		panel.add(Text13);
		panel.add(Text14);
		panel.add(Text15);
		panel.add(label6);
		panel.add(Text16);
		panel.add(Text17);
		panel.add(Text18);
		panel.add(label7);
		panel.add(Text19);
		panel.add(Text20);
		panel.add(Text21);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(Text22);
		
		
		ButtonListener listener = new ButtonListener();
		button1.addActionListener(listener);
		button3.addActionListener(listener);
		button2.addActionListener(listener);
		button4.addActionListener(listener);
		
		setContentPane(panel);
		this.setVisible(true);
		this.setSize(250,300);
		this.setTitle("Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
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





















	public void setText11(JTextField text11) {
		Text11 = text11;
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
				
				if (Text22.getText().equals("press Start                                          ") || Text22.getText().equals(win.getPlayer1().getNickname() + " won! press Start")
						 || Text22.getText().equals(win.getPlayer2().getNickname() + " won! press Start")  || Text22.getText().equals(win.getPlayer3().getNickname() + " won! press Start")
						 || Text22.getText().equals(win.getPlayer4().getNickname() + " won! press Start")  || Text22.getText().equals(win.getPlayer5().getNickname() + " won! press Start")
						 || Text22.getText().equals(win.getPlayer6().getNickname() + " won! press Start")  || Text22.getText().equals(win.getPlayer1().getNickname() + " lost! press Start")
						 || Text22.getText().equals(win.getPlayer1().getNickname() + " lost! press Start") || Text22.getText().equals(win.getPlayer3().getNickname() + " lost! press Start")
						 || Text22.getText().equals(win.getPlayer4().getNickname() + " lost! press Start") || Text22.getText().equals(win.getPlayer5().getNickname() + " lost! press Start")
						 || Text22.getText().equals(win.getPlayer6().getNickname() + " lost! press Start") || Text22.getText().equals(win.getPlayer2().getNickname() + " lost! press Start"))
				{
				win.winner();

				i = 0;
				win.clear_hands_mode();
				
				
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
				
				Text3.setText(Integer.toString(win.getPlayer1().getWins()));
				Text6.setText(Integer.toString(win.getPlayer2().getWins()));
				Text9.setText(Integer.toString(win.getPlayer3().getWins()));
				Text12.setText(Integer.toString(win.getPlayer4().getWins()));
				Text15.setText(Integer.toString(win.getPlayer5().getWins()));
				Text18.setText(Integer.toString(win.getPlayer6().getWins()));
				
				
				if (counter==win.getNumber_players())
					counter=0;
				
				
				while (flag1 == false)
				{
					counter = counter +1;
					win.whos_turn(counter, Text22);
					flag1 = true;
					
					
				}
				flag1 = false;
				
				
			}
			}
			if (e.getSource().equals(button1))
			{
				if (Text22.getText().equals(win.getPlayer1().getNickname() +" turn. Draw or Stop") || Text22.getText().equals(win.getPlayer1().getNickname() +" turn. Draw or Stop") ||
						Text22.getText().equals(win.getPlayer3().getNickname() +" turn. Draw or Stop") || Text22.getText().equals(win.getPlayer4().getNickname() +" turn. Draw or Stop") ||
						Text22.getText().equals(win.getPlayer5().getNickname() +" turn. Draw or Stop") || Text22.getText().equals(win.getPlayer6().getNickname() +" turn. Draw or Stop") ||
						Text22.getText().equals(win.getPlayer2().getNickname() +" turn. Draw or Stop"))
				{	
				
				if (counter == 1)
				{
					win.game_phase(counter, i, Text1, Text2, Text22);
					win.check_21_wins(win.getPlayer1(),Text22);
					if (win.getPlayer1().print_sum_hand()>21)
						Text22.setText(win.getPlayer1().getNickname() + " lost. Press Start!");
					i++;
				
				}
				
				if (counter == 2 )
				{
					win.game_phase(counter, i,Text4, Text5, Text22);
					win.check_21_wins(win.getPlayer2(),Text22);
					if (win.getPlayer2().print_sum_hand()>21)
						Text22.setText(win.getPlayer2().getNickname() + " lost. Press Start!");
					i++;
		
				}
				
				
				if (counter == 3 )
				{
				
					win.game_phase(counter, i,Text7, Text8, Text22);
					win.check_21_wins(win.getPlayer3(),Text22);
					if (win.getPlayer3().print_sum_hand()>21)
						Text22.setText(win.getPlayer3().getNickname() + " lost. Press Start!");
					i++;
				
				
				}
				
				
				if (counter == 4)
				{
					win.game_phase(counter, i,Text10, Text11, Text22);
					win.check_21_wins(win.getPlayer4(),Text22);
					if (win.getPlayer4().print_sum_hand()>21)
						Text22.setText(win.getPlayer4().getNickname() + " lost. Press Start!");
					i++;
					
				}
				
				
				if (counter == 5)
				{
					win.game_phase(counter, i,Text13, Text14, Text22);
					win.check_21_wins(win.getPlayer5(),Text22);
					if (win.getPlayer5().print_sum_hand()>21)
						Text22.setText(win.getPlayer5().getNickname() + " lost. Press Start!");
					i++;
				
				}
				
				if (counter == 6)
				{
					win.game_phase(counter, i, Text16, Text17, Text22);
					win.check_21_wins(win.getPlayer6(),Text22);
					if (win.getPlayer6().print_sum_hand()>21)
						Text22.setText(win.getPlayer6().getNickname() + " lost. Press Start!");
					i++;
				
			}
			}
			}
			if (e.getSource().equals(button2))
			{
				if (Text22.getText().equals(win.getPlayer1().getNickname() +" turn. Draw or Stop") || Text22.getText().equals(win.getPlayer1().getNickname() +" turn. Draw or Stop") ||
						Text22.getText().equals(win.getPlayer3().getNickname() +" turn. Draw or Stop") || Text22.getText().equals(win.getPlayer4().getNickname() +" turn. Draw or Stop") ||
						Text22.getText().equals(win.getPlayer5().getNickname() +" turn. Draw or Stop") || Text22.getText().equals(win.getPlayer6().getNickname() +" turn. Draw or Stop") ||
						Text22.getText().equals(win.getPlayer2().getNickname() +" turn. Draw or Stop"))
				{
				Text22.setText("Dealers turn");
				win.dealer_turn(counter, Text19, Text20);
				win.result_win(counter,Text22);
				
			}
			}
			if (e.getSource().equals(button4))
			{
				Menu mn = new Menu();
			}
			
			
			}
			
		}
	}

		
	
	
	

