public class Rectangle extends Shape
{
	private double myBase;
	private double myHeight;
	
	 public Rectangle(double x, double y) 
	 {
	 		myBase = x;
			myHeight = y;
	 }
	 
	 public double findArea()
	 {
	 		return myBase * myHeight;
	 }
	 
	 public double findDiagonal()
	 {
			return Math.sqrt(Math.pow(myBase, 2)) + (Math.pow(myHeight, 2));
	 }
	 
	 public double findPerimeter()
	 {
	 	return (2 * myHeight) + (2 * myBase);
			
	 }
	 
	 public double getBase()
	 {
	 		return myBase;
	 }
	 
	 public double getHeight()
	 {
	 		return myHeight;
	 }
	 
	 public void setBase(double x)
	 {
			x = myBase;
	 }
	 
	 public void setHeight(double x)
	 {
	 		x = myHeight;
	 }
}
	
	