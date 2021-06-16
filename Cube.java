public class Cube extends Rect{
	int depth;
	
	public int getVolume(){
		return super.getArea() * this.depth;
	}
}