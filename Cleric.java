public class Cleric{
	String name;
	int hp = 50;
	int mp = 10;
	final int maxHp = 50;
	final int maxMp = 10;
	
	public void selfAid(){
		this.mp -= 5;
		this.hp = maxHp;
		System.out.println(name + " no mp ha zenkaihuku shita");
	}
	
	public int pray(int sec){
		int heal = (new java.util.Random().nextInt(3) + sec);
		if(maxMp > (mp + heal)){
			return heal;
		}else{
			
			return maxMp-mp;
		}
	
	}
}