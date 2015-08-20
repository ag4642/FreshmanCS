   import javax.swing.JOptionPane;
   public class Driver12
   {
      public static void main(String[] penis)
      {
         while(true)
         {
            int n = Integer.parseInt(
                       JOptionPane.showInputDialog(
                                    "How many rows? (-1 to quit)"));
            if(n == -1)
            {
               System.out.println("Bye-bye!");
               System.exit(0);
            }
            String message = "What type? (1-4)";
            message = message + "\n1. Standard";
            message = message + "\n2. Backward";
            message = message + "\n3. Pyramid";
            message = message + "\n4. Box with X";
            int type = Integer.parseInt(JOptionPane.showInputDialog(message));
            switch(type)
            {
               case 1: standard(n);
                  break;
               case 2: backward(n);
                  break;
               case 3: pyramid(n);
                  break;
               case 4: box(n);
                  break;
               default: System.out.println("Not a valid type.");
                  break;
            }
            System.out.println();
         }
      }
      public static void standard(int n)
      {
         for(int i = 1; i <= n; i++) {
            for(int j = 0; j < i; j++) 
               System.out.print("*");
            System.out.println();
         }
      }
      public static void backward(int n)
      {
         for(int i = 1; i <= n; i++) {
            for(int j = 0; j < (n - i); j++) {
               System.out.print(" ");
            }
            for(int j = 0; j < i; j++)
               System.out.print("*");
            System.out.println();
         }
      }
      public static void pyramid(int n)
      {
         for(int i = 0; i < n; i++) {
            for(int j = 0; j < (n - i + 1); j++)
               System.out.print(" ");
            for(int j = 0; j < (2 * i + 1); j++)
               System.out.print("*");
            System.out.println();
         }
      }
      public static void box(int n)
      {
         for(int row = 1; row <= n; row++)
            System.out.print("*");
         System.out.println();
         for(int row = 2; row < n; row++) {
            for(int col = 1; col <= n; col++) {
               if(col == 1 || col == n) {
                  System.out.print("*");
               } 
               else {
                  if(row == col || ((row + col) == (n+1)))
                     System.out.print("*");
                  else
                     System.out.print(" ");
               }
            }
            System.out.println();
         }
         for(int row = 1; row <= n; row++)
            System.out.print("*"); 
      }
   }