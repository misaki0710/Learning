public class Algorithm0419_4{
	public static void main(String[] args){
		
		String[] STR = new String[10];
		STR[0] = "R";
		STR[1] = "I";
		STR[2] = "C";
		STR[3] = "T";
		STR[4] = "E";
		STR[5] = "L";
		STR[6] = "E";
		STR[7] = "C";
		STR[8] = "O";
		STR[9] = "M";
		
		int i = 1;
		int j = STR.length;
		
		for(int a=0; a<10; a++){
			System.out.print(STR[a] + " ");
		}
		System.out.println("");
		
		for(i=0; i>(j/2); i++){
			String W = STR[i];
			STR[i] = STR[j];
			STR[j] = W;
			j--;
		}
		for(int a=0; a<10; a++){
			System.out.print(STR[a] + " ");
		}
		
		
	}
}