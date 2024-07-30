
// Programmer- Viraj Patel

public class DVDDriver
{
	public static void main(String [] args)
	{
		DVD Avatar = new DVD("Avatar", "Fantasy/Science", 162);
		DVD Jaws = new DVD("Jaws", "Mystery/Drama", 130);
		DVD Park = new DVD(620, "Fantasy/Science", "Jurassic Park Trilogy");

		DVD.printLogo();

		System.out.println(Avatar);
		System.out.println(Jaws);
		System.out.println(Park);
	}
}