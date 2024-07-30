//	Viraj Patel

import java.util.*;

public class Fifteen
{
	public static void main (String [] args)
	{
		ArrayList<String> APNames = new ArrayList<String> ();

		ArrayList<String> PreCalcNames = new ArrayList<String> ();

		System.out.println("Enter the names of the AP Computer Science Students:");
		APNames = getNames();

		System.out.println("Enter the names of the PreCalculus students:");
		PreCalcNames = getNames();

		System.out.println("AP Computer Science Students");
		System.out.println(APNames);

		System.out.println("Precalculus Students");
		System.out.println(PreCalcNames);

		System.out.println("Here is the AP Class with the PreCalculus students removed");

		removeDuplicates(APNames, PreCalcNames);

		System.out.println(APNames);
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
public static ArrayList<String> removeDuplicates(ArrayList<String>APNames, ArrayList<String>PreCalcNames)
{
	for(int i = 0; i < PreCalcNames.size(); i++)
	{
			if(APNames.contains(PreCalcNames.get(i)))
			{
				APNames.remove(PreCalcNames.get(i));
			}
	}
	return APNames;
}

		//add the code for removeDuplicates here


}

