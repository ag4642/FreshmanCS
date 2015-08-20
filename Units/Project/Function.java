   import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class se
   {
      public static void main (String args[])
      {
         Function tom = new Function();
      }
   }
   public abstract class Function
   {
      public abstract void displayEquation(JLabel label);
      public abstract void setVariables();
      public abstract void calculateAndOutput(JPanel subpanel);
      public void newTextField(JPanel panel, String s, JTextField b)
      {
         panel.add(new JLabel(s));
         b = new JTextField();
         panel.add(b);
      }
   }