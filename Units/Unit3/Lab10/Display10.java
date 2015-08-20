   import javax.swing.*;
   import java.awt.*;
   public class Display10 extends JPanel
   {
      private JLabel label;
      private int last, next;
      public Display10()
      {
         setLayout(new GridLayout(1, 1));
         next = 5;
         last = 4;
         label = new JLabel("5");
         label.setFont(new Font("Serif", Font.BOLD, 100));
         label.setHorizontalAlignment(SwingConstants.CENTER);
         label.setForeground(Color.blue);
         add(label);
      }
      private void pickNext()
      {
         int i = (int)(Math.random()  * 9 + 1);
         last = (int)(Math.random() * 9 + 1);
         while(i == last)
            i = (int)(Math.random() * 9 + 1);
         label.setText(i + "");
      }
      public boolean guessHigh()
      {
         pickNext();
         return next > last;
      }
      public boolean guessLow()
      {
         pickNext();
         return next < last;
      }
   }