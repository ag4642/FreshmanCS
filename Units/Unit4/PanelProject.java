   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class PanelProject extends JPanel
   {
      PanelProject array;
      JLabel output;
      public PanelProject()
      {
         setLayout(new BorderLayout());
      
         output = new JLabel("------", SwingConstants.CENTER);
         add(output, BorderLayout.NORTH);
      
         array = new PanelProject();
         add(array, BorderLayout.CENTER);
      
         JPanel panel = new JPanel();
         panel.setLayout(new FlowLayout());
         addButton(panel, "Sum", new Listener1());
         addButton(panel, "Average", new Listener2());
         addButton(panel, "Min", new Listener3());
         addButton(panel, "Max", new Listener4());
         add(panel, BorderLayout.SOUTH);
      }
      private void addButton(JPanel p, String s, ActionListener a)
      {
         JButton b = new JButton(s);
         b.addActionListener(a);
         p.add(b);
      }
      private class Listener1 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            output.setText("Sum: " + array.sum());
         }
      }
      private class Listener2 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            output.setText("Average: " + array.avg());
         }
      }
      private class Listener3 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            output.setText("Minimum: " + array.min());
         }
      }
      private class Listener4 implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            output.setText("Maximum: " + array.max());
         }
      }
   }