//	Place your name here: Viraj Patel

import java.util.*;
public class CoinRunner
{

	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner (System.in);



	System.out.print("Please enter how much money you have in Cents: ");
	int cents = keyboard.nextInt();

	Coins something = new Coins(cents);

	System.out.println();
	System.out.println("You now have " + something.getPennys() + " Pennys!");
	System.out.println("You now have " + something.getNickels() + " Nickels!");
	System.out.println("You now have " + something.getDimes() + " Dimes!");
	System.out.println("You now have " + something.getQuarters() + " quarters!");
	System.out.println();
	}
}