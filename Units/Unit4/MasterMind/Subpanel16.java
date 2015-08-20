   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Subpanel16 extends JPanel
	 {
      private JButton[] answers;
       public Subpanel16()
		 {
         setLayout(new GridLayout(2, 2, 2, 2));
      
         answers = new JButton[4];
      
         for(int x = 0; x < 4; x++){
            answers[x] = new JButton();
            answers[x].setEnabled(false);
            answers[x].setBackground(Color.gray);
            add(answers[x]);
         }
      }
       public void lightup(int[] x)
		 {
         for(int a = 0; a < x[0]; a++)
			{
            answers[a].setBackground(Color.white);
         }
         for(int b = x[0]; b < x[1]; b++)
			{
            answers[b].setBackground(Color.black);
         }
      }
       public void ReSet()
		 {
         for(int i = 0; i < 4; i++)
			{
            answers[i].setBackground(Color.gray);
         }
      }
   }
		
