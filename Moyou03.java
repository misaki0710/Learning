public class Moyou03{
	public static void main(String[] args){
		
		int size = 10;
		String maru = "›";
		
		for(int i=0; i<size; i++){
			int j;
			
			for(j=0; j<i; j++){
				System.out.print(" ");
			}
			for(j=i; j<size; j++){
				System.out.print(maru);
			}
			System.out.println(" ");
			
		}
		
	}
}