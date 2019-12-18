/*Η κλαση Wins ειναι υποκλαση της κλασης mode. εχει μεθοδους που αφορουν την λειτουργια του mode Wins και αποθηκευει των αριθμο 
 *των νικων που πρεπει να φτασει ενας παικτης. Μεσο τις κλασης αυτης το συστημα ελεχει αμα καποιος παιχτης εφτασε το επιυθμητο 
 *αριθμο νικων και αμα ισχυει των εμφανιζει ως νικητη.Επισης αποφασιζει σε ενα γυρο ποιος απο τον παιχτη η τον dealer νικησε και 
 *αμα νικησε ο παιχτης του αυξανει κατα μια τις νικες του,τελος ελεχει αμα το αθροισμα των φυλλων του παιχτη ειναι 21 οποτε και 
 *του αυξανει τις νικες κατα μια.*/
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

	//Δεχεται ως παραματρους δυο μεταβλητες τυπου Player οπου ο ενας ειναι ο dealer. 
	//Ελεχει αμα νικησε ο παιχτης και αμα ισχυει του αυξανει τις νικες του κατα μια.
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
	/*Δεχεται μια μεταβλητη int και ελεχει ποιος παιχτης εχει σειρα και συκρινει τα 
	 * φυλλα του με του dealer και αυξανει αμα νικησει τις νικες του κατα μια.*/
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

	/*Ελεχει για το καθε παιχτη αμα εχει φτασει των αριθμο των νικων ωστε να νικησει συνολκα το παιχνιδη και αμα ισχυει αυτο για 
	 *καποιο παιχτη εμφανιζει την οθονη Winner και μηνυμα οτι νικησε ο παιχτης αυτος.*/
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
	/*Δεχεται ως παραμετρο μια μεταβλητη τυπου Player και ελεχει αμα το αθροιμα του χεριου του ειναι 
	 *21 τοτε αυξανει τις νικες του κατα μια.*/
	public void check_21_wins(Player pl,JTextField text)
	{
		if (pl.print_sum_hand()==21)
		{
			pl.setWins(pl.getWins()+1);
			text.setText(pl.getNickname() + " won! press Start");
	}
	}
}
