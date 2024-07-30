//Name: Viraj Patel

import java.util.*;
public class TwoRemover
{
	public static void main(String [] args)
	{
    	System.out.println("The Unsorted Array:");
    	int [] array = createArr();
    	System.out.println(Arrays.toString(array));
    	System.out.println("The sorted array:");
    	Arrays.sort(array);
    	System.out.println(Arrays.toString(array));
    	System.out.println("The new array:");
    	biSearch(array);
	}

	public static void biSearch(int [] array)
	{
		int x = Arrays.binarySearch(array, 2);

    	int [] ran ;

	 	int count = 0;

   	 while( x >= 0)
   	 {
   		 array[x] = 9;

   		count++;
   		Arrays.sort(array);
   		x = Arrays.binarySearch(array, 2);
   	  }


    ran = new int[20 - count];

    for(int a = 0; a < ran.length; a++)
    {
   		 ran[a] = array[a];
   	 }

   	 System.out.println(Arrays.toString(ran));

}

public static int[] createArr()
{
int[] random = new int[20];

for(int x = 0; x < random.length; x++)
{
    int newNum = (int)(Math.random()*6);
    random[x] = newNum;
}
return random;
}
}