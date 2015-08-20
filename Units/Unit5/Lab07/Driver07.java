// Ed Lee     May 10

   import java.io.*;      //the File class
   import java.util.*;    //the Scanner class
   import javax.swing.JOptionPane;
   import java.util.Comparator;
    public class Driver07
	 {
       public static void main(String[] args) throws Exception
      {
         Salesperson[] array = input("data.txt");
         menu(array);
         System.exit(0);
      }
    
       public static Salesperson[] input(String filename)
      {    
         Scanner infile = null;
         try
         {
            infile = new Scanner(new File(filename));
         }
             catch(FileNotFoundException e)
            {
               JOptionPane.showMessageDialog(null,"The file could not be found.");
               System.exit(0);
            }
         int numitems = infile.nextInt();
         Salesperson[] array = new Salesperson[numitems];
         for(int k = 0; k < numitems; k++)
         {
            array[k] = new Salesperson(infile.next(), infile.nextInt(), infile.nextInt());
         }
         infile.close();
         return array;
      }
   	
       public static void menu(Salesperson[]array) throws Exception
      {
         int choice = 0;
         while(choice != 7)
         {
            String message = "";
            message = message + "\n1. List Alphabetically.";
            message = message + "\n2. List by Cars Sold.";
            message = message + "\n3. List by Trucks Sold.";
            message = message + "\n4. List by Total Sales.";
            message = message + "\n5. Add Sales.";
            message = message + "\n6. Save data to file.";
            message = message + "\n7. Quit.";
            choice = Integer.parseInt(JOptionPane.showInputDialog(message));
            switch(choice)
            {
               case 1: 
                  display(array, new ByName());
                  break;
               case 2: 
                  display(array, new ByCars());
                  break;
               case 3: 
                  display(array, new ByTrucks());
                  break;
               case 4: 
                  display(array, new ByTotalSales());
                  break;
               case 5: 
                  add(array);
                  break;
               case 6: 
                  save(array);
                  break;
               case 7: 
                  for(int k = 0; k < 25; k++) 
                     System.out.println();
                  System.out.println("Bye-bye!");
                  break;
               default: 
                  System.out.println("Not a valid selection.");
                  break;
            }
            System.out.println();
         }
      }
    
       public static void save(Salesperson[] array)
      {
         PrintStream outfile = null;
         try
         {
            outfile = new PrintStream(new FileOutputStream("data.txt"));
         }
             catch(FileNotFoundException e)
				 {
               JOptionPane.showMessageDialog(null, "The file could not be created.");
             }
         outfile.println(array.length);
         for(int i = 0; i < array.length; i++)
         {
            outfile.println(array[i].getName());
            outfile.println(array[i].getCars());
            outfile.println(array[i].getTrucks());
         }
         outfile.close();
         System.out.println("Saved.");
      }
   	
       public static boolean search(Salesperson[] array, String name)
      {
         for(int i = 0; i < array.length; i++)
         {
            if(array[i].getName().equals(name))
            {
               return true;
            }
         }
         return false;
      }
   	
       public static boolean vehicleexisting(Salesperson[] array, String vehicle)
      {
         if(vehicle.equals("Cars") || vehicle.equals("Trucks"))
         {
            return true;
         }
         else
			{
            return false;
         }
      }
       public static void add(Salesperson[] array)
      {
         String name;
         String vehicle;
         do
         {
            name = JOptionPane.showInputDialog("Name?");
         }
         while(!search(array, name));
         do
         {
            vehicle = JOptionPane.showInputDialog("Cars or Trucks?");
         }
         while(!vehicleexisting(array, vehicle));
         int number = Integer.parseInt(JOptionPane.showInputDialog("How many?"));
         for(int i = 0; i < array.length; i++)
         {
            if(array[i].getName().equals(name))
            {
               if(vehicle.equals("Cars"))
               {
                  array[i].setCars(array[i].getCars() + number);
               }
               else if(vehicle.equals("Trucks"))
					{
                  array[i].setTrucks(array[i].getTrucks() + number);
               }
               break;
            }
         }
         System.out.println("Sales added.");
      }
   	
       public static void display(Salesperson[] array, Comparator c) throws Exception
		 {
         sort(array, c);
         System.out.println("Name\tCars\tTrucks\tTotal");
         System.out.println("-------------------------");
         for(int i = 0; i < array.length; i++)
			{
            System.out.print(array[i].getName() + "\t" + array[i].getCars() + "\t" + array[i].getTrucks() + "\t" + array[i].getTotalSales());
            System.out.println("");
         }
      }
   	
       public static void sort(Object[] array, Comparator c)
		 {
         int maxPos;
         for(int k = 0; k < array.length; k++)
         {
            maxPos = findMax(array, array.length - k - 1, c);
            swap(array, maxPos, array.length - k - 1);
         }
      }
   	
       public static int findMax(Object[] array, int upper, Comparator c)
		 {
         int maxIndex = 0;
         int temp = -1;
         for(int x = upper; x >= 0; x--)
			{	
            if(c.compare(array[x], array[maxIndex]) > temp)
				{
               maxIndex = x;
               temp = c.compare(array[x], array[maxIndex]);
            }
         }
         return maxIndex;
      }
   	
       public static void swap(Object[] array, int a, int b)
		 {
         Object temp = array[b];
         array[b] = array[a];
         array[a] = temp;
      }
   }