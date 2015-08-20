   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class Panel08 extends JPanel
   {
      private Display08 display;
      private JButton button, b;
      public Panel08()
      {
         setLayout(new BorderLayout());
      
         display = new Display08();
         add(display, BorderLayout.CENTER); 
         
         setLayout(new GridLayout(2,1)); 
             
         button = new JButton("Finite");  
         button.addActionListener(new Listener1());
         add(button);
         
         b = new JButton("Infinite");  
         button.addActionListener(new Listener2());
         add(button);  
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.sumFinite();
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            display.sumInfinite();
         }
      }
   }