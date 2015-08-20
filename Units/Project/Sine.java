   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;   
   public class Sine extends Function
   {
      private JTextField aBox, bBox, hBox, kBox;
      private double a, b, h, k;
      private JPanel center;
      private JLabel[][] output;
      private double c;
        
      public Sine()
      {
         setLayout(new BorderLayout());
      
         Panel north = new JPanel();
         north.setLayout(new FlowLayout());
         newTextField(north, " a = ", aBox);
         newTextField(north, " b = ", kBox);
         newTextField(north, " h = ", hBox);
         newTextField(north, " k = ", kBox);
         add(north, BorderLayout.NORTH);
      
         JPanel center = new JPanel();
         center.setLayout(new GridLayout(4,2));
         output = new JLabel[4][1];
         for(int x=0; x<4; x++)
            for(int y=0; y<1; y++)
            {
               output[x][y] = new JLabel("-----");
               center.add(output[x][y]);
            }
         add(output, BorderLayout.CENTER());
      }
   
   
      public void setVariables()
      {
         a = Double.parseDouble(aBox.getText());
         b = Double.parseDouble(bBox.getText());
         h = Double.parseDouble(hBox.getText());
         k = Double.parseDouble(kBox.getText());
      }
   
      public void displayEquation(JLabel label)
      {
         label.setText("y = a*sin(b(x - h)) + k");
      }
      private void amplitude()
      {
         output[0][0].setText("Amplitude: (" + a + ")");
      }
      private void period()
      {
         output[1][0].setText("Period: " + "2pi/" + b);
      }
      private void phaseShift()
      {
         c = b*h;
         output[2][0].setText("Phase Shift: " + c);
      }
      private void verticalShift()
      {
         output[3][0].setText("Vertical Shift: " + k);
      }
      private void sinusoidalAxis()
      {
         output[4][0].setText("Sinusoidal Axis: y = " + k);
      }
   
      public void calculateAndOutput()
      {
         amplitude();
         period();
         phaseShift();
         verticalShift();
         sinusoidalAxis();
      }
   }