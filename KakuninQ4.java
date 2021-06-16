public class KakuninQ4{
	public static void main(String[] args){
		Cube2 c2 = new Cube2(2,3,4);
		
		System.out.println("haba = " + c2.width + " takasa = " + c2.height + " okuyuki = " + c2.depth);
		System.out.println("menseki ha " + c2.getArea() + " desu");
		System.out.println("taiseki ha " + c2.getVolume() + " desu");
	}
}