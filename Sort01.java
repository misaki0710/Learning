public class Sort01{
	public static void main(String[] args){
		
		int[] array = new int[5];
		
		for(int i = 0; i < array.length; i++){
			array[i] = new java.util.Random().nextInt(10);
			System.out.print(array[i]);
		}
		
		//¬‚³‚¢‡
		for(int i = 0; i < array.length-1; i++){
			for(int j = array.length-1; j > i; j--){
				if(array[j] < array[j-1]){
					int w = array[j-1];
					array[j-1] = array[j];
					array[j] = w;
				}
			}
		}
		System.out.println("");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
		}
		
		//‘å‚«‚¢‡
		for(int i = 0; i < array.length-1; i++){
			for(int j = array.length-1; j > i; j--){
				if(array[j] > array[j-1]){
					int w = array[j-1];
					array[j-1] = array[j];
					array[j] = w;
				}
			}
		}
		System.out.println("");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i]);
		}
		
		
	}
}