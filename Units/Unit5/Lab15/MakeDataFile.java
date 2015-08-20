	//Torbert, e-mail: mr@torbert.com, website: www.mr.torbert.com
	//version 7.22.2003

   import java.io.*;
   import java.text.DecimalFormat;
   public class MakeDataFile
   {
      public static void main(String[] args) throws Exception
      {
         DecimalFormat d = new DecimalFormat("0.0");
         System.setOut(new PrintStream(new FileOutputStream("data.txt")));
         int numitems = (int)(Math.random() * 5000 + 5000);
         System.out.println(numitems);
         for(int k = 0; k < numitems; k++)
            System.out.println(d.format(Math.random() * 10));
      }
   }