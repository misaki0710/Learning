public class Moyou01{
	public static void main(String[] args){
	
	String maru = "Åõ";
	String sankaku = "Å¢";
	String shikaku = "Å†";
	
	for(int i=0; i<9; i++){
		System.out.print(maru);
		for(int j=0; j<8; j++){
			System.out.print(sankaku);
			for(int k=0; k<2; k++){
				System.out.print(shikaku);
			}
		}
		System.out.println("");
	}
	
	}
}