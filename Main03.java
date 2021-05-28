public class Main03{
	public static void main(String[] args){
		
		Cleric c = new Cleric();
		c.name = "misaki";
		c.selfAid();
		System.out.println("genzai no " + c.name + " no mp ha " + c.mp);
		System.out.println("");
		int heal = c.pray(4);
		c.mp += heal;
		System.out.println(c.name + " no mp ha " + heal + " point kaihuku shita");
		System.out.println("genzai no " + c.name + " no mp ha " + c.mp);
	}
}