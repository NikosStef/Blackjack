package blackjack;

import java.util.ArrayList;

import javax.swing.JTextField;

public class Exibhition {

	
	private int number_wins;
	private Player player1;
	private Player player2;
	private Deck deck;

	

	public Exibhition(int number_wins, Player player1, Player player2) {
		
		this.number_wins = number_wins;
		this.player1 = player1;
		this.player2 = player2;
		deck = new Deck();
	}





	public Player getPlayer1() {
		return player1;
	}


	public Player getPlayer2() {
		return player2;
	}


	public void setNumber_wins(int number_wins) {
		this.number_wins = number_wins;
	}
	
	
	
	
	
	
	public int getNumber_wins() {
		return number_wins;
	}





	public void Dealer()
	{
		if (this.getPlayer1().getRandom_number()>this.getPlayer2().getRandom_number())
		{
			this.getPlayer1().setRandom_number(1);
			this.getPlayer2().setRandom_number(0);
		}
		else 
		{
			this.getPlayer2().setRandom_number(1);
			this.getPlayer1().setRandom_number(0);
		}
	}
	
	public void switch_dealers()
	{
		if (player1.getRandom_number()==1)
			player1.setRandom_number(-1);
		else 
			player2.setRandom_number(-1);
		
		this.Dealer();
		
	}
	
	public void clear_hands()
	{
		
		player1.getHands().clear();
		player2.getHands().clear();
	}
	
	
	public void Compare_hands(JTextField Text1)
	{
		if (this.getPlayer1().print_sum_hand()>this.getPlayer2().print_sum_hand())
		{
			this.getPlayer1().setWins(this.getPlayer1().getWins() + 1);
			Text1.setText(player1.getNickname() + " won!. Press START");
			
		}
		
		if (this.getPlayer1().print_sum_hand()<this.getPlayer2().print_sum_hand())
		{
			this.getPlayer2().setWins(this.getPlayer2().getWins() + 1);
			Text1.setText(player2.getNickname() + " won!. Press START");
		}
		
		if (this.getPlayer1().print_sum_hand()==this.getPlayer2().print_sum_hand())
		{
			if (this.getPlayer1().getRandom_number()==1)
			{
				this.getPlayer1().setWins(this.getPlayer1().getWins() + 1);
				Text1.setText(player1.getNickname() + " won!. Press START");
			}
			else
			{
				this.getPlayer2().setWins(this.getPlayer2().getWins() + 1);
				Text1.setText(player2.getNickname() + " won!. Press START");
			}	
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	public void Stop_compare_ex(JTextField Text1, JTextField Text2, JTextField Text3, JTextField Text4,
			 JTextField Text5, JTextField Text6,JTextField Text7)
	{
		Compare_hands(Text7);
		
		switch_dealers();
		clear_hands();
		Text3.setText(Integer.toString(player1.getWins()));
		Text6.setText(Integer.toString(player2.getWins()));
		Text1.setText("            ");
		Text2.setText("            ");
		Text4.setText("            ");
		Text5.setText("            ");
	}
	
	
	public void player_round_ex(int i,Player pl,JTextField text)
	{
		
		int card;
		if (i==0)
		{	
	
			
			 card = deck.Draw();
			pl.getHands().add(card);
			
			 card = deck.Draw();
			pl.getHands().add(card);
		

			if (pl.print_sum_hand()==21)
			{
				
				pl.setWins(pl.getWins() +1);
				text.setText(pl.getNickname() + " won!. Press START");
			
		
			}
			
			
		}
		else
			{
			 card = deck.Draw();
				pl.getHands().add(card);
				
				if ( pl.print_sum_hand() > 21)
				{
					text.setText(pl.getNickname() + " you lost!. Press START");
					if (pl.getNickname()==player1.getNickname())
						player2.setWins(player2.getWins() +1);
					else
						player1.setWins(player1.getWins() +1);
	
				}
				
				if (pl.print_sum_hand()==21)
				{
					pl.setWins(pl.getWins() +1);
					text.setText(pl.getNickname() + " won!. Press START");
				
				}
			
			}
	}
	
	
	
	
	public void Draw_phase_ex(Player pl,JTextField Text1, JTextField Text2, JTextField Text3, JTextField Text4,
			 JTextField Text5, JTextField Text6, JTextField Text7,int i,boolean flag)
	{
		if (i==0 && flag==false)
			deck.DeckLoad();
		
		if (player1.getNickname()==pl.getNickname())
		{
		player_round_ex(i,player1,Text7);
		int hands = player1.print_sum_hand();
		Text2.setText(Integer.toString(hands));
		String hands_s = player1.printHand();
		Text1.setText(hands_s);
		if (player1.print_sum_hand()>=21)
			clear_hands();
		else
			Text7.setText(player1.getNickname() + " Draw or Stop");
		}
		
		
		else 
		{
			player_round_ex(i,player2,Text7);
		int hands = player2.print_sum_hand();
		Text2.setText(Integer.toString(hands));
		String hands_s = player2.printHand();
		Text1.setText(hands_s);
		if (player2.print_sum_hand()>=21)
		{
			clear_hands();
		}
		else
		Text7.setText(player2.getNickname() + " Draw or Stop");
		}
	}
	
	
	
	
	
}
	
	
	


