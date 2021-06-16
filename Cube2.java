public class Cube2 extends Rect2{
	int depth;
	
	public Cube2(int x,int y,int z){
		super(x,y);
		this.depth = z;
	}
	
	public int getVolume(){
		return getArea() * this.depth;
	}
}