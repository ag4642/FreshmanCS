   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   import java.util.Random;
   public class Panel12 extends JPanel
   {
      private Display12 display;
      private JLabel label;
      private JButton reset;
      private int guess, target, tries;
      private String[] message;
      static Random RANDOM = new Random();
      boolean gameOver;
      public Panel12()
      {
         tries = 4;
         target = RANDOM.nextInt(25) + 1;
         setLayout(new BorderLayout());
      
         display = new Display12(new Listener1());
         add(display, BorderLayout.CENTER);
      
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         add(south, BorderLayout.SOUTH);
         label = new JLabel("You have 4 tries to guess the number.");
         south.add(label);
         reset = new JButton("Reset");
         reset.setEnabled(false);
         reset.addActionListener(new Listener2());
         south.add(reset);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            if(!gameOver)
            {
               JButton source = (JButton)e.getSource();
               guess = Integer.parseInt(source.getText());
               tries--;
               if(guess == target)
               {
                  displayWinner();
               }
               else if(tries == 0)
               {
                  displayLoser();
               }
               else if(guess > target)
               {
                  displayTooHigh();
               }
               else
               {
                  displayTooLow();
               }
            }
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.reset();
            tries = 4;
            target = RANDOM.nextInt(25) + 1;
            label.setText("You have 4 tries to guess the number.");
            reset.setEnabled(false);
            gameOver = false;
         }
      }
      private void displayWinner()
      {
         label.setText("You got it!");
         display.displayWinner(target);	
         reset.setEnabled(true);	
         gameOver = true;
      }
      private void displayLoser()
      {
         label.setText("You lose.");
         display.displayLoser(target);
         reset.setEnabled(true);	
         gameOver = true;
      }
      private void displayTooHigh()
      {
         label.setText("Too high -- " + getMessageArray()[4 - tries]);
      
         display.displayTooHigh(guess);
      }
      private void displayTooLow()
      {
         label.setText("Too low -- " + getMessageArray()[4 - tries]);
         display.displayTooLow(guess);
      }
      private String[] getMessageArray()
      {
         if(message == null)
         {
            message = new String[4];
            message[0] = "You have 4 tries to guess the number.";
            message[1] = "3 tries remaining.";
            message[2] = "only two tries left.";
            message[3] = "last try!";
         }
         return message;
      }
   }