   import java.io.*;             //the File class
   import java.util.*;   		   //the Scanner class
   import javax.swing.*;         //the JOptionPane class
   import java.util.Arrays;
   public class Driver09
   {
      public static void main(String[] args) throws Exception
      {
         String[] array = input("data.txt");
         for(int k = 0; k < array.length; k++)
         {
            array[k] = convert(array[k]);
         }
         Arrays.sort(array);            
         output(array, "output.txt");
      }
   	
      public static String[] input(String filename)
      {
         Scanner infile = null;
         try
         {
            infile = new Scanner(new File(filename));
         }
            catch(FileNotFoundException e)
            {
               JOptionPane.showMessageDialog(null,"The file could not be found.");
               System.exit(0);
            }
         int numitems = infile.nextInt();
         String[] array = new String[numitems];
         for(int k = 0; k < numitems; k++)
         {
            array[k] = infile.next();
         }
         infile.close();
         return array;
      }
   	
      public static String convert(String website)
      {
         String[] packageName;
         String destination = "";
         packageName = website.split("\\.");
         destination = packageName[packageName.length - 1];
         for(int i = packageName.length - 2; i >= 1; i--)
         {
            destination = destination + "." + packageName[i];
         }
         return destination;
      }
   	
      public static void output(Object[] array, String filename)
      {
         PrintStream outfile = null;
         try
         {
            outfile = new PrintStream(new FileOutputStream(filename));
         }
            catch(FileNotFoundException e)
            {
               JOptionPane.showMessageDialog(null,"The file could not be created.");
            } 
         for(int k = 0; k < array.length; k++)
         {
            outfile.println(array[k]);
         }
      }
   }