//		Place your name here: Viraj Patel

public class Coins
{
	private int p;
	private int n;
	private int d;
	private int q;

	public Coins(int cents)
	{
		int change = cents;

		q = cents / 25;
		change = cents % 25;

		d = change / 10;
		change = change % 10;

		n = change / 5;
		change = change % 5;

		p = change;
	}
		public int getQuarters()
		{
			return q;
		}
		public int getDimes()
		{
			return d;
		}

		public int getNickels()
		{
			return n;
		}

		public int getPennys()
		{
			return p;
		}

}