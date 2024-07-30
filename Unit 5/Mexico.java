//	Viraj Patel

import java.util.*;
public class Mexico
{
	public static void main (String [] args)
	{
		// declare variables and constants here needed to complete this task
		final double GROWTH_RATE_PER_YEAR = 1.005;
		final double STARTING_POPULATION_NUMBER = 123.8;
		final int STARTING_YEAR = 2014;

		double population = STARTING_POPULATION_NUMBER;
		int starting = STARTING_YEAR;

		double target;  // user input
		int year = starting;  // program answer

		Scanner keyboard = new Scanner (System.in);

		System.out.print("Enter target population (in millions): ");
		target = keyboard.nextDouble();

		while(population <= target)
		{
			population *= GROWTH_RATE_PER_YEAR;
			year += 1;
		}

        System.out.println("The population of Mexico will reach or exceed "+target + " million in " + year);
	}
}

