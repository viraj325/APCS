//programmer- Viraj Patel

public class sandwichrunner
{
	public static void main(String [] args)
	{
		sandwich maker = new sandwich();

		System.out.println("Here's what's for lunch today!!");
		System.out.println("Your sandwich consists of:");
		System.out.println();
		System.out.println("Bread: " + maker.getBread());
		System.out.println("Meat: " + maker.getMeat());
		System.out.println("Cheese: " + maker.getCheese());
		System.out.println("Price: $" + maker.getPrice());
		System.out.println();
		System.out.println("Bon Appetit!!");
		System.out.println();
	}
}