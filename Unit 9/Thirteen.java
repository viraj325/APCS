// Viraj Patel

import java.util.*;

public class Thirteen
{
	public static void main (String [] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer> (10);

		fillList(list);
		System.out.println(list);
		removeSmallestElement(list);
		System.out.println(list);
	}

	public static void fillList(ArrayList<Integer> alist)
	{
		int element;

		for (int index = 0; index < 10; index ++)
		{
			element = (int)(Math.random()*100) +1;
			alist.add(element);
		}
	}

public static ArrayList<Integer> removeSmallestElement(ArrayList<Integer>list)
{
	int minimum = list.get(0);
	for(int i = 0; i < list.size(); i++)
	{
		int number = list.get(i);
		if(number < minimum)
		minimum = number;
	}
	list.remove(list.indexOf(minimum));


    return list;
}
	// add the method removeSmallestElement here


}