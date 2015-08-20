    public class Distance implements Comparable<Distance>
   {
      private int myFeet, myInches;
       public Distance()
      {
         myFeet = myInches = 0;
      }
       public Distance(int x, int y)
      {
         myFeet = x;
         myInches = y;
      }
       public int getFeet()
      {
         return myFeet;
      }
       public int getInches()
      {
         return myInches;
      }
       public void setFeet(int x)
      {
         myFeet = x;
      }
       public void setInches(int x)
      {
         myInches = x;
      }
       public int compareTo(Distance d)
      {
         int myTotal = myFeet * 16 + myInches;  //direct access to data
         int dTotal = d.getFeet() * 16 + d.getInches(); //gets methods 
         return myTotal - dTotal;		   //returns in ounces
      }
       public boolean equals(Distance d){
         return compareTo(d) == 0;
      }
       public String toString(){
         return myFeet + " ft. " + myInches + " in.";
      }
   }
