class CardsGroup{
	Card[] cards;
	
	CardsGroup(int n){
		cards = new Card[n];
	}
	CardsGroup(Set set, int n){
		cards = new Card[n*52];
		
	}
}
