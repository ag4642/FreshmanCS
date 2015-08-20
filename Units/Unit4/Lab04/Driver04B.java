   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
   import javax.swing.*;  //JOptionPane
	
    public class Driver04B
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
         int count = 0;
       //  final int NUMITEMS = infile.nextInt(); //does nothing to figure out length
         double[] array = new double[10000];
         while(infile.hasNext())
         {
            array[count] = infile.nextDouble();
            count++;
         }
      	
         double sum= 0.0;
         for(int x = 0; x < count; x++)
            sum = sum += array[x];
         double avg = sum/count;
         for(int x = 0; x < count; x++)
            avg = sum/count;
         double min = array[0];
         for(int x = 0; x <count; x++)
            min = Math.min(array[x], min);
         double max =0;
         for(int x = 0; x <count; x++)
            max = Math.max(array[x], max);
         System.out.print("Sum:"+sum+"\nAvg:"+avg+"\nMin:"+min+"\nMax:"+max);
      }
   }