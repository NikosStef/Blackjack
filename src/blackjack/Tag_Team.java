/*Η κλαση αυτη αφορα τη λειτουργια του mode Tag Team. Αποθηκευει τον αριθμο των νικων που εχουν θεσει ως οριο οι δυο ομαδες και με τις
 *μεθοδους της διαλεγει εναν παικτη απο καθε ομαδα ωστε να την αντιπροσωπευσει και οριζει dealer μεταξυ των δυο. Επισης ελεχγει ποιος
 *ειναι ο νικητης και δινει την νικη στην ομαδα του.*/
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
	
	public int getWinsofTeam1(Player p1, Player p2){
		return p1.getWins() + p2.getWins();
	}
	
	public int getWinsofTeam2(Player p3, Player p4){
		return p3.getWins() + p4.getWins();
	}	
	//Οριζει ως dealer εναν απο τους δυο παικτες.
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
	//Δεχεται ως παραμετρο μια μεταβλητη τυπου Player, η οποια αντιπροσωπευει τον νικητη του γυρου, και προσθετει την νικη στην ομαδα του.
	public void AddWin(Player p){
		p.setWins(p.getWins() + 1);
	}
	/*Δεχεται ως παραμετρους τους δυο παικτες και ελεχγει ποιος παικτες κερδισε τον γυρο. Επιστρεφει τον παικτη που αναδειχθηκε νικητης.*/
	public int CompareHands(Player p1, Player p2){
		int w = 0;
		
		if((p1.print_sum_hand()>p2.print_sum_hand()) || p2.print_sum_hand()>21 && p1.print_sum_hand()<22)
		{			
			p1.getHands().clear();
			w = 0;
		}
		else if((p2.print_sum_hand() > p1.print_sum_hand()) || p1.print_sum_hand() >21 && p2.print_sum_hand()<22){
			p2.getHands().clear();
			w = 1;
		}
		return w;
	}
	
	public boolean Check_21(Player p){
		boolean flag = false;
		if(p.print_sum_hand()== 21){
			flag = true;
		}
		return flag;
	}
	/*Δεχεται ως παραμετρους τους παικτες και οριζει ποιοι παικτες ειναι αυτη που θα εκπροσωπευσουν καθε ομαδα στον επομενο γυρο.*/
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
	
	public void ClearHands(Player p1, Player p2, Player p3, Player p4)
	{
		p1.getHands().clear();
		p2.getHands().clear();
		p3.getHands().clear();
		p4.getHands().clear();
	}
}
