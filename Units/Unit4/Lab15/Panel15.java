   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;
    public class Panel15 extends JPanel
	 {
      private Scoreboard15 sb;
      private Gameboard15 gb;
      private JButton resetbutton;
      private JLabel label;
       public Panel15()
		 {
         setLayout(new BorderLayout());
      
         sb = new Scoreboard15();
         add(sb, BorderLayout.NORTH);
      
         gb = new Gameboard15(new Callback());
         add(gb, BorderLayout.CENTER);
      
         JPanel south = new JPanel();
         south.setLayout(new FlowLayout());
         south.setBackground(Color.black);
         add(south, BorderLayout.SOUTH);
      
         resetbutton = new JButton("Reset");
         resetbutton.addActionListener(new Listener());
         resetbutton.setFocusPainted(false);
         resetbutton.setEnabled(false);
         south.add(resetbutton);
      
         label = new JLabel("");
         label.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 18));
         label.setForeground(Color.yellow);
         south.add(label);
      }
       private class Callback implements ActionListener
		 {
          public void actionPerformed(ActionEvent e)
			 {
            if(gb.winner())
				{
               sb.winner();
               gb.freeze();
               resetbutton.setEnabled(true);
               label.setText("Winner!");
            }
            else if(gb.filled())
				{
               sb.tie();
               resetbutton.setEnabled(true);
               label.setText("Cat!");
            }
            else
				{
               sb.toggle();
            }
         }
      }
       private class Listener implements ActionListener
		 {
          public void actionPerformed(ActionEvent e)
			 {
            gb.reset();
            sb.switchX();
            label.setText("");
         }
      }
   }