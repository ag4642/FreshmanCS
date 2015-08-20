   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;   
   public class Linear extends Function
   {
      private JTextField aBox, hBox, kBox;
      private double a, h, k;
      private JPanel center;
      private JLabel[][] output;
      private double c;
       
      public Linear()
      {
         setLayout(new BorderLayout());
      
         Panel north = new JPanel();
         north.setLayout(new FlowLayout());
         newTextField(north, " a = ", aBox);
         newTextField(north, " h = ", hBox);
         newTextField(north, " k = ", kBox);
         add(north, BorderLayout.NORTH);
      
         JPanel center = new JPanel();
         center.setLayout(new GridLayout(4,2));
         output = new JLabel[3][1];
         for(int x=0; x<3; x++)
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
         h = Double.parseDouble(hBox.getText());
         k = Double.parseDouble(kBox.getText());
      }
   
      public void displayEquation(JLabel label)
      {
         label.setText("y = a(x - h) + k");
      }
      private void slope()
      {
         output[0][0].setText("Slope: (" + a + ")");
      }
      private void yintercept()
      {
         output[1][0].setText("Y-Intercept: " + k);
      }
      private void slopeintForm()
      {
         c= a*h + k;
         output[2][0].setText("Slope Intercept Form: " + "y = " + a + "x" + c);
      }
      public void calculateAndOutput()
      {
         slope();
         yintercept();
         slopeintForm();
      }
   }