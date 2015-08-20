   import java.io.*;
   import java.util.*;
   
   public class Driver03
   {
      public static final int NUMITEMS = 20;
      public static void main(String[] args) throws Exception
      {
         Scanner infile = new Scanner( new File("data.txt") );
         double[] f = new double[NUMITEMS];
         double[] c = new double[NUMITEMS];
         for(int x = 0; x < NUMITEMS; x++)
            f[x] = infile.nextDouble();
         for(int x = 0; x < NUMITEMS; x++)
         {
            c[x] = ((f[x] - 32) * (5.0 / 9.0));
         }
      
         System.out.println("Farenheit \t| Celcius");
         System.out.println("----------------| ----------------");
         for(int x = 0; x < NUMITEMS; x++)
         {
            System.out.println(f[x] + "\t" + "\t" + "|" + c[x]);
         }
      }
   }