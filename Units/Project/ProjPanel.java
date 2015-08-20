   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class ProjPanel
   {
      private Function subpanel;
      private JLabel formula;
      public ProjPanel()
      {
         setLayout(new BorderLayout());
      
         JPanel north = new JPanel();
         north.setLayout(new BorderLayout());
         formula = new JLabel("-----");
         formula.setFont(new Font("Serif", Font.BOLD|Font.ITALIC, 20));
         formula.setForeground(Color.red);
         north.add(formula, BorderLayout.NORTH);
         JPanel buttons = new JPanel();
         addButton(buttons, "Linear", 1);
         addButton(buttons, "Quadratic", 2);
         addButton(buttons, "Absolute Value", 3);
         addButton(buttons, "Sin", 4);
         addButton(buttons, "Cos", 5);
         addButton(buttons, "Tan", 6);
         addButton(buttons, "Arithmetic", 7);
         addButton(buttons, "Geometric", 8);
         north.add(buttons, BorderLayout.SOUTH);
         add(north, BorderLayout.NORTH);
      
         JButton go = new JButton("Go!");
         go.addActionListener(new ListenerForGo());
         add(go, BorderLayout.SOUTH);
      }
   
      private void addButton(JPanel panel, String s, int x)
      {
         JButton button = new JButton(s);
         button.addActionListener(new Listener(x));
         panel.add(button);
      }
      private class Listener implements ActionListener
      {
         private int myX;
         public Listener(int x)
         {
            myX = x;
         }
         public void actionPerformed(ActionEvent e)
         {
            switch(x)
            {
               case 1: subpanel = new Linear();
                  break;
               case 2: subpanel = new Quadratic(); 
                  break;
               case 3: subpanel = new AbVal(); 
                  break;
               case 4: subpanel = new Sin();
                  break;
               case 5: subpanel = new Cos();
                  break;
               case 6: subpanel = new Tan();
                  break;
               case 7: subpanel = new Arithmetic();
                  break;
               case 8: subpanel = new Geometric(); 
                  break;
            }
            add(subpanel);
            subpanel.displayEquation(formula);
         }
      }
      private class ListenerForGo implements ActionListener
      {
         public void actionPerformed(ActionEvent e)
         {
            subpanel.setVariables();
            subpanel.calculateAndOutput();
         }
      }
   }