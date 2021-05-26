public class ShisokuEnzan{
	
	public int keisan(int atai1, int atai2, int shubetsu){
		int keisan = 0;
		
		switch(shubetsu){
			case 1:
				keisan =atai1 + atai2;
				break; 
			case 2:
				keisan = atai1 - atai2;
				break;
			case 3:
				keisan = atai1 * atai2;
				break; 
			case 4:
				keisan = atai1 / atai2;
				break; 
		}
		return keisan;
	}
	
}