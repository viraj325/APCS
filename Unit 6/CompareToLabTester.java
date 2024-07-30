//	Viraj Patel

public class CompareToLabTester
{
	public static void main (String [] args)
	{

		System.out.println("First: "+ findFirst("cat", "dog", "bird"));
		System.out.println("First: "+ findFirst("bird", "dog", "cat"));
		System.out.println("First: "+ findFirst("dog", "bird", "cat"));

	System.out.println("Last: "+ findLast("cat", "dog", "bird"));
		System.out.println("Last: "+ findLast("dog", "bird", "cat"));
		System.out.println("Last: "+ findLast("cat", "bird", "dog"));

		orderStrings("cat", "dog", "bird");
		orderStrings("bird", "cat", "dog");
		orderStrings("bird", "dog", "cat");
		orderStrings("dog", "bird", "cat");
		orderStrings("dog", "cat", "bird");
		orderStrings("cat", "bird", "dog");
	}
	public static String findFirst(String a, String b, String c)
	{
		int x = a.compareTo(b);
		int y = b.compareTo(c);
		int z = a.compareTo(c);

		if(x < 0 && z < 0)
			return a;
		else if(y > 0 && z > 0)
			return c;
		else
			return b;
	}
	public static String findLast(String a, String b, String c)
		{
			int x = a.compareTo(b);
			int y = b.compareTo(c);
			int z = a.compareTo(c);

			if(x > 0 && z > 0)
				return a;
			else if(y < 0 && z < 0)
				return c;
			else
				return b;
	}
	public static void orderStrings(String a, String b, String c)
	{
		String first = findFirst(a,b,c);
		String last = findLast(a,b,c);
		String middle = "";
		if(first != a && last != a)
		middle = a;
		else if (first != b && last != b)
		middle = b;
		else if(first != c && last != c)
		middle = c;

			System.out.println(first + ", " + middle + ", " + last);
}
}
