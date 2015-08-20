   import java.io.*;        //the File class
   import java.util.*;      //the Scanner class
    public class Driver00
	 {
       public static void main(String[] args) throws Exception
		 {
         Scanner infile = new Scanner(new File("data.txt"));
         int numitems = infile.nextInt();
         double[] array = new double[numitems];
         for(int k = 0; k < numitems; k++)
			{
            array[k] = infile.nextDouble();
         }
         infile.close();
         int minPos, maxPos;
         minPos = findMin(array);
         maxPos = findMax(array);
         System.out.println("Minimum value: " + array[minPos]);
         System.out.println("Maximum value: " + array[maxPos]);
      }
       public static int findMin(double[] apple)
		 {
         double min = 0;
         int minPos = 0;
         for(int x = 0; x < apple.length; x++)
			{
            if(apple[x] < min)
				{
               minPos = x;
            }     
         }
         return minPos;
      }
       public static int findMax(double[] banana)
		 {
         double max = 0;
         int maxPos = 0;
         for(int x = 0; x < banana.length; x++)
			{
            if(banana[x] > max)
				{
               maxPos = x;
            }   
         }
         return maxPos;
      }         
   }