   import java.util.Scanner;
   public class Driver01
   {
      public static final int NUMITEMS = 10;
      public static void main(String[] args)
      {
         double[] array = new double[NUMITEMS];
         Scanner keyboard = new Scanner(System.in);
         for(int x = 0; x < NUMITEMS; x++)
         {
            System.out.print("#" + (x+1) + ":  ");
            array[x] = keyboard.nextDouble();
            System.out.println();
         }
         double sum = 0;
         for(int x = 0; x < NUMITEMS; x++)
            sum += array[x];
            
         double avg = sum/10;
         for(int x = 0; x < NUMITEMS; x++)
            avg = sum/10;                            
            
         double min = array[0];
         for(int x = 0; x <NUMITEMS; x++)
            min = Math.min(array[x], min);
            
         double max = 0;
         for(int x = 0; x <NUMITEMS; x++)
            max = Math.max(array[x], max);
         System.out.print("Sum:"+sum+"\nAvg:"+avg+"\nMin:"+min+"\nMax:"+max);
      }
   }