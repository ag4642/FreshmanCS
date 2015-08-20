   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   public class Display12 extends JPanel{
      private JButton[] button;
      private int max, min;
      public Display12(ActionListener lis){
         setLayout(new GridLayout(5, 5, 5, 5));
      	
         min = 0;
         max = 24;
         button = new JButton[25];
         for(int x = 0; x < 25; x++){
            button[x] = new JButton("" + (x + 1));
            button[x].addActionListener(lis);
            button[x].setHorizontalAlignment(SwingConstants.CENTER);
            button[x].setFont(new Font("Serif", Font.BOLD, 20));
            button[x].setBackground(Color.yellow);
            add(button[x]);
         }
      }
      public void reset()
      {
         for(int x = 0; x < button.length; x++){
            button[x].setBackground(Color.yellow);
            button[x].setForeground(Color.black);
         }
         min = 0;
         max = 24;
      }
      public void displayWinner(int target)
      {
         button[target - 1].setBackground(Color.green);
         for(int x = min; x <= max; x++)
         {          
            button[x].setForeground(Color.gray);
         }
      }
      public void displayLoser(int target)
      {
         for(int x = 0; x < button.length; x++)
         {
            button[x].setForeground(Color.red);
            button[x].setBackground(Color.red);
         }
         button[target - 1].setBackground(Color.black);
         button[target - 1].setForeground(Color.gray);
      }
      public void displayTooHigh(int guess)
      {
         for(int x = 0; x < button.length; x++)
         {
            if(x >= guess)
            {
               button[x].setForeground(Color.red);
               button[x].setBackground(Color.red);
               max = guess - 2;
            }
         }
         button[guess - 1].setForeground(Color.red);
         button[guess - 1].setBackground(Color.red);
      }
      public void displayTooLow(int guess)
      {
         for(int x = 0; x < button.length; x++)
         {
            if(x < guess)
            {
               button[x].setForeground(Color.red);
               button[x].setBackground(Color.red);
               min = guess;
            }
         }
      }
   }