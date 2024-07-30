//	Viraj Patel
import java.util.*;
import java.io.*;
public class CarLott2
{
	public static void main (String [] args)
	{
		ArrayList<Car> inventory = new ArrayList<Car>();

		inventory = fillInventory();

		printInventory(inventory);

		increaseInventory(inventory);
		printInventory(inventory);

		buyCar(inventory);
		printInventory(inventory);

	}

	public static ArrayList<Car> fillInventory()
	{
		ArrayList<Car> original = new ArrayList<Car> ();
		Scanner input = null;
		try
		{
			input = new Scanner (new File ("CarLotInventory.txt"));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("*** Cannot open the data file *****");
			System.exit(1);
		}

		String make;

		int year;

		double price;

		int miles;

		for (int x = 0; x < 4; x++)
		{
			make = input.next();
			year = input.nextInt();
			price = input.nextDouble();
			miles = input.nextInt();
			original.add (new Car(make, year, price, miles));
		}
		return original;
	}

	public static void printInventory(ArrayList<Car> c)
	{
		for(int x = 0; x < c.size(); x++)
		{
			System.out.println("Car #" + (x + 1));
			System.out.print(c.get(x));
		}
	}

	public static void increaseInventory(ArrayList<Car> c)
	{
		Scanner keyboard = new Scanner(System.in);

		String make;

		int year;

		double price;

		int miles;

		System.out.print("Enter the number of cars to add to the lot: ");
		int x = keyboard.nextInt();

		for(int i = 0; i < x; i++)
		{
			System.out.print("Enter the make of the car: ");
			make = keyboard.next();

			System.out.print("Enter the year of the car: ");
			year = keyboard.nextInt();

			System.out.print("Enter the price of the car: ");
			price = keyboard.nextDouble();

			System.out.print("Enter the miles of the car: ");
			miles = keyboard.nextInt();

			c.add(new Car(make, year, price, miles));

			System.out.println();
		}
	}

	public static void buyCar(ArrayList<Car> c)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Which car would you like to purchase?");
		int x = keyboard.nextInt();

		System.out.println("*************************************");
		System.out.println("*************************************");

		System.out.println("Here's your new car!");

		System.out.print(c.get(x - 1));

		System.out.println("*************************************");
		System.out.println("*************************************");

		c.remove(x - 1);
	}
}