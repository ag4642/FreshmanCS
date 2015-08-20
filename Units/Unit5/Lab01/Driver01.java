   import java.io.*;
    public class Driver01
	 {
       public static void main(String[] args)
		 {
      	//input
         double[] myArray = {2.0, 3.7, 9.9, 8.1, 8.5, 7.4, 1.0, 6.2};
      				      
      	//sort the array
         int maxIndex = 0;
         double temp;
         for(int x = 0; x < myArray.length; x++)
			{
				maxIndex = 0;
            for(int y = myArray.length - 1 - x; y >= 0; y--)
				{
               if(myArray[y] > myArray[maxIndex])
					{
                  maxIndex = y;
               }
            }
				
				//swap
            temp = myArray[myArray.length - 1 - x];
            myArray[myArray.length - 1 - x] = myArray[maxIndex];
            myArray[maxIndex] = temp;
         }
      	//output
         for(int x = 0; x < myArray.length; x++)
			{
            System.out.println(myArray[x]);
         }    	
      }
   }