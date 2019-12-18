package blackjack;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JTextField;

public class Player {

	

	public String getNickname() {
		return nickname;
	}


	private String nickname;
	private int wins;
	private int money;
	private int random_number;

	private ArrayList<Integer> hands;
	
	
	public Player() {
		nickname = "";
		wins = 0;
		money = 0;
		random_number = 0;
		hands = new ArrayList<Integer>();
	}


	public void setRandom_number(int random_number) {
		this.random_number = random_number;
	}


	public ArrayList<Integer> getHands() {
		return hands;
	}
	
	


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public void setHands(ArrayList<Integer> hands) {
		this.hands = hands;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	
	
	
	
	public int getRandom_number() {
		return random_number;
	}


	
	
	public void getNumber()
	{
	    Random randomGenerator = new Random();
		random_number = randomGenerator.nextInt(10);
	
	}
	
	public void Draw_Hands(Deck deck)
	{
		int i = deck.Draw();
		hands.add(i);
	}
	
	
	
	
	public int print_sum_hand()
	{
		int sum=0;
		for (int i=0;i<hands.size();i++)
		{
			sum = sum + hands.get(i);
		}
		
		return sum;
	}
	
	
	public String printHand()
	{
		String hand = null;
		for (int i=0;i<hands.size();i++)
		{
			if (hand == null)
				hand = Integer.toString(hands.get(i));
			else
			hand =hand + "," + Integer.toString(hands.get(i));
			
		}
	return hand;	
	
	}
	

	
	public int getWins() {
		return wins;
	}


	public void setWins(int wins) {
		this.wins = wins;
	}


	
	public void Draw_phase_wins(Deck deck,int i)
	{
		
		
		int card;
		if (i==0)
		{	
			 card = deck.Draw();
			hands.add(card);
			
			 card = deck.Draw();
			hands.add(card);
		}
		else
			{
			 card = deck.Draw();
				hands.add(card);
				
	
			}		
	}


	
	public void Dealer(Deck deck)
	{
		
	int card;
	
		 card = deck.Draw();
			hands.add(card);
			
			 card = deck.Draw();
			hands.add(card);
		
	
			
			while (this.print_sum_hand()<=16)
			{
				 card = deck.Draw();
					hands.add(card);
			}
			
	}
	

	
	
	
	
	
	
}
