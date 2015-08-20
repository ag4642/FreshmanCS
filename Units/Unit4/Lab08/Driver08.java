   import java.io.*;
   import java.util.*;
   import javax.swing.*;

    public class Driver08
   {
       public static void main (String[] args)throws Exception
      {
         Scanner s = new Scanner(new File("words.txt"));
         int NUMITEMS = s.nextInt();
         String[] words = new String[NUMITEMS];
         for(int x = 0; x < words.length; x++)
            words[x] = s.nextLine();
         s.close();
      
         while(true)
         {
            String myWord = JOptionPane.showInputDialog("Word? (Type -1 to quit:)");
            if(myWord.equals("-1"))
            {
               System.out.println("Bye-bye!! (:");
               break;
            }
         	
            boolean wordcheck = false;
            
            for(int x = 0; x < words.length; x ++)
            {
               if(words[x].equals(myWord))
               {
                  System.out.println("Yes " + myWord + " " + "is a word # " + (x+1));
                  wordcheck = true;
               }
            }
            if(wordcheck == false)
               System.out.println("No " + myWord + " " + "isn't a word");
         }
      }
   }