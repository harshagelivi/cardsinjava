class Game{
	Center center;
	Set set;
	
	Game(){
		set = new Set();
		center = new Center(set, 2);
		Player p1,p2;
		p1 = new Player();
		p2 = new Player();		
	}
}
