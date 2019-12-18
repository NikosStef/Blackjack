package blackjack;

public class Tag_Team {
	
	private int number_wins;
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	
	public Tag_Team(){
		this.number_wins = 0;
		this.player1 = new Player();
		this.player2 = new Player();
		this.player3 = new Player();
		this.player4 = new Player();
	}

	public int getNumber_wins() {
		return number_wins;
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public Player getPlayer3() {
		return player3;
	}

	public Player getPlayer4() {
		return player4;
	}
	
	public int getWinsofTeam1(){
		return player1.getWins() + player2.getWins();
	}
	
	public int getWinsofTeam2(){
		return player3.getWins() + player4.getWins();
	}	
	
	public int set_Dealer(int count){
		if (count == 0 || count == 1){
			return 0;
		}
		else 
			return 1;
	}

	public void setNumber_wins(int number_wins) {
		this.number_wins = number_wins;
	}
	
	public void AddWin(Player p){
		p.setWins(p.getWins() + 1);
	}
	
	public Player CompareHands(Player p1, Player p2){
		Player winner = new Player();
		
		if((p1.print_sum_hand()>p2.print_sum_hand()) || p2.print_sum_hand()>21)
		{			
			p1.getHands().clear();
			winner = p1;
		}
		else if((p2.print_sum_hand() > p1.print_sum_hand()) || p1.print_sum_hand() >21){
			p2.getHands().clear();
			winner = p2;
		}
		return winner;
	}
	
	public boolean Check_21(Player p){
		boolean flag = false;
		if(p.print_sum_hand()== 21){
			flag = true;
		}
		return flag;
	}
	
	public Player[][] Choose_Players(){
		Player[][] turn = new Player[4][2];
		turn[0][0] = player1;
		turn[0][1] = player3;
		turn[1][0] = player2;
		turn[1][1] = player4;
		turn[2][0] = player1;
		turn[2][1] = player4;
		turn[3][0] = player2;
		turn[3][1] = player3;
		
		return turn;
	}

}
