import java.util.*;
class Player{
	String nickname;
	Map<Player, Money> creditors, debitors;
	Card[] cards;
	Money money;
	Player(int n){
		creditors = new Map<Player, Money>();
		debitors = new Map<Player, Money>();
		cards= new Card[2];
		money = new Money();
		money.add(n);
	}
	
	
}
