   import java.io.*;
   import java.util.*;
   public class Driver02
   {
      public static void main(String[] args) throws Exception
      {
         double[] array = input("..\\Lab00\\data.txt");
         sort(array);
         output(array, "output.txt");
      }
      public static double[] input(String filename) throws Exception
      {
         Scanner infile = new Scanner(new File(filename));
         int numitems = infile.nextInt();
         double[] array1 = new double[numitems];
         for(int i = 0; i < numitems; i++)
         {
            array1[i] = infile.nextDouble();
         }
         infile.close();
         return array1;
      }
      public static void sort(double[] array)
      {
         int maxPos;
         for(int k = 0; k < array.length; k++)
         {
            maxPos = findMax(array, array.length - k - 1);
            swap(array, maxPos, array.length - k - 1);
         }
      }
      public static int findMax(double[] array, int upper)
      {
         int maxIndex = 0;
         for(int x = upper; x >= 0; x--)
         {
            if(array[x] > array[maxIndex])
            {
               maxIndex = x;
            }
         }
         return maxIndex;
      }
      public static void swap(double[] array, int a, int b)
      {
         double temp = array[b];
         array[b] = array[a];
         array[a] = temp;
      }
      public static void output(double[] array, String filename) throws Exception
      {
         System.setOut(new PrintStream(new FileOutputStream(filename)));
         for(int k = 0; k < array.length; k++)
         {
            System.out.println(array[k]);
         }
      }
   }