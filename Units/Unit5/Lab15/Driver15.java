   import java.io.*;     					 //the File class
   import java.util.*;    				    //the Scanner class
   import javax.swing.JOptionPane;
   import java.util.Arrays;
    public class Driver15{
      public static int comparisons = 0;
      public static int indexnumber = 0;
      
       public static int linear(double[] array, double target){
         comparisons = -1;
         for(int i = 0; i < array.length; i++){
            comparisons++;
            if(array[i] == target){
               return i;
            }
         }
         return -1;
      }
      
       public static int binary(double[] array, double target, int first, int last){
         if(array[(first + last) / 2] == target){
            comparisons++;
            indexnumber = (first + last) / 2;
         }
         else if(array[(first + last) / 2] > target){
            comparisons++;
            binary(array, target, first, (first + last) / 2);
         }
         else{
            comparisons++;
            binary(array, target, (first + last) / 2, last);
         }
         return indexnumber;
      }
      
       public static void main(String[] args) throws Exception{
         Scanner infile = new Scanner(new File("data.txt"));
         int numitems = infile.nextInt();
         double[] array = new double[numitems];
         for(int k = 0; k < numitems; k++){
            array[k] = infile.nextDouble();
         }
         Arrays.sort(array);
      
         int choice = 0, position;
         double target;
         while(choice != 3){
            String message = "Size = " + numitems + "\n";
            message = message + "\n1. Linear Search.";
            message = message + "\n2. Binary Search.";
            message = message + "\n3. Quit.";
            choice = (int)Double.parseDouble(JOptionPane.showInputDialog(message));
            switch(choice){
               case 1: 
                  target = Double.parseDouble(JOptionPane.showInputDialog("Decimal Target between 0.0 and 10.0: "));
                  position = linear(array, target);
                  JOptionPane.showMessageDialog(null, "" + target + (position == -1 ? " not found" : (" found at position " + position)) + " using " + comparisons + " comparisons.");
                  comparisons = 0;
                  break;
               case 2: 
                  target = Double.parseDouble(JOptionPane.showInputDialog("Decimal Target between 0.0 and 10.0: "));
                  position = binary(array, target, 0, array.length - 1);
                  JOptionPane.showMessageDialog(null, "" + target + (position == -1 ? " not found" : (" found at position " + position)) + " using " + comparisons + " comparisons.");
                  comparisons = 0;
                  break;
               case 3: 
                  JOptionPane.showMessageDialog(null, "Bye-bye!");
                  break;
               default: 
                  JOptionPane.showMessageDialog(null, "Not a valid selection.");
                  break;
            }
         }
         System.exit(0);
      }
   }