// Viraj Patel


public class Three
{
	public static void main (String [] args)
	{
		int x = 1, y = 2, z =3;

		System.out.println("Testing max1");
		System.out.println(max1(x, y, z));
		System.out.println(max1(y, z, x));
		System.out.println(max1(z, y, x));

		System.out.println("\nTesting max2");
		System.out.println(max2(x, y, z));
		System.out.println(max2(y, x, z));
		System.out.println(max2(z, y, x));
	}

	public static int max1(int x, int y, int z)
	{
		int max = Math.max(Math.max(x, y),z);
		return max;
	}

	public static int max2(int x, int y, int z)
	{
		if(x > y && x > z)
		{
			return x;
		}
		else if(y > z && y > x)
		{
			return y;
		}
		else if(z > x && z > y)
		{
			return z;
		}
		return max2(x,y,z);
	}
}