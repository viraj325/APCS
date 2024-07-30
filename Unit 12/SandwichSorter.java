//Viraj Patel

import java.util.*;
public class SandwichSorter
{
	private static String result = "";
	public static void main(String [] args)
	{
		Sandwich2[] sanArr = new Sandwich2[5];

		Sandwich2 v = new Sandwich2();
		Sandwich2 i = new Sandwich2();
		Sandwich2 r = new Sandwich2();
		Sandwich2 a = new Sandwich2();
		Sandwich2 j = new Sandwich2();
		sanArr[0] =  v;
		sanArr[1] =  i;
		sanArr[2] =  r;
		sanArr[3] =  a;
		sanArr[4] =  j;
		int cnt = 0;
		int cnt1 = 0;

		for(Sandwich2 obj: sanArr)
		{
			System.out.println(sanArr[cnt].toString());
			cnt++;
		}

		Arrays.sort(sanArr);
		System.out.println();
		for(Sandwich2 obj: sanArr)
		{
			result += obj+" ";
		}
		for(Sandwich2 obj: sanArr)
		{
			System.out.println(sanArr[cnt1].toString());
			cnt1++;
		}
		System.out.println();

		if( roast(sanArr) == true)
		System.out.println("There is a Sandwich with Roast Beef");
		else
		System.out.println("There is not a Sandwich with Roast Beef");
	}
	public String toString()
	{
		return result;
	}

	public static boolean roast(Sandwich2[] arr)
	{
		boolean roast = false;

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i].getMeat().compareTo("Roast Beef") == 0)
		{
   		 roast = true;
   		}
    }
    return roast;
	}
}
