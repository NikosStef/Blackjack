package blackjack;

import java.util.ArrayList;

import javax.swing.JTextField;

public class Wins extends Mode{

	private int number_wins;
	
	public Wins(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6,
			Player dealer, int number_players, int number_wins) {
		
		super(player1, player2, player3, player4, player5, player6, dealer, number_players);
		this.number_wins = number_wins;
	}

	
	public int getNumber_wins() {
		return number_wins;
	}


	public void setNumber_wins(int number_wins) {
		this.number_wins = number_wins;
	}


	public void Compare_hands_wins(Player pl1,Player pl2,JTextField text)
	{
		if ((pl1.print_sum_hand()>pl2.print_sum_hand()) || pl2.print_sum_hand()>21)
		{
			pl1.setWins(pl1.getWins() + 1);
			text.setText(pl1.getNickname() + " won! press Start");
			
		}
		else
			text.setText(pl1.getNickname() + " lost! press Start");
		
		
		}
	
	
	public void result_win(int counter,JTextField text)
	{
		if (counter==1)
			Compare_hands_wins(getPlayer1(),getDealer(),text);
			
			if (counter==2)
				Compare_hands_wins(getPlayer2(),getDealer(),text);
			
			if (counter==3)
				Compare_hands_wins(getPlayer3(),getDealer(),text);
			
			if (counter==4)
				Compare_hands_wins(getPlayer4(),getDealer(),text);
			
			if (counter==5)
				Compare_hands_wins(getPlayer5(),getDealer(),text);
			
			if (counter==6)
				Compare_hands_wins(getPlayer6(),getDealer(),text);
	}

	
	public void winner()
	{
		if (getPlayer1().getWins()==number_wins)
		{
			winner wn = new winner(getPlayer1());
		}
		if (getPlayer2().getWins()==number_wins)
		{
			winner wn = new winner(getPlayer2());
		}
		if (getPlayer3().getWins()==number_wins)
		{
			winner wn = new winner(getPlayer3());
		}
		if (getPlayer4().getWins()==number_wins)
		{
			winner wn = new winner(getPlayer4());
		}
		if (getPlayer5().getWins()==number_wins)
		{
			winner wn = new winner(getPlayer5());
		}
		if (getPlayer6().getWins()==number_wins)
		{
			winner wn = new winner(getPlayer6());
		}
	}

	
	public void check_21_wins(Player pl,JTextField text)
	{
		if (pl.print_sum_hand()==21)
		{
			pl.setWins(pl.getWins()+1);
			text.setText(pl.getNickname() + " won! press Start");
	}
	}
}
