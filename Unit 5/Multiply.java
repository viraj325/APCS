// Viraj Patel

public class Multiply
{
	public static void main (String[]args)
	{
		System.out.println("The anwser is " + product(3,14));
		System.out.println("The anwser is " + product(4,1));
		System.out.println("The anwser is " + product(5,2));
	}
	public static int product(int a,int b)
	{
		int sum = 0;

		for(int v = 0; v < a; v++)
		{
			sum = sum + b;
		}
		return sum;
	}
}