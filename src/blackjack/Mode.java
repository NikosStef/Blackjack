/*Η κλαση αυτη ειναι υπερκλαση των κλασεων Wins και Money. Αποθηκευει τα στοιχεια των παιχτων καθως και των dealer.
 * Mε βαση τις μεθοδους τις κλασης αυτης πραγματοποιειτε ο γυρος του καθε παιχτει και του dealer, εμφανιζει ποιος παιχτεις εχει 
 * σειρα,μηδενιζει τα χερια των παιχτων .*/
package blackjack;

import javax.swing.JTextField;

public class Mode {

	private int number_players;
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	private Player player5;
	private Player player6;
	private Player dealer;
	private Deck deck;
	
	public Mode( Player player1, Player player2, Player player3, Player player4, Player player5,
			Player player6,Player dealer,int number_players) {
		
		this.number_players = number_players;
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
		this.player5 = player5;
		this.player6 = player6;
		this.dealer = dealer;
		deck = new Deck();
	}


	public int getNumber_players() {
		return number_players;
	}


	public void setNumber_players(int number_players) {
		this.number_players = number_players;
	}


	public Player getPlayer1() {
		return player1;
	}


	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}


	public Player getPlayer2() {
		return player2;
	}


	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}


	public Player getPlayer3() {
		return player3;
	}


	public void setPlayer3(Player player3) {
		this.player3 = player3;
	}


	public Player getPlayer4() {
		return player4;
	}


	public void setPlayer4(Player player4) {
		this.player4 = player4;
	}


	public Player getPlayer5() {
		return player5;
	}


	public void setPlayer5(Player player5) {
		this.player5 = player5;
	}


	public Player getPlayer6() {
		return player6;
	}


	public void setPlayer6(Player player6) {
		this.player6 = player6;
	}


	public Player getDealer() {
		return dealer;
	}


	public void setDealer(Player dealer) {
		this.dealer = dealer;
	}
	
	//Δεχεται τις εξης παραμετρους. Μια μεταβλητη int και μια μεταβλητη JtextField.
	//Εμφανιζει μηνυμα ποιανου παιχτη σειρα ειναι να παιξει.
	public void whos_turn(int counter,JTextField text)
	{
		if (counter==1)
		{
			text.setText(getPlayer1().getNickname() +" turn. Draw or Stop");
		}
		if (counter==2)
		{
			text.setText(getPlayer2().getNickname() +" turn. Draw or Stop");
		}
		if (counter==3)
		{
			text.setText(getPlayer3().getNickname() +" turn. Draw or Stop");
		}
		if (counter==4)
		{
			text.setText(getPlayer4().getNickname() +" turn. Draw or Stop");
		}
		if (counter==5)
		{
			text.setText(getPlayer5().getNickname() +" turn. Draw or Stop");
		}
		if (counter==6)
		{
			text.setText(getPlayer6().getNickname() +" turn. Draw or Stop");
		}
	}
	
	
	//Μηδενιζει τα φυλλα των χεριων ολων των παιχτων.
	public void clear_hands_mode()
	{
		player1.getHands().clear();
		player2.getHands().clear();
		player3.getHands().clear();
		player4.getHands().clear();
		player5.getHands().clear();
		player6.getHands().clear();
		dealer.getHands().clear();
	}
	
	/*Δεχεται τις εξης παραμετρους. Μια μεταβλητη int μια μεταβλητη τυπου Deck και δυο μεταβλητες τυπου JtextField. 
	 *Η λειτουργια ειναι οτι τραβαει τα φυλλα για τον dealer επειτα εμφανιζει τα φυλλα του χεριου του αλλα και το αθροισμα τους.*/
	public void dealer_turn(int counter,JTextField text1,JTextField text2)
	{
		getDealer().Dealer(deck);
		text1.setText(getDealer().printHand());
		text2.setText(Integer.toString(getDealer().print_sum_hand()));	
	}
	
	/*Δεχεται τις εξης παραμετρους. Μια μεταβλητη int που παιζει τον ρολο για να καταλαβαινει αμα πρεπει να παρει τα δυο αρχικα
	 *  φυλλα η να τραβηξει ενα φυλλο. 3 μεταβλητες JtextField και μια μεταβλητη τυπου Deck. Η λειτουργια τις μεθοδου ειναι οτι 
	 *  ελεχει ποιανου παικτη ειναι σειρα να παιξει και επειτα τραβαει φυλλα για τον συγκεκριμενο παιχτη και εμφανιζει τα φυλλα 
	 *  του χεριου του αλλα και το αρθροισμα των φυλλων του,τελος αμα εχει αθροισμα πανω απο 21 εμφανιζει το μηνυμα οτι ο παιχτης 
	 *  αυτος εχασε.*/
	public void game_phase(int counter,int i,JTextField text1,JTextField text2,JTextField text3)
	{
		if (counter == 1)
		{
			if (i == 0)
				deck.DeckLoad();
			
			player1.Draw_phase_wins(deck, i);
			text1.setText(player1.printHand());
			text2.setText(Integer.toString(player1.print_sum_hand()));
	
			if (player1.print_sum_hand()==0 && i!=0)
			{
				text3.setText(player1.getNickname() + " lost. Press Start");
			}
		}
		
		if (counter == 2)
		{
			if (i == 0)
				deck.DeckLoad();
			
			player2.Draw_phase_wins(deck, i);
			text1.setText(player2.printHand());
			text2.setText(Integer.toString(player2.print_sum_hand()));
			
			if (player2.print_sum_hand()==0 && i!=0)
			{
				text3.setText(player2.getNickname() + " lost. Press Start");
			}
		
		}
		if (counter == 3)
		{
			
			if (i == 0)
				deck.DeckLoad();
			player3.Draw_phase_wins(deck, i);
			text1.setText(player3.printHand());
			text2.setText(Integer.toString(player3.print_sum_hand()));
		
			
			if (player3.print_sum_hand()==0 && i!=0)
			{
				text3.setText(player3.getNickname() + " lost. Press Start");
			}
		}
		
		
		if (counter == 4)
		{
			if (i == 0)
				deck.DeckLoad();
			
			player4.Draw_phase_wins(deck, i);
			text1.setText(player4.printHand());
			text2.setText(Integer.toString(player4.print_sum_hand()));
			
		
			if (player4.print_sum_hand()==0 && i!=0)
			{
				text3.setText(player4.getNickname() + " lost. Press Start");
			}
		}
		
		
		if (counter == 5)
		{
			if (i == 0)
				deck.DeckLoad();
			
			player5.Draw_phase_wins(deck, i);
			text1.setText(player5.printHand());
			text2.setText(Integer.toString(player5.print_sum_hand()));
		
			
			if (player5.print_sum_hand()==0 && i!=0)
			{
				text3.setText(player5.getNickname() + " lost. Press Start");
			}
		}
		
		if (counter == 6 )
		{
			
			if (i == 0)
				deck.DeckLoad();
			
			player6.Draw_phase_wins(deck, i);
			text1.setText(player6.printHand());
			text2.setText(Integer.toString(player6.print_sum_hand()));
		
			
			if (player6.print_sum_hand()==0 && i!=0)
			{
				text3.setText(player6.getNickname() + " lost. Press Start");
			}
		}
	}
}
