public class Moyou02{
	public static void main(String[] args){
		String maru = "›";
		String sankaku = "¢";
		
		for(int i=0; i<5; i++){
			for(int j=0; j<i; j++){
				System.out.print(sankaku);
			}
			System.out.println("");
		}
		
		for(int i=0; i<5; i++){
			for(int j=0; j<(5-i); j++){
				System.out.print(sankaku);
			}
			System.out.println("");
		}
		
		
	}
}