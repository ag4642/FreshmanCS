   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Choice16 extends JPanel
   {
      private Color colour;
		private Color[] wumpus;
      private JButton[] choice;
      private Panel16 panel;
       public Choice16(ActionListener a)
      {
         setLayout(new FlowLayout());
      	
         choice = new JButton[6];
      	
         for(int x = 0; x < 6; x++)
         {
            choice[x] = new JButton();
            choice[x].addActionListener(a);
            choice[x].addActionListener(new Listener(x));
            add(choice[x]);
         }
         choice[0].setBackground(Color.red);
         choice[1].setBackground(Color.green);
         choice[2].setBackground(Color.blue);
         choice[3].setBackground(Color.yellow);
         choice[4].setBackground(Color.orange);
         choice[5].setBackground(Color.pink);
      }
       private class Listener implements ActionListener
      {
         private Color myColour;
          public Listener(int x)
         {
            if(x == 0)
            {
               myColour = Color.red;
            }
            else if(x == 1)
            {
               myColour = Color.green;
            }
            else if(x == 2)
            {
               myColour = Color.blue;
            }
            else if(x == 3)
            {
               myColour = Color.yellow;
            }
            else if(x == 4)
            {
               myColour = Color.orange;
            }
            else if(x == 5)
            {
               myColour = Color.pink;
            }
         }
          public void actionPerformed(ActionEvent e)
         {
            colour = myColour;
         }
      }
       public Color getAnswerColor()
      {
         return colour;
      }
       public void ReSet()
      {
       colour = Color.red;
		 
  //       System.out.println("The Answer is: ");
  //       for(int x = 0; x < 4; x++)
  //       {
    //        int foo = (int)(Math.random() * 6);
      //      switch(foo)
        //    {
          //     case 0: wumpus[x] = Color.red;
            //      break;
             // case 1: wumpus[x] = Color.green;
             //  break;
               //case 2: wumpus[x] = Color.blue;
                 // break;
             //  case 3: wumpus[x] = Color.yellow;
             //     break;
            //   case 4: wumpus[x] = Color.orange;
             //     break;
              // case 5: wumpus[x] = Color.pink;
               //   break;
           // }
            //System.out.println(wumpus[x].toString());
         //}
      }
   }