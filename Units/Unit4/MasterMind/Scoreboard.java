   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Scoreboard extends JPanel
	 {
      private int Victories, GamesPlayed;
      private Color colour;
      private JButton colourbutton;
      private JLabel label, ratio;
       public Scoreboard()
		 {
         setLayout(new FlowLayout());
      	
         Victories = GamesPlayed = 0;
         colour = Color.red;
         label = new JLabel("Current colour: ");
         ratio = new JLabel("Wins/Games = " + Victories + "/" + GamesPlayed);
         colourbutton = new JButton();
         colourbutton.setEnabled(false);
         colourbutton.setBackground(colour);
      	
         add(label);
         add(colourbutton);
         add(ratio);
      }
       public void victory()
		 {
         Victories++;
         GamesPlayed++;
         ratio.setText("Wins/Games = " + Victories + "/" + GamesPlayed);
      }
       public void setAnswerColor(Color colour)
		 {
         colourbutton.setBackground(colour);
      }
       public void loss()
		 {
         GamesPlayed++;
         ratio.setText("Wins/Games = " + Victories + "/" + GamesPlayed);
      }
   }