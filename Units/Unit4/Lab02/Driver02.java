   import java.util.Scanner;
   public class Driver02
   {
      public static final int NUMITEMS = 15;
      public static void main(String[] args)
       
      {
         double[]f = new double[NUMITEMS];
         double[]c = new double[NUMITEMS];
         Scanner Keyboard = new Scanner(System.in);
         for(int x = 0; x < 10; x++)
         {
            System.out.println("#" + (x+1) + ":"); 
            f[x] = Keyboard.nextDouble();
         }
         for(int x = 10; x < 15; x++)
         {
            f[x] = (int)(Math.random()* 10000) / 10.0;
            System.out.println("#" + (x+1) + ":" + f[x]);	      
         }
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