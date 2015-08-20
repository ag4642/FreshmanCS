import java.io.*;
import java.lang.Math.*;

	public class Driver06
	{
		public static void main(String[] args) throws Exception
		{
			//System.setOut(new PrintStream(new FileOutputStream("output.txt")));
			
			int NUMITEMS =(int)(Math.random() * 30 + 75);
			Shape[] theArray = new Shape[NUMITEMS];
			System.out.println("Shapes");
			System.out.println("------");
			for (int x = 0; x < NUMITEMS; x++)
				{
					int y = (int)(Math.random() * 4 +1);
					switch(y)
					{
						case 1:
							theArray[x] = new Circle(Math.random() * 100);
							break;
						case 2:
							theArray[x] = new Rectangle(Math.random() * 100, Math.random() * 100);
							break;
						case 3:
							theArray[x] = new Triangle(Math.random() * 100);
							break;
						case 4:
							theArray[x] = new Square(Math.random()*100);
							break;
						
					}
					System.out.println(theArray[x].findArea() + "\t" + theArray[x].toString());
				}	
		}
	}