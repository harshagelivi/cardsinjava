class Money{
	int value;
	
	Money(){
		value=0
	}
	int get(){
		return value;
	}
	
	void add(int n){
		value+=n;
	}
	void dec(int n){
		value-=n;
	}
}
