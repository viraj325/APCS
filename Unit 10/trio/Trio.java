//Viraj Patel

public class Trio implements MenuItem
{
	private Sandwich s;
	private Salad sl;
	 private Drink d;

	public Trio(Sandwich sand, Salad sal, Drink dri)
	{
		s = sand;
		sl = sal;
		d = dri;
	}

	public String getName()
	{
		String hi = s.getName() + ", " + sl.getName() + ", " + d.getName();
		return hi;
	}

	public double getPrice()
	{
		double min = Math.min(s.getPrice(), Math.min(sl.getPrice(), d.getPrice()));
		double price = (s.getPrice() + sl.getPrice() + d.getPrice()) - min;
		return price;
	}
}