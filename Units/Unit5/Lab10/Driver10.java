   import java.io.*;       		 //the File class
   import java.util.*;     		 //the Scanner class
   import javax.swing.JOptionPane;
    public class Driver10
	 {
       public static void main(String[] args)
		 {
         Song[] songList = input();
         int totalTime = calcTime(songList);
         int longestSong = searchLongestSong(songList);
			int shortestSong = searchShortestSong(songList);
         display(songList, totalTime, longestSong, shortestSong);
         System.exit(0);
      }
   	
       public static Song[] input()
		 {
         String filename = JOptionPane.showInputDialog("Artist?");
         Scanner infile = null;
         try
			{
            infile = new Scanner(new File(filename));
         }
         catch(FileNotFoundException e)
		 	{
         JOptionPane.showMessageDialog(null, "The file could not be found.");
         System.exit(0);
         }
         int numitems = infile.nextInt();
         String temp = infile.nextLine();
         Song[] song = new Song[numitems];
         for(int i = 0; i < song.length; i++)
			{
            song[i] = new Song(infile.nextLine());
         }
         infile.close();
         return song;
      }
   
       public static int calcTime(Song[] songs)
		 {
         int total = 0;
         for(int i = 0; i < songs.length; i++)
			{
            total = total + songs[i].getTotal();
         }
         return total;
      }
      
       public static int searchLongestSong(Comparable[] songs)
		 {
         int maxIndex = 0;
         for(int i = 0; i < songs.length; i++)
			{
            if(songs[i].compareTo(songs[maxIndex]) > 0)
				{
               maxIndex = i;
            }
         }
         return maxIndex;
      }
		
		public static int searchShortestSong(Comparable[] songs)
		 {
         int minIndex = 0;
         for(int i = 0; i < songs.length; i++)
			{
            if(songs[i].compareTo(songs[minIndex]) < 0 )
				{
               minIndex = i;
            }
         }
         return minIndex;
      }

   
       public static void display(Song[] array, int total, int longestSong, int shortestSong)
		 {
         int minutes = total / 60;
         int seconds = total - (minutes * 60);
         System.out.println("Total time: " + minutes + "'" + seconds + "\"");
         System.out.println("Longest song: " + array[longestSong].getTitle() + " " + "(" + array[longestSong].getMinutes() + "'" + array[longestSong].getSeconds() + "\"" + ")");
  			System.out.println("Shortest song: " + array[shortestSong].getTitle() + " " + "(" + array[shortestSong].getMinutes() + "'" + array[shortestSong].getSeconds() + "\"" + ")");    
		}
   }