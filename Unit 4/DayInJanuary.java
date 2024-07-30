/*
	Name: Viraj Patel
	Date: 9/23/2016
	Project: DayInJanuary
	File Name: DayInJanuary.java
	Project Description: This program will print out the week of the day.
*/
import java.util.*;

public class DayInJanuary
{
	public static void main(String [] args)
	{
		Scanner shane = new Scanner(System.in);

		int dayOfWeek1;
		int day;

		System.out.println("Please enter a day in January(1-31): ");
			int j = shane.nextInt();

		day = j - 1;
		dayOfWeek1 = day % 7;

		System.out.println();
		System.out.println("The day of the week for January " + j + " is " + dayOfWeek1);
		System.out.println();
	}
}