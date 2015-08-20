   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Answer16 extends JPanel
	 {
      private Subpanel16[] answers;
      private int[] turnOn;
       public Answer16()
		 {
         setLayout(new GridLayout(10, 1));
      	
         answers = new Subpanel16[10];
         for(int x = 0; x < 10; x++)
			{
            answers[x] = new Subpanel16();
            add(answers[x]);
         }
      }
       public boolean RightAnswer(int[] x, int[] y)
		 {
         for(int i = 0; i < 4; i++)
			{
            if(x[i] != y[i])
				{
               return false;
            }
         }
         return true;
      }
       public void returnResult(int[] x, int[] y, int n)
		 {
         turnOn = new int[2];
         int whites = 0;
         int blacks = 0;
         for(int i = 0; i < 4; i++)
			{
            if(x[i] == y[i])
				{
               whites++;
            }
         }
         for(int a = 0; a < 4; a++)
			{
            for(int i = 0; i < 4; i++)
				{
               if(y[i] == x[a])
					{
                  blacks++;
                  x[a] = -1;
               }
            }
         }
         turnOn[0] = whites;
         turnOn[1] = blacks;
         answers[n].lightup(turnOn);
      }
       public void ReSet()
		 {
         for(int x = 0; x < 10; x++)
			{
            answers[x].ReSet();
         }
      }
   }