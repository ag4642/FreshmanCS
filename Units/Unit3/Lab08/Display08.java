   import javax.swing.*;
   import java.awt.*;
   public class Display08 extends JPanel
   {
      private JLabel label;
      private JTextField box1, box2, box3;  
      public Display08()
      {
         setLayout(new GridLayout(4, 2));
      
         add(new JLabel("Terms:", SwingConstants.RIGHT));
         box1 = new JTextField("", 5);
         box1.setHorizontalAlignment(SwingConstants.LEFT);
         add(box1);
      
         add(new JLabel("First:", SwingConstants.RIGHT));
         box2 = new JTextField("", 5);
         box2.setHorizontalAlignment(SwingConstants.LEFT);
         add(box2);
      
         add(new JLabel("Ratio:", SwingConstants.RIGHT));
         box3 = new JTextField("", 5);
         box3.setHorizontalAlignment(SwingConstants.LEFT);
         add(box3);
      
         add(new JLabel("Sum:", SwingConstants.RIGHT));
         label = new JLabel("");
         label.setFont(new Font("Serif", Font.BOLD, 20));
         label.setForeground(Color.blue);
         add(label);   
      }
      public void sumFinite()
      {
         double a = Double.parseDouble(box1.getText());
         for(double b = 1; b<=a; b++)
         {
            double c = Double.parseDouble(box2.getText());
            double d = Double.parseDouble(box3.getText());
            double e = c+(c*d);
            label.setText("" + e);
         }      	
      }
      public void sumInfinite()
      {
         double c = Double.parseDouble(box2.getText());
         double d = Double.parseDouble(box3.getText());
          
         if(d >= 1)
         {
            label.setText("NONE");
         }
         else
         {
            double z = (c)/(1-d); 	
            label.setText("" + z);
         }
      }
   }