package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	

	
	
private ArrayList<Integer> deck ;
	
	
	public Deck()
	{
		deck = new ArrayList<Integer>();
	}
	
	//γεμισμα της τραπουλας
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
	

	public int Draw()
	{
		Random randomGenerator = new Random();
		int	random_number = randomGenerator.nextInt(51);
		int a = deck.get(random_number);
		return a;
	}
	
	
}


