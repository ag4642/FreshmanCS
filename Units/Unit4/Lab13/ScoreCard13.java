   import javax.swing.*;
   import java.awt.*;
   import java.util.Random;
    public class ScoreCard13 extends JPanel{
      private JTextField[][] input;
      private int[][] score;
       public ScoreCard13(){
         setLayout(new GridLayout(5, 18));
      
         for(int x = 1; x <= 18; x++){
            add(new JLabel("" + x, SwingConstants.CENTER));
         }
      
         input = new JTextField[4][18];
         for(int x = 0; x < input.length; x++){
            for(int y = 0; y < input[0].length; y++){
               input[x][y] = new JTextField();
               add(input[x][y]);
            }
         }
         score = new int[input.length][input[0].length];
      }
       public void randomize(){
         Random random = new Random();
         for(int x = 0; x < score.length; x++){
            for(int y = 0; y < input[0].length; y++){
               score[x][y] = random.nextInt(4) + 1;
               input[x][y].setText("" + score[x][y]);
            }
         }
      }
       public int findTotal(int x){
         for(int y = 0; y < input[x].length; y++){
            score[x][y] = (int)Double.parseDouble(input[x][y].getText());
         }
         int total = 0;
         for(int y = 0; y < input[x].length; y++){
            total = total + score[x][y];
         }   
         return total;
      }
       public int findAces(int x){
         int aces = 0;
         for(int y = 0; y < input[x].length; y++){
            score[x][y] = (int)Double.parseDouble(input[x][y].getText());
         }
         for(int y = 0; y < score[x].length; y++){
            if(score[x][y] == 1){
               aces++;
            }
         }
         return aces;
      }
       public int findHardestHole(int x){
         int hardestcurrent = 1;
         int hardest = 1;
         for(int y = 0; y < input[x].length; y++){
            score[x][y] = (int)Double.parseDouble(input[x][y].getText());
         }
         for(int y = 0; y < score[x].length; y++){
            if(score[x][y] > hardestcurrent){
               hardestcurrent = score[x][y];
               hardest = y + 1;
            }
         }
         return hardest;
      }
       public int findHardestHole(){
         int hardestcurrent;
         int hardest;
         for(int x = 0; x < score.length; x++){
            for(int y = 0; y < input[0].length; y++){
               score[x][y] = (int)Double.parseDouble(input[x][y].getText());
            }
         }
         int[] holes = new int[18];
         for(int x = 0; x < holes.length; x++){
            for(int y = 0; y < 4; y++) {
               holes[x] = holes[x] + score[y][x];
            }
         }
         hardestcurrent = 1;
       hardest = 1;
         for(int x = 0; x < holes.length; x++){
            if(holes[x] > hardestcurrent){
               hardestcurrent = holes[x];
               hardest = x + 1;
            }
         }
         return hardest;
      }
   }