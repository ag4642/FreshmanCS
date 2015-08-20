   //Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
    public class Display10 extends JPanel
   {
      private JLabel[] bits;
      private JLabel convert;
       public Display10()
      {
         setLayout(new GridLayout(1, 8));
         bits = new JLabel[8];
         for(int x = 0; x < bits.length; x++)
         {
            bits[x] = new JLabel("", SwingConstants.CENTER);
            bits[x].setFont(new Font("Serif", Font.BOLD, 50));
            add(bits[x]);
         }
         convert = new JLabel("", SwingConstants.CENTER);
         add(convert);
         randomize();
      }
       public void randomize()
      {
         for(int x = 0; x < bits.length; x++)
            bits[x].setText("" + (int)(Math.random() * 2 + 0));
				convert();
      }
       public void reverse()
      {
         int a = Integer.parseInt(bits[0].getText());
         bits[0].setText("" + Integer.parseInt(bits[7].getText()));
         bits[7].setText("" + a);
         int b = Integer.parseInt(bits[1].getText());
         bits[1].setText("" + Integer.parseInt(bits[6].getText()));
         bits[6].setText("" + b);
         int c = Integer.parseInt(bits[2].getText());
         bits[2].setText("" + Integer.parseInt(bits[5].getText()));
         bits[5].setText("" + c);
         int d = Integer.parseInt(bits[3].getText());		
         bits[3].setText("" + Integer.parseInt(bits[4].getText()));
         bits[4].setText("" + d); 
			convert();   
      }
       public void shift()
      {
         for(int x = 0; x < 7; x++)
         {
            bits[x].setText("" + Integer.parseInt(bits[x+1].getText()));
         }
         bits[7].setText("" + 0);
			convert();
      }
       public void rotate()
      {
			int temp = Integer.parseInt(bits[0].getText());
         for(int x = 0; x < 7; x++)
         {
            bits[x].setText("" + Integer.parseInt(bits[x+1].getText()));
         }
         bits[7].setText("" + temp);
			convert();
      }
       private void convert()
      {
			int converted = 0;
			int total = 0;
         for(int x = 0; x < 8; x++)
         {
  			total = converted += Integer.parseInt(bits[x].getText()) * Math.pow(2, 7-x);
			}
			convert.setText("" + total);
      }
   }