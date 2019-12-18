/*Η δουλεια της κλασης Deck ειναι να ανακατευει την τραπουλα σε καθε γυρo
  και το να δινει τα αρχικα φυλλα στο καθε παιχτη αλλα και επιπλεον φυλλο 
  οταν ο παιχτης το ζηταει.Καθε φορα που τελειωνει ενας γυρος στο παιχνιδι 
  με τη βοηθεια τις κλασης αυτης ανακατεβετε η τραπουλα και επισης καθε φορα
   που ενα παικτης πρεπει να τραβηξει φυλλο η κλαση αυτη το πραγματοποιει.*/
package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private ArrayList<Integer> deck ;
	
	
	public Deck()
	{
		deck = new ArrayList<Integer>();
	}
	
	//Δημιουργει τα φυλλα τις τραπουλας και επειτα τα ανακατευει.
	public void DeckLoad()
	{
		
		deck.clear();
		
		
		for(int i=2;i<12;i++)
		{
			if (i!=10)
			{
				for(int j=0;j<4;j++)
				{
					deck.add(i);
				}
			}
			else
			{
				for (int j=0;j<16;j++)
				{
					deck.add(i);
				}
			}
		}
		
		
		for (int i = deck.size() - 1; i > 0; i--) {
	        int j = (int) Math.floor(Math.random() * (i + 1));
	        int temp = deck.get(i);
	        deck.set(i, deck.get(j));
	        deck.set(j, temp);
	    }
		
	}
	
	//Eπιλεγει ενα φυλλο απο την τραπουλα τυχαια και επιστρεφει την τιμη του φυλλου.
	public int Draw()
	{
		Random randomGenerator = new Random();
		int	random_number = randomGenerator.nextInt(51);
		int a = deck.get(random_number);
		return a;
	}
	
}


