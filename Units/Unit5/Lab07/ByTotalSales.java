   import java.util.Comparator;
    public class ByTotalSales implements Comparator<Salesperson>
	 {
       public int compare(Salesperson arg1, Salesperson arg2)
		 {
         return arg2.getTotalSales() - arg1.getTotalSales();
      }
   }