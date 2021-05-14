public class KakuninQ1{
	public static void main(String[] args){
		System.out.println("Please enter a number.");
		int atai = new java.util.Scanner(System.in).nextInt();
		judgeGusu(atai); 
	}
	
	public static void judgeGusu(int atai){
		String judge = "kisu";
		if (atai % 2 == 0){
			judge = "gusu";
		}
		System.out.println(atai + " is " + judge + ".");
	}
}