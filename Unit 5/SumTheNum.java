// Viraj Patel

import java.util.*;
public class SumTheNum
{
	public static void main (String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int nonNegative;

		do
		{
			System.out.print("Enter a non-negative number: ");
			nonNegative = keyboard.nextInt();
		}
		while (nonNegative <= 0);

		System.out.println("The sum of the digits in "+nonNegative+ " is "+ sumDigits(nonNegative));
	}

	// Place your code for sumDigits here, remember to make the method static
	public static int sumDigits(int nonNegative)
	{
		int sumDigits = 0;
		int q = 0;
		while(nonNegative > 0)
		{
			q = nonNegative % 10;
			sumDigits += q;
			nonNegative /= 10;
		}
		return sumDigits;
	}
}