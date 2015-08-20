   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
   import java.util.Random;
    public class Battleship extends JPanel{
      private JButton[][] board;
      private int[][] matrix;
      private int hits, torpedoes, ship;
      private JLabel label;
      private JButton reset;
       public Battleship(){
         setLayout(new BorderLayout());
         hits = 0;
         torpedoes = 25;
         ship = 4;
      
         JPanel north = new JPanel();
         north.setLayout(new FlowLayout());
         add(north, BorderLayout.NORTH);
         label = new JLabel("BattleShip");
         north.add(label);
      
         JPanel center = new JPanel();
         center.setLayout(new GridLayout(10,10));
         add(center, BorderLayout.CENTER);
      
         board = new JButton[10][10];
         matrix = new int[10][10];
         for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
               board[r][c] = new JButton();
               board[r][c].setBackground(Color.blue);
               board[r][c].addActionListener( new Handler1(r, c) );
               center.add(board[r][c]);
               matrix[r][c] = 0;
            }
         }
         reset = new JButton("Reset");
         reset.addActionListener( new Handler2() );
         reset.setEnabled(false);
         add(reset, BorderLayout.SOUTH);
      
         placeShip();
      }
       private void placeShip(){
         Random random = new Random();
         int coin = random.nextInt(2);
         if(coin == 0){
            placeVertically();
         }
         else{
            placeHorizontally();
         }
      }
       private void placeHorizontally(){
         Random random = new Random();
         int row = random.nextInt(7);
         int col = random.nextInt(10);
         for(int k = 0; k < 4; k++){
            matrix[row + k][col] = 1;
         }	
      }
       private void placeVertically(){
         Random random = new Random();
         int col = random.nextInt(7);
         int row = random.nextInt(10);
         for(int k = 0; k < 4; k++){
            matrix[row][col + k] = 1;
         }
      }
       private class Handler1 implements ActionListener{
         private int myRow, myCol;
          public Handler1(int r, int c){
            myRow = r;
            myCol = c;
         }
          public void actionPerformed(ActionEvent e){  
            torpedoes--;
            if(torpedoes == 0){
               for(int r = 0; r < 10; r++){
                  for(int c = 0; c < 10; c++){
                     board[r][c].setEnabled(false);
                     if(matrix[r][c] == 1){
                        if(board[r][c].getBackground() == Color.blue){
                           board[r][c].setBackground(Color.black);
                           reset.setEnabled(true);
                        }
                     }
                  }
               }
            }		            
            if(matrix[myRow][myCol] == 1){
               label.setText("Kabooom! Hit! " + torpedoes + " torpedoes remaining.");
               board[myRow][myCol].setBackground(Color.red);
               matrix[myRow][myCol] = 0;
               ship--;
               if(ship == 0){
                  for(int r = 0; r < 10; r++){
                     for(int c = 0; c < 10; c++){
                        board[r][c].setEnabled(false);
                     }
                  }
                  label.setText("You sunk my ship!");
                  reset.setEnabled(true);
               }
               board[myRow][myCol].setEnabled(false);
            }
            else{
               label.setText("Miss! " + torpedoes + " torpedoes remaining.");
               board[myRow][myCol].setBackground(Color.white);
               board[myRow][myCol].setEnabled(false);
            }   			
         }
      }
       private class Handler2 implements ActionListener{
          public void actionPerformed(ActionEvent e){
            for(int r = 0; r < 10; r++){
               for(int c = 0; c < 10; c++){
                  board[r][c].setBackground(Color.blue);
                  board[r][c].setEnabled(true);
                  matrix[r][c] = 0;            
               }
            }
            ship = 4;
            torpedoes = 25;
            label.setText("You have 25 torpedoes remaining");
            placeShip();
            reset.setEnabled(false);
         }
      }
   }
