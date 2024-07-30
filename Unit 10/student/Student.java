public class Student extends Person
{
	public Student(String n, int b)
	{
		super(n, b);
	}
	public String toString()
	{
		return "Name: " + name + "\n Birthday: " + birthday + "\n Major: Computer Science";
	}
}