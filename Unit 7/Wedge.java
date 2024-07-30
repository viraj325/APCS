
// Viraj Patel

public class Wedge
{
	public static void main (String [] args)
	{
		int number = 5;
		int [] wedgeArray = new int[(number * 2)-1];


		// call the method createWedge here
		wedgeArray = createWedge(number);

		printArray(wedgeArray);

	}

	public static void printArray(int [] arr)
	{
		for (int c = 0; c < arr.length; c ++)
			System.out.print(arr[c] + " ");
		System.out.println();
		System.out.println();
	}

	// code the createWedge method here

	public static int[] createWedge(int n)
	{
		int [] wedArray = new int[n * 2 - 1];

		for(int c = 1; c <= n; c++)
		{
			wedArray[c - 1] = c;
		}
		for(int i = n * 2 - 1; i > n; i--)
		{
			wedArray[i - 1] = n * 2 - i;
		}
		return wedArray;
	}
}