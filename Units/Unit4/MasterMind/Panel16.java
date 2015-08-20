   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Panel16 extends JPanel
	 {
      public Scoreboard scoreboard;
      private Gameboard Gameboard;
      private Answer16 answerboard;
      private Choice16 choiceboard;
      private JButton go;
      private int turnnumber;
      private boolean gameover;
       public Panel16()
		 {
         setLayout(new BorderLayout());
       	
         turnnumber = 1;
         gameover = false;
         scoreboard = new Scoreboard();
         Gameboard = new Gameboard();
         answerboard = new Answer16();
         choiceboard = new Choice16(new Callback());
         go = new JButton("Go!");
         go.addActionListener(new Listener());
       
         add(scoreboard, BorderLayout.SOUTH);
         add(Gameboard, BorderLayout.CENTER);
         add(answerboard, BorderLayout.WEST);
         add(choiceboard, BorderLayout.NORTH);
         add(go, BorderLayout.EAST);
      }
       private class Listener implements ActionListener
		 {
          public void actionPerformed(ActionEvent e)
			 {
            if(gameover == true)
				{
               Clear();
            }
            else if(Gameboard.GameBoard[10 - turnnumber][0].getBackground() == Color.darkGray || Gameboard.GameBoard[10 - turnnumber][1].getBackground() == Color.darkGray || Gameboard.GameBoard[10 - turnnumber][2].getBackground() == Color.darkGray || Gameboard.GameBoard[10 - turnnumber][3].getBackground() == Color.darkGray)
				{
               ;
            }
            else if(answerboard.RightAnswer(Gameboard.returnAnswer(), Gameboard.returnGuess(10 - turnnumber)))
				{
               Gameboard.Freeze();
               scoreboard.victory();
               answerboard.returnResult(Gameboard.returnAnswer(), Gameboard.returnGuess(10 - turnnumber), 10 - turnnumber);
               gameover = true;
            }
            else
				{
               answerboard.returnResult(Gameboard.returnAnswer(), Gameboard.returnGuess(10 - turnnumber), 10 - turnnumber);
               turnnumber++;
               if(turnnumber == 11)
					{
                  scoreboard.loss();
                  gameover = true;
               }
               else
					{
                  Gameboard.setTurnColor(turnnumber);
               }
            }
         }
          public void Clear()
			 {
            Gameboard.ReSet();
            answerboard.ReSet();
            choiceboard.ReSet();
            gameover = false;
            turnnumber = 1;
         }
      }
       private class Callback implements ActionListener
		 {
          public void actionPerformed(ActionEvent e)
			 {
            scoreboard.setAnswerColor(choiceboard.getAnswerColor());
            Gameboard.setAnswerColor(choiceboard.getAnswerColor());
         }
      }
   }
