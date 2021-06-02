public class Hero{
	String name;
	int hp;
	Sword sword;
	
	public Hero(){
		this("dummy");
	}
	

	public Hero(String name){
		this.hp = 100;
		this.name = name;
		
	}
	
	public void sleep(){
		this.hp = 100;
		System.out.println(this.name + "wa nemutte kaihuku!!");
	}
	
	public void sit(int sec){
		this.hp += sec;
		System.out.println(this.name + " wa " + sec + "s suwatta!");
		System.out.println("HP " + sec + "point kaihuku");
	}
	
	public void slip(){
		this.hp -= 5;
		System.out.println(this.name + "wa koronda!");
		System.out.println("damage 5...");
	}
	
	public void run(){
		System.out.println(this.name + "wa nigedasita!");
		System.out.println("GAME OVER");
		System.out.println("final HP : " + this.hp + "deshita");
	}
}