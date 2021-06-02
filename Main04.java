public class Main04{
	public static void main(String[] args){
		Hero h1 = new Hero();
		h1.name = "minato";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name= "asaka";
		h2.hp = 100;
		Wizard w =new Wizard();
		w.name = "sugawara";
		w.hp = 50;
		w.heal(h1);
		w.heal(h2);
		w.heal(h2);
		System.out.println(h2.hp);
		System.out.println(h1.hp);
	}
}