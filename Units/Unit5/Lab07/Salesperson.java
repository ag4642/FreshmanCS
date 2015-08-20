    public class Salesperson
	 {
   	//data fields
      private String myName;
      private int myCars, myTrucks;
   
   	//constructors
       public Salesperson()
		 {
         myName = null;
         myCars = myTrucks = 0;
      }
       public Salesperson(String a, int x, int y)
		 {
         myName = a;
         myCars = x;
         myTrucks = y;
      }
   	//accessors and modifiers
   
       public String getName()
		 {
         return myName;
      }
   
	    public int getCars()
		 {
         return myCars;
      }
       public int getTrucks()
		 {
         return myTrucks;
      }
       public int getTotalSales()
		 {
         return myTrucks + myCars;
      }
       public void setCars(int x)
		 {
         myCars = x;
      }
       public void setTrucks(int x)
		 {
         myTrucks = x;
      }
   	//other methods: toString
       public String toString()
		 {
         Integer cars = new Integer(myCars);
         Integer trucks = new Integer(myTrucks);
         return myName + "\n" + cars.toString() + "\n" + trucks.toString() + "\n";
      }
   }