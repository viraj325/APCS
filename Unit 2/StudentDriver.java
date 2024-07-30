
//	Viraj Patel

public class StudentDriver
{
	public static void main (String [] args)
	{
		Student one = new Student("John", "Smith", 11);
		Student two = new Student("Amy", "Doe", 12);

		//Print out info for Student one

			one.calculateGpa(15,4);
		System.out.println("Student Info:");
		System.out.println("Name: "+one.getFirstName() +" "+one.getLastName());
		System.out.println("GPA: "+ one.getGPA());

		System.out.println();

		two.calculateGpa(9,3);
				System.out.println("Student Info:");
				System.out.println("Name: "+two.getFirstName() +" "+two.getLastName());
		System.out.println("GPA: "+ two.getGPA());



		// Print out info for Student two

		System.out.println("Student Info:");





	}
}
