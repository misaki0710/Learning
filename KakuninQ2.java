public class KakuninQ2{
	public static void main(String[] args){
		
		Cube c = new Cube();
		
		c.width = 2;
		c.height = 3;
		c.depth = 4;
		
		//int getArea = c.getArea();
		//int getVolume = c.getVolume();
		System.out.println("haba = " + c.width + " takasa = " + c.height + " okuyuki = " + c.depth);
		System.out.println("mennseki ha " + c.getArea());
		System.out.println("taiseki ha " + c.getVolume());
		
	}
}