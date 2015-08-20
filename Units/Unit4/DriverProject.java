   import javax.swing.JFrame;
   public class DriverProject
   {
      public static void main(String[] args)
      {
         JFrame frame = new JFrame("Unit4, Project, Arrays");
         frame.setSize(500, 150);
         frame.setLocation(150, 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setContentPane(new PanelProject());
         frame.setVisible(true);
      }
   }