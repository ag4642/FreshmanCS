   import java.util.Comparator;
    public class ByTrucks implements Comparator<Salesperson>
	 {
       public int compare(Salesperson arg1, Salesperson arg2)
		 {
         return arg2.getTrucks() - arg1.getTrucks();
      }
   }