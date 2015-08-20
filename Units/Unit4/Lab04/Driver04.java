   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
   import javax.swing.*;  //JOptionPane
	
    public class Driver04
   {
       public static void main(String[] args)
      {
         Scanner infile = null;
         try
         {
            String filename = JOptionPane.showInputDialog("Enter filename");
            infile = new Scanner (new File(filename));
         }
             catch (FileNotFoundException e)
            {
               JOptionPane.showMessageDialog(null, "Error: File not found.");
               System.exit(0);
            }
			final int NUMITEMS = infile.nextInt();
         double[] array = new double[NUMITEMS];
         double sum = 0.0;
			for(int x = 0; x < NUMITEMS; x++)
				array[x] = infile.nextDouble();
         for(int x = 0; x < NUMITEMS; x++)
            sum = sum += array[x];
         double avg = sum/NUMITEMS;
         for(int x = 0; x < NUMITEMS; x++)
            avg = sum/NUMITEMS;
			double min = array[0];
         for(int x = 0; x <NUMITEMS; x++)
            min = Math.min(array[x], min);
         double max =0;
         for(int x = 0; x <NUMITEMS; x++)
            max = Math.max(array[x], max);
         System.out.print("Sum:"+sum+"\nAvg:"+avg+"\nMin:"+min+"\nMax:"+max);
      }
   }