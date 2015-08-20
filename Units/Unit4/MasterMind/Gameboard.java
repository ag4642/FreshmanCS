   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   import java.util.Random;
    public class Gameboard extends JPanel
	 {
      public JButton[][] GameBoard;	
      private int[] answer, randomGuess;
      private Color[] guess;
      private Color colour;
      private int colour1, colour2, colour3, colour4;
       public Gameboard()
		 {
         setLayout(new GridLayout(10, 4));
      	
         GameBoard = new JButton[10][4];
      	
         colour = Color.red;
      	
         for(int x = 0; x < 10; x++)
			{
            for(int y = 0; y < 4; y++)
				{
               GameBoard[x][y] = new JButton();
               GameBoard[x][y].addActionListener(new Listener(x, y));
               add(GameBoard[x][y]);
            }
         }
         ReStart();
         setTurnColor(1);
      }
       private class Listener implements ActionListener
		 {
         private int myX, myY;
          public Listener(int x, int y)
			 {
            myX = x;
            myY = y;
         }
          public void actionPerformed(ActionEvent e)
			 {
            GameBoard[myX][myY].setBackground(colour);
         }
      }
       public void makeAnswer()
		 {
         Random random = new Random();
         colour1 = random.nextInt(6);
         colour2 = random.nextInt(6);
         colour3 = random.nextInt(6);
         colour4 = random.nextInt(6);
			
			System.out.println(random.toString());
		
      }
       public int[] returnAnswer()
		 {
         answer = new int[4];
         answer[0] = colour1;
         answer[1] = colour2;
         answer[2] = colour3;
         answer[3] = colour4;
         return answer;
      }
       public void Freeze()
		 {
         for(int x = 0; x < 10; x++)
			{
            for(int y = 0; y < 4; y++)
				{
               GameBoard[x][y].setEnabled(false);
            }
         }
      }
       public void ReSet()
		 {
         for(int x = 0; x < 10; x++)
			{
            for(int y = 0; y < 4; y++)
				{
               GameBoard[x][y].setEnabled(true);
            }
         }
         ReStart();
      }
       public void ReStart()
		 {
         makeAnswer();
         for(int x = 0; x < 10; x++)
			{
            for(int y = 0; y < 4; y++)
				{
               GameBoard[x][y].setBackground(Color.lightGray);
            }
         }
         setTurnColor(1);
      }
       public void setAnswerColor(Color c)
		 {
         colour = c;
       }
       public void setTurnColor(int n)
		 {
         for(int x = 0; x < 10; x++)
			{
            for(int y = 0; y < 4; y++)
				{
               GameBoard[x][y].setEnabled(false);
            }
         }
         for(int y = 0; y < 4; y++)
			{
            GameBoard[10 - n][y].setBackground(Color.darkGray);
            GameBoard[10 - n][y].setEnabled(true);
         }
      }
       public int[] returnGuess(int n)
		 {
         guess = new Color[4];
         randomGuess = new int[4];
         for(int y = 0; y < 4; y++)
			{
            guess[y] = GameBoard[n][y].getBackground();
			}

         for(int x = 0; x < guess.length; x++)
			{
            if(guess[x] == Color.red)
				{
               randomGuess[x] = 0;
            }
            else if(guess[x] == Color.green)
				{
               randomGuess[x] = 1;
            }
            else if(guess[x] == Color.blue)
				{
               randomGuess[x] = 2;
            }
            else if(guess[x] == Color.yellow)
				{
               randomGuess[x] = 3;
            }
            else if(guess[x] == Color.orange)
				{
               randomGuess[x] = 4;
            }
            else if(guess[x] == Color.pink)
				{
               randomGuess[x] = 5;
            }
         }
         return randomGuess;
      }
   }