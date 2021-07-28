public class Sougou03Q11{
	public static void main(String[] args){
		KeisanNormal n = new KeisanNormal();
		System.out.println(n.tashizan(5,2));
		System.out.println(KeisanStatic.tashizan(5,2));
		
		System.out.println(n.hikizan(5,2));
		System.out.println(KeisanStatic.hikizan(5,2));
	}
}