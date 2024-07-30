// Viraj Patel

import java.util.*;
public class OddRunner
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner (System.in);
		System.out.print("Enter a positive number: ");
		int number = keyboard.nextInt();
		System.out.println("The sum of the odd integers up to "+ number +" is "+ addOdds(number));
	}

	public static int addOdds(int n)
	{
		int addOdds = 0;

		for(int i = 1; i <= n; i += 2)
		{
			addOdds += i;
		}
		return addOdds;
	}
}