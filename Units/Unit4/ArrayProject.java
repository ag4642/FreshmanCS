   import javax.swing.*;
   import java.awt.*;
   import static java.lang.Math.*;
   public class ArrayProject extends JPanel
   {
      private JTextField[] input;
      public ArrayProject()
      {
         setLayout(new GridLayout(2, 18));
      
         for(int x = 1; x <= 18; x++)
         {
            add(new JLabel("" + x, SwingConstants.CENTER));
         }
      
         input = new JTextField[18];
         for(int x = 0; x < input.length; x++)
         {
            input[x] = new JTextField();
            add(input[x]);
         }
      }
      public int sum()
      {
         int sum = 0;
         for(int x = 0; x < input.length; x++) 
            sum += Double.parseDouble(input[x].getText());
         return sum;
      }
      public double avg()
      {
         int sum = 0;
         double avg = 0;
         for(int x = 0; x < input.length; x++) 
            sum += Double.parseDouble(input[x].getText());		
         avg = sum/18;
         return avg;
      }
      public double min()
      {
         double min = Double.parseDouble(input[0].getText());
         for(int x = 1; x <input.length; x++)
         {
            if(Double.parseDouble(input[x].getText()) < min)
               min = Double.parseDouble(input[x].getText()); 
         }
         return min;
      }
      public double max()
      {
         double max = Double.parseDouble(input[0].getText());
         for(int x = 1; x <input.length; x++)
         {
            if(Double.parseDouble(input[x].getText()) > max)
               max = Double.parseDouble(input[x].getText());
         }
         return max;
      }
   }