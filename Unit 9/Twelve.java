//	Viraj Patel


import java.util.*;

public class Twelve
{
	public static void main (String [] args)
	{
		ArrayList<String> names = new ArrayList<String> ();
		// Declare an ArrayList reverseList
		ArrayList<String> reverseList = new ArrayList<String> (names);



		names = getNames();
		System.out.println("Original List");
		System.out.println(names);
		reverseList = reverse(names);
		System.out.println("Original List Unchanged");
		System.out.println(names);
		System.out.println("Reversed List");
		System.out.println(reverseList);

	}

	public static ArrayList<String> getNames()
	{
		ArrayList<String> list = new ArrayList<String> ();
		Scanner keyboard = new Scanner(System.in);
		String input="empty";
		System.out.println("Enter stop to end input sequence.");

		while (!(input.equals("stop")))
		{
			System.out.print("Please enter a name: ");
			input = keyboard.nextLine();

			// add input to list
			if (!(input.equals("stop")))
			list.add(input);
		}
	return list;
}

	public static ArrayList<String> reverse(ArrayList<String>names)
	{
		ArrayList<String> r = new ArrayList<String> ();
		for(int i  = names.size()-1; i >= 0; i--)
		{
			r.add(names.get(i));
		}
		return r;
	}
	// add the code for method reverse here
}







