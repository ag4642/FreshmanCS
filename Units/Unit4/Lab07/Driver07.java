	//Name______________________________ Date_____________
    public class Driver07
   {
      public static final int TRIALS = 10000;
       public static void main(String[] args) throws Exception
      {
         Dice d = new Dice();
         int count = 0;
			int count2 = 0;
			int count3 = 0;
			int count4 = 0;
			int count5 = 0;
			int count6 = 0;
			int count7 = 0;
			int count8 = 0;
			int count9 = 0;
			int count10 = 0;
			int count11 = 0;
			int count12 = 0;
	     do
         {
            d.roll();
            count = count + 1;
         }while(d.total() != 12);
         System.out.println("It took " + count + " rolls to get boxcars.");
			
			count = 0;
			do
			{
				d.roll();
				count = count + 1;
			}while(!(d.doubles()));
			System.out.println("It took " + count + " rolls to get doubles.");
			
			count = 0;
			int[] Totals = new int[TRIALS];
			for(int x = 0; x < TRIALS; x++)
			{
				d.roll();
				Totals[x] = d.total();
				if(d.doubles() == true)
					count++;
				else if(Totals[x] == 2)
					count2++;
				else if(Totals[x] == 3)
					count3++;
				else if(Totals[x] == 4)
					count4++;
				else if(Totals[x] == 5)
					count5++;
				else if(Totals[x] == 6)
					count6++;
				else if(Totals[x] == 7)
					count7++;
				else if(Totals[x] == 8)
					count8++;
				else if(Totals[x] == 9)
					count9++;
				else if(Totals[x] == 10)
					count10++;
				else if(Totals[x] == 11)
					count11++;
				else if(Totals[x] == 12)
					count12++;
			}
			System.out.println("You Had " + count + " doubles in 10000 rolls.");
			System.out.println("You Averaged a Double Every " + TRIALS/count + " Rolls.");
			System.out.println("You Had " + count2 + " twos.");
			System.out.println("You Had " + count3 + " threes.");
			System.out.println("You Had " + count4 + " fours.");
			System.out.println("You Had " + count5 + " fives.");
			System.out.println("You Had " + count6 + " sixes.");
			System.out.println("You Had " + count7 + " sevens.");
			System.out.println("You Had " + count8 + " eights.");
			System.out.println("You Had " + count9 + " nines.");
			System.out.println("You Had " + count10 + " tens.");
			System.out.println("You Had " + count11 + " elevens.");
			System.out.println("You Had " + count12 + " twelves.");
      }
   }
	/******
	 It took 35 rolls to get boxcars.
    It took 4 rolls to get doubles: {1, 1}
    2's:  6
    3's:  6
    4's:  5
    5's:  10
    6's:  12
    7's:  20
    8's:  17
    9's:  6
    10's:  10
    11's:  4
    12's:  4
    Number of doubles in 100 rolls: 18
	 ********/