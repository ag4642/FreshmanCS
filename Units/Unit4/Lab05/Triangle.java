public class Triangle extends Shape
{
	private double mySide;
	
	 public Triangle (double x)
	 {
	 		mySide = x;
	 }
	 
	 public double findArea()
	 {
	 		return mySide * mySide * Math.sqrt(3.0)/4.0;
	 }
	 
	 public double findPerimeter()
	 {
	 		return mySide * 3;
	 }
	 
	 public double getSide()
	 {
	 		return mySide;
	 }
	 
	 public void setSide(double x)
	 {
	 		mySide = x;
	 }
}
