public class KakuninQ3{
	public static void main(String[] args){
		
		System.out.println("atai1 wo nyuryoku shite kudasai");
		int atai1 = new java.util.Scanner(System.in).nextInt();
		System.out.println("atai1 wo nyuryoku shite kudasai");
		int atai2 = new java.util.Scanner(System.in).nextInt();
		System.out.println("enzan no shurui wo nyuryoku shite kudasai");
		System.out.println("1:tashizan 2:hikizan 3:kakuzan 4:warizan");
		int shubetsu = new java.util.Scanner(System.in).nextInt();
		
		ShisokuEnzan s = new ShisokuEnzan();
		//s.keisan(atai1,atai2,shubetsu);
		
		System.out.println("kotae ha " + s.keisan(atai1,atai2,shubetsu) + " desu");
		
	}
}