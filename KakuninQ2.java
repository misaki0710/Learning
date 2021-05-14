public class KakuninQ2{
	public static void main(String[] args){
		System.out.println("Please enter a word.");
		String moji = new java.util.Scanner(System.in).nextLine();
		System.out.println("Please enter a nuber you want to repeat.");
		int kaisu = new java.util.Scanner(System.in).nextInt();
		
		mojiPrint(moji,kaisu);
	}
	public static void mojiPrint(String moji,int kaisu){
		for (int i =0; i < kaisu; i++){
			System.out.println(moji);
		}
	}
}