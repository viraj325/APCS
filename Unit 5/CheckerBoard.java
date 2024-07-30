//	Viraj Patel

public class CheckerBoard
{
	public static void main (String [] args)
	{
		printCheckerboard(5);
		System.out.println("\n\n\n");
		printCheckerboard(4);
	}

	public static void printCheckerboard(int n)
	{
		for(int rows = 1; rows <= n; rows ++)
		{
			for(int columns = 1; columns <= n; columns++)
			{
				if(rows % 2 == columns % 2)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("o");
				}

			}System.out.println();
		}
	}
}