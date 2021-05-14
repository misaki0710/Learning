public class CalcMenseki{
	public static void main(String[] args){
		double length = 7.0;
		double width = 8.0;
		
		double bottom = 10.0;
		double height = 5.0;
		
		double radius = 5.0;
		
		double ansSquareArea = calcSquareArea(length,width);
		double ansTriangleArea = calcTriangleArea(bottom,height);
		double ansCircleArea = calcCircleArea(radius);
		System.out.println(length + " * " + width + " = " + ansSquareArea);
		System.out.println(bottom + " * " + height + " / 2 = " + ansTriangleArea);
		System.out.println(radius + " * " + radius + " * 3.14 = " + ansCircleArea);
	}
	public static double calcSquareArea(double length,double width){
		double ansSquareArea = length * width;
		return ansSquareArea;
	}
	public static double calcTriangleArea(double bottom,double height){
		double ansTriangleArea = bottom * height / 2;
		return ansTriangleArea;
	}
	public static double calcCircleArea(double radius){
		double ansCircleArea = radius * radius * 3.14;
		return ansCircleArea;
	}
}