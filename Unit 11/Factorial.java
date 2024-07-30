//Viraj Patel

public class Factorial
{
	public static void main(String [] args)
	{
		System.out.println(fact1(5));
		System.out.println(fact2(5));
	}
	public static long fact1(int n)
	{
		long prod = 1;
		for(int x = n; x >= 1; x--)
		{
			prod *= x;
		}
		return prod;
	}
	public static long fact2(int n)
	{
		if(n == 0)
		{
			return 1;
		}
		else
		{
			return n * fact2(n - 1);
		}
	}
}
