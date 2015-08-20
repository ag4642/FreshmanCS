   import java.util.Random;
    public class Driver03
	 {
      static Random random = new Random();
       public static void main(String[] args)
		 {
         int[] array = {100, 101, 102, 103, 104, 105, 106, 107, 108, 109};
         print(array);
         scramble(array);
         print(array);
         sort(array);
         print(array);
      }
   	
       public static void print(int[] array)
		 {
         System.out.println("Array");
         System.out.println("---------------");
         for(int x = 0; x < array.length; x++)
			{
            System.out.println(array[x]);
         }
         System.out.println("");
      }
   	
       public static void scramble(int[] array)
		 {
         for(int i = 0; i < array.length; i++)
			{
            swap(array, i, random.nextInt(6));
         }
      }
   	
       public static void swap(int[] array, int i, int j)
		 {
         int temp = array[i];
         array[i] = array[j];
         array[j] = temp;
      }
       public static void sort(int[] array)
		 {
         int maxPos;
         for(int k = 0; k < array.length; k++)
			{
            maxPos = findMax(array, array.length - k - 1);
            swap(array, maxPos, array.length - k - 1);
         }
      }
       public static int findMax(int[] array, int upper)
		 {
         int maxIndex = 0;
         for(int y = upper; y >= 0; y--)
			{
            if(array[y] > array[maxIndex])
				{
               maxIndex = y;
            }
         }
         return maxIndex;
      }
   }