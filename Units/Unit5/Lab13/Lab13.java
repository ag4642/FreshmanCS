   import javax.swing.JOptionPane;
    public class Lab13
   {
       public static void main(String[] args)
      {
         int number = Integer.parseInt(JOptionPane.showInputDialog("How many disks?"));
         tower(1, 3, 2, number);
         System.exit(0);
      }
      
       public static void tower(int start, int finish, int helper, int number)
      {
         if(number == 1)
			{
            System.out.println("Move the plate from " + start + " to " + finish + ".");
         }
			else
			{
				tower(start, helper, finish, number -1);
				System.out.println("Move the plate from " + start + " to " + finish + ".");
				tower(helper, finish, start, number -1);		
			}

      }
   }
	/**********************************
		Sample run, n = 4
	
		 Move disk from 1 to 2.
	    Move disk from 1 to 3.
	    Move disk from 2 to 3.
	    Move disk from 1 to 2.
	    Move disk from 3 to 1.
	    Move disk from 3 to 2.
   	 Move disk from 1 to 2.
  	    Move disk from 1 to 3.
 	    Move disk from 2 to 3.
       Move disk from 2 to 1.
       Move disk from 3 to 1.
       Move disk from 2 to 3.
       Move disk from 1 to 2.
       Move disk from 1 to 3.
       Move disk from 2 to 3.
       ******************************/