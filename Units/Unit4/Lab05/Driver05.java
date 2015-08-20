import java.io.*;
public class Driver05
   {
       public static void main(String[] args) throws Exception
      {
         //System.setOut(new PrintStream(new FileOutputStream("output.txt")));
      
         Circle c = new Circle(75);
         Rectangle r = new Rectangle(30.0, 40.0);    
         Square s = new Square(50.0);					
      	Triangle t = new Triangle(37);
      
         System.out.println("Circle");
         System.out.println("------");
         System.out.println("Radius: " + c.getRadius());
         System.out.println("Area: " + c.findArea());
         System.out.println("Circumference: " + c.findCircumference());
         System.out.println();
      
         System.out.println("Rectangle");
         System.out.println("---------");
		   System.out.println("Base: " + r.getBase());
         System.out.println("Height: " + r.getHeight());
         System.out.println("Area: " + r.findArea());
			System.out.println("Perimeter: " + r.findPerimeter());
         System.out.println("Diagonal: " + r.findDiagonal());
         System.out.println();
         
         System.out.println("Square");
         System.out.println("------");
		   System.out.println("Side Length " + s.getBase());
         System.out.println("Area: " + s.findArea());
         System.out.println("Perimeter: " + s.findPerimeter());
		   System.out.println("Diagonal: " + s.findDiagonal());
         System.out.println();
      
         System.out.println("Triangle");
         System.out.println("--------");
         System.out.println("Side Length: " + t.getSide());
         System.out.println("Area: " + t.findArea());
         System.out.println("Perimeter: " + t.findPerimeter());
         System.out.println();
      }
   }