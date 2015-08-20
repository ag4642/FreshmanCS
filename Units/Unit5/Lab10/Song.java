    public class Song implements Comparable<Song>
	 {
      private String myTitle;
      private int myMinutes, mySeconds;
       public Song(String song)
		 {
         int pos = song.indexOf(":");
         myMinutes = Integer.parseInt(song.substring(0, pos));
         song = song.substring(pos + 1);
         pos = song.indexOf(" ");
         mySeconds = Integer.parseInt(song.substring(0, pos));
         song = song.substring(pos + 1);
         myTitle = song;
      }
       public String getTitle()
		 {
         return myTitle;
      }
       public int getMinutes()
		 {
         return myMinutes;
      }
       public int getSeconds()
		 {
         return mySeconds;
      }
       public int getTotal()
		 {
         return myMinutes * 60 + mySeconds;
      }
       public void setTitle(String song)
		 {
         myTitle = song;
      }
       public void setMinutes(int x)
		 {
         myMinutes = x;
      }
       public void setSeconds(int x)
		 {
         mySeconds = x;
      }
       public int compareTo(Song s)
		 {
         int myTotal = myMinutes * 60 + mySeconds; 
         int sTotal = s.getMinutes() * 60 + s.getSeconds(); 
         return myTotal - sTotal;
      }
   }