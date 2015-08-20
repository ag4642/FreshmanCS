   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Gameboard15 extends JPanel
   {
      private JButton[][] gameBoard;
      private String piece;
      private Color color;
      private int count;
       public Gameboard15(ActionListener a)
      {
         piece = "X";
         color = Color.green;
         count = 0;
      
         setLayout(new GridLayout(3, 3));
         setBackground(Color.black);
      
         gameBoard = new JButton[3][3];
         for(int x = 0; x < 3; x++)
         {
            for(int y = 0; y < 3; y++)
            {
               gameBoard[x][y] = new JButton("-");
               gameBoard[x][y].setFont(new Font("Serif", Font.BOLD, 50));
               gameBoard[x][y].setBackground(Color.white);
               gameBoard[x][y].setFocusPainted(false);
               gameBoard[x][y].addActionListener(a);
               gameBoard[x][y].addActionListener(new Listener(x, y));
               add(gameBoard[x][y]);
            }
         }
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
            gameBoard[myX][myY].setText(piece);
            gameBoard[myX][myY].setBackground(color);
            gameBoard[myX][myY].setEnabled(false);
            count++;
            if(piece.equals("X"))
            {
               piece = "O";
               color = Color.blue;
            }
            else{
               piece = "X";
               color = Color.green;
            }      	
         }
      }
       public void freeze()
      {
         for(int x = 0; x < 3; x++)
         {
            for(int y = 0; y < 3; y++)
            {
               gameBoard[x][y].setEnabled(false);
            }
         }
         count = 0;
      }
       public void reset()
      {
         for(int x = 0; x < 3; x++)
         {
            for(int y = 0; y < 3; y++)
            {
               gameBoard[x][y].setText("-");
               gameBoard[x][y].setBackground(Color.white);
               gameBoard[x][y].setEnabled(true);
            }
         }
         piece = "X";
         color = Color.green;
      }
       public boolean filled()
      {
         return count == 9;
      }
       public boolean winner()
      {
         if(gameBoard[1][0].getText().equals("O") && gameBoard[1][1].getText().equals("O") && gameBoard[1][2].getText().equals("O")){
            return true;
         }
         if(gameBoard[2][0].getText().equals("O") && gameBoard[2][1].getText().equals("O") && gameBoard[2][2].getText().equals("O")){
            return true;
         }
         if(gameBoard[0][0].getText().equals("O") && gameBoard[1][0].getText().equals("O") && gameBoard[2][0].getText().equals("O")){
            return true;
         }
         if(gameBoard[0][1].getText().equals("O") && gameBoard[1][1].getText().equals("O") && gameBoard[2][1].getText().equals("O")){
            return true;
         }
         if(gameBoard[0][2].getText().equals("O") && gameBoard[1][2].getText().equals("O") && gameBoard[2][2].getText().equals("O")){
            return true;
         }
         if(gameBoard[0][0].getText().equals("O") && gameBoard[1][1].getText().equals("O") && gameBoard[2][2].getText().equals("O")){
            return true;
         }
         if(gameBoard[0][2].getText().equals("O") && gameBoard[1][1].getText().equals("O") && gameBoard[2][0].getText().equals("O")){
            return true;
         }
         if(gameBoard[0][0].getText().equals("X") && gameBoard[0][1].getText().equals("X") && gameBoard[0][2].getText().equals("X")){
            return true;
         }
         if(gameBoard[1][0].getText().equals("X") && gameBoard[1][1].getText().equals("X") && gameBoard[1][2].getText().equals("X")){
            return true;
         }
         if(gameBoard[2][0].getText().equals("X") && gameBoard[2][1].getText().equals("X") && gameBoard[2][2].getText().equals("X")){
            return true;
         }
         if(gameBoard[0][0].getText().equals("X") && gameBoard[1][0].getText().equals("X") && gameBoard[2][0].getText().equals("X")){
            return true;
         }
         if(gameBoard[0][1].getText().equals("X") && gameBoard[1][1].getText().equals("X") && gameBoard[2][1].getText().equals("X")){
            return true;
         }
         if(gameBoard[0][2].getText().equals("X") && gameBoard[1][2].getText().equals("X") && gameBoard[2][2].getText().equals("X")){
            return true;
         }
         if(gameBoard[0][0].getText().equals("X") && gameBoard[1][1].getText().equals("X") && gameBoard[2][2].getText().equals("X")){
            return true;
         }
         if(gameBoard[0][2].getText().equals("X") && gameBoard[1][1].getText().equals("X") && gameBoard[2][0].getText().equals("X")){
            return true;
         }
         if(gameBoard[0][0].getText().equals("O") && gameBoard[0][1].getText().equals("O") && gameBoard[0][2].getText().equals("O")){
            return true;
         }
         else
         {
            return false;
         }
      }
   }