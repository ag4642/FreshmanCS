   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
    public class Driver05
	 {
       public static void main(String[] args) throws Exception
		 {
         Comparable[] array = input("data.txt");
         sort(array);
         output(array, "output.txt");
      }
   	
       public static Comparable[] input(String filename) throws Exception
		 {	
         Scanner infile = new Scanner( new File(filename) );
         int numitems = infile.nextInt();
         Comparable[] array = new Distance[numitems];
         for(int k = 0; k < numitems; k++){
            array[k] = new Distance(infile.nextInt(), infile.nextInt());
         }
         infile.close();
         return array;
      }
      
       public static void output(Object[]array, String filename) throws Exception
		 {
         System.setOut(new PrintStream(new FileOutputStream(filename)));
         for(int k = 0; k < array.length; k++)
            System.out.println(array[k]);
      }
      
       public static void sort(Comparable[] array)
		 {
         int maxPos;
         for(int k = 0; k < array.length; k++)
			{
            maxPos = findMax(array, array.length - k - 1);
            swap(array, maxPos, array.length - k - 1);
         }
      }
       public static int findMax(Comparable[] array, int upper)
		 {
         int maxIndex = 0;
         for(int x = upper; x >= 0; x--)
			{
            if(array[x].compareTo(array[maxIndex]) > 1)
				{
               maxIndex = x;
            }
         }
         return maxIndex;
      }
       public static void swap(Comparable[] array, int a, int b)
		 {
         Comparable temp = array[a];
         array[a] = array[b];
         array[b] = temp;
      }
   }