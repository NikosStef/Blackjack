/*Η κλαση Money ειναι υποκλαση της κλασης mode. εχει μεθοδους που αφορουν την λειτουργια του mode Μode και αποθηκευει το αρχικο ποσο 
 *με το οποιο ξεκιναει ενας παικτης καθος και τα Blinds.Με τις μεθοδου τις εμφανιζει τον νικητη του παιχνιδιου ελεχει ποιος απο τους 
 *2 παιχτης η dealer νικησε στον καθε γυρο και κανει τις προσθαφαιρεσεις αναλογως το τι πονταρε και τελος ελεχει αμα το αθροισμα του 
 *χεριου των παιχτων ειναι μεγαλυτερο η ισο του 21 οποτε παλι κανει τις προσταφαιρεσεις αναλογος.*/
package blackjack;

import javax.swing.JTextField;

public class Money extends Mode {

	private int start_money;
	private int finish_money;
	private int blinds;
	
	public Money(Player player1, Player player2, Player player3, Player player4, Player player5, Player player6,
			Player dealer, int number_players) 
	{
		
		super(player1, player2, player3, player4, player5, player6, dealer, number_players);
		this.start_money = 0;
		this.finish_money = 0;
		this.blinds = 0;
	}

	

	public int getBlinds() {
		return blinds;
	}

	public void setBlinds(int blinds) {
		this.blinds = blinds;
	}



	public int getStart_money() {
		return start_money;
	}



	public void setStart_money(int start_money) {
		this.start_money = start_money;
	}



	public int getFinish_money() {
		return finish_money;
	}



	public void setFinish_money(int finish_money) {
		this.finish_money = finish_money;
	}

	
	public void check_21_or_plus(Player pl,int bet,JTextField text)
	{
		if (pl.print_sum_hand()==21)
		{
			pl.setMoney(pl.getMoney() + bet);
			text.setText(pl.getNickname() + " won! press Start");
		}
		
		if (pl.print_sum_hand()>21)
		{
			pl.setMoney(pl.getMoney() - bet);
			text.setText(pl.getNickname() + "lost please press Start");
		}
	}
	
	
	public void winner()
	{
		
		if ((getPlayer2().getMoney()==0 && getPlayer3().getMoney()==0 && getPlayer4().getMoney()==0
				&& getPlayer5().getMoney()==0 && getPlayer6().getMoney()==0 && getPlayer1().getMoney()!=0)
				|| getPlayer1().getMoney()>=finish_money)
		{
			winner wn = new winner(getPlayer1());
		}
		
		if ((getPlayer1().getMoney()==0 && getPlayer3().getMoney()==0 && getPlayer4().getMoney()==0
				&& getPlayer5().getMoney()==0 && getPlayer6().getMoney()==0 && getPlayer2().getMoney()!=0)
				|| getPlayer2().getMoney()>=finish_money)
		{
			winner wn = new winner(getPlayer2());
		}
		
		if ((getPlayer1().getMoney()==0 && getPlayer2().getMoney()==0 && getPlayer4().getMoney()==0
				&& getPlayer5().getMoney()==0 && getPlayer6().getMoney()==0 && getPlayer3().getMoney()!=0)
				|| getPlayer3().getMoney()>=finish_money)
		{
			winner wn = new winner(getPlayer3());
		}
		
		if ((getPlayer2().getMoney()==0 && getPlayer3().getMoney()==0 && getPlayer1().getMoney()==0
				&& getPlayer5().getMoney()==0 && getPlayer6().getMoney()==0 && getPlayer4().getMoney()!=0)
				|| getPlayer4().getMoney()>=finish_money)
		{
			winner wn = new winner(getPlayer4());
		}
		
		if ((getPlayer2().getMoney()==0 && getPlayer3().getMoney()==0 && getPlayer4().getMoney()==0
				&& getPlayer1().getMoney()==0 && getPlayer6().getMoney()==0 && getPlayer5().getMoney()!=0)
				|| getPlayer5().getMoney()>=finish_money)
		{
			winner wn = new winner(getPlayer5());
		}
		
		if ((getPlayer2().getMoney()==0 && getPlayer3().getMoney()==0 && getPlayer4().getMoney()==0
				&& getPlayer5().getMoney()==0 && getPlayer1().getMoney()==0 && getPlayer6().getMoney()!=0)
				|| getPlayer6().getMoney()>=finish_money)
		{
			winner wn = new winner(getPlayer6());
		}
	}
	
	
	
	
	
	public void Compare_hands_money(Player pl1,Player pl2,JTextField text,int bet)
	{
		if ((pl1.print_sum_hand()>pl2.print_sum_hand()) || pl2.print_sum_hand()>21)
		{
			pl1.setMoney(pl1.getMoney() + bet);
			text.setText(pl1.getNickname() + " won! press Start");
			
		}
		else
		{
			text.setText(pl1.getNickname() + " lost! press Start");
			pl1.setMoney(pl1.getMoney() - bet);
		}
		
		}
	
	
	public void result_money(int counter,JTextField text,int bet)
	{
		if (counter==1)
			Compare_hands_money(getPlayer1(),getDealer(),text,bet);
			
			if (counter==2)
				Compare_hands_money(getPlayer2(),getDealer(),text,bet);
			
			if (counter==3)
				Compare_hands_money(getPlayer3(),getDealer(),text,bet);
			
			if (counter==4)
				Compare_hands_money(getPlayer4(),getDealer(),text,bet);
			
			if (counter==5)
				Compare_hands_money(getPlayer5(),getDealer(),text,bet);
			
			if (counter==6)
				Compare_hands_money(getPlayer6(),getDealer(),text,bet);
	}
	
	
	public void starting_money()
	{
		if (getNumber_players()==2)
		{
			getPlayer1().setMoney(this.getStart_money());
			getPlayer2().setMoney(this.getStart_money());
		}
		
		if (getNumber_players()==3)
		{
			getPlayer1().setMoney(this.getStart_money());
			getPlayer2().setMoney(this.getStart_money());
			getPlayer3().setMoney(this.getStart_money());
			
		}
		
		if (getNumber_players()==4)
		{
			getPlayer1().setMoney(this.getStart_money());
			getPlayer2().setMoney(this.getStart_money());
			getPlayer3().setMoney(this.getStart_money());
			getPlayer4().setMoney(this.getStart_money());
		}
		
		if (getNumber_players()==5)
		{
			getPlayer1().setMoney(this.getStart_money());
			getPlayer2().setMoney(this.getStart_money());
			getPlayer3().setMoney(this.getStart_money());
			getPlayer4().setMoney(this.getStart_money());
			getPlayer5().setMoney(this.getStart_money());
		}
		
		if (getNumber_players()==6)
		{
			getPlayer1().setMoney(this.getStart_money());
			getPlayer2().setMoney(this.getStart_money());
			getPlayer3().setMoney(this.getStart_money());
			getPlayer4().setMoney(this.getStart_money());
			getPlayer5().setMoney(this.getStart_money());
			getPlayer6().setMoney(this.getStart_money());
		}
	}
	
	
	
	public void whos_turn_money(int counter,JTextField text)
	{
		if (counter==1)
		{
			if (getPlayer1().getMoney()>0)
			text.setText(getPlayer1().getNickname() + " Please bet!");
			else
				text.setText(getPlayer1().getNickname() + " lost please press Start");
		}
		if (counter==2)
		{
			if (getPlayer2().getMoney()>0)
			text.setText(getPlayer2().getNickname() + " Please bet!");
			else
				text.setText(getPlayer2().getNickname() + " lost please press Start");
			
		}
		if (counter==3)
		{
			if (getPlayer3().getMoney()>0)
			text.setText(getPlayer3().getNickname() + " Please bet!");
			else
				text.setText(getPlayer3().getNickname() + " lost please press Start");
		}
		if (counter==4)
		{
			if (getPlayer4().getMoney()>0)
			text.setText(getPlayer4().getNickname() + " Please bet!");
			else
				text.setText(getPlayer4().getNickname() + " lost please press Start");
		}
		if (counter==5)
		{
			if (getPlayer5().getMoney()>0)
			text.setText(getPlayer5().getNickname() + " Please bet!");
			else
				text.setText(getPlayer5().getNickname() + " lost please press Start");
		}
		if (counter==6)
		{
			if (getPlayer6().getMoney()>0)
			text.setText(getPlayer6().getNickname() + " Please bet!");
			else
				text.setText(getPlayer6().getNickname() + " lost please press Start");
		}
	}
	
}
