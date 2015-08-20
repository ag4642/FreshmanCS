	//Name______________________________ Date_____________
   import javax.swing.*;
   import java.awt.*;
   public class ScoreCard09 extends JPanel
   {
      private JTextField[] input;
      public ScoreCard09()
      {
         setLayout(new GridLayout(2, 18));
      
         for(int x = 1; x <= 18; x++)
         {
            add(new JLabel("" + x, SwingConstants.CENTER));
         }
      
         input = new JTextField[18];
         for(int x = 0; x < input.length; x++)
         {
            input[x] = new JTextField();
            add(input[x]);
         }
      }
      public void randomize()
      {
   		for(int x = 0; x < input.length; x++) 
				input[x].setText("" + (int) (Math.random() * 4 + 1));  
      }
      public int findTotal()
      {
      	int total = 0;
			for ( int x = 0; x < input.length; x++)
			total += Integer.parseInt(input[x].getText());		
			return total;	
      }
      public int findAces()
      {
			int aces = 0;
      	for (int x = 0; x < input.length; x++)
				{
					if (Integer.parseInt(input[x].getText()) == 1)
						{
							aces++;
						}
				}
			return aces;
      }
     public int findHardestHole()
      {
      	int hardestHole = 0;
			int amount = 0;
			for(int x = 0; x < input.length; x++)
				if(Integer.parseInt(input[x].getText()) > amount)
				{
					hardestHole = x;
					amount = (Integer.parseInt(input[x].getText()));
				}
   			return hardestHole + 1;  
	   }
   }