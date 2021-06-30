public class Main01{
	public static void main(String[] args){
		Hero h = new Hero();
		Inn inn = new Inn();
		King k = new King();
		
		h.setName("null");
		
		inn.checkIn(h);
		System.out.println(h.getName() + " ha ippaku shite HP ga " + h.getHp() );
		
		System.out.println(h.getName() + " ha ousama ni atta");
		k.talk(h);
	}
}