public class Rect2{
	int width;
	int height;
	
	public Rect2(int x,int y){
		this.width = x;
		this.height = y;
	}
	
	public int getArea(){
		return this.width * this.height;
	}
}