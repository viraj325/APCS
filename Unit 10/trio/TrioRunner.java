//Viraj Patel

public class TrioRunner
{
	public static void main(String [] args)
	{
		Sandwich s = new Sandwich("CheeseBurger", 2.75);
		Salad sl = new Salad("Spinach Salad", 1.25);
		Drink d = new Drink("Orange Soda", 1.25);

		Sandwich sa = new Sandwich("Club Sandwich", 2.75);
		Salad sal = new Salad("Coleslaw", 1.25);
		Drink dr = new Drink("Cappuccino", 3.50);

		Trio t = new Trio(s,sl,d);
		Trio tr = new Trio(sa, sal, dr);

		System.out.println(t.getName());
		System.out.println("$" + t.getPrice());

		System.out.println();

		System.out.println(tr.getName());
		System.out.println("$" + tr.getPrice());

		System.out.println();
	}
}