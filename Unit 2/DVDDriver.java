// Programmer- Viraj Patel

public class DVDDriver
{
	public static void main(String [] args)
	{
		DVD Avatar = new DVD("Avatar", "Fantasy/Science", 162);
		DVD Jaws = new DVD("Jaws", "Mystery/Drama", 130);
		DVD Park = new DVD(620, "Fantasy/Science", "Jurassic Park Trilogy");

		DVD.printLogo();

		System.out.println("Title:     " + Avatar.getTitle());
		System.out.println("Genre:     " + Avatar.getGenre());
		System.out.println("Length:    " + Avatar.getLength() + " minutes");
		System.out.println("Price:     " + "$" + Avatar.getPrice());

		System.out.println();

		System.out.println("Title:     " + Jaws.getTitle());
		System.out.println("Genre:     " + Jaws.getGenre());
		System.out.println("Length:    " + Jaws.getLength() + " minutes");
		System.out.println("Price:     " + "$" + Jaws.getPrice());

		System.out.println();

		System.out.println("Title:     " + Park.getTitle());
		System.out.println("Genre:     " + Park.getGenre());
		System.out.println("Length:    " + Park.getLength() + " minutes");
		System.out.println("Price:     " + "$" + Park.getPrice());

		System.out.println();
		System.out.println();
		System.out.println();
	}
}