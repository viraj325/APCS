// Viraj Patel

public class Four
{
	public static void main (String [] args)
	{
		System.out.println("True or False? 16 is a perfect square? "+ perfectSquare(16));
		System.out.println("True or False? 13 is a perfect square? "+ perfectSquare(13));
	}

	public static boolean perfectSquare(int x)
	{
		double sr = (Math.sqrt(x));
		int O = (int)(Math.round(sr));

		if(O * sr == x)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}