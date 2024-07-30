//	Viraj Patel

public class NestedLoopTriangle
{
	public static void main (String [] args)
	{
		printStarTriangle(5);
		System.out.println("\n\n\n");
		printStarTriangle(8);
		System.out.println("\n\n\n");
	}

	public static void printStarTriangle(int n)
	{
		for(int c = 1; c <= n; c ++)
		{
			int r = (c * 2) - 1;
			int s = n - c;
			while (s > 0)
			{
				System.out.print(" ");
				s --;
			}
			for(int columns = 1; columns <= r; columns++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
