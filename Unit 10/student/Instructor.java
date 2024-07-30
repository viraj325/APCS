public class Instructor extends Person
{
	protected double salary;
	public Instructor(String n, int b)
	{
		super(n, b);
	}
	public String toString()
	{
		return "Name: " + name + "\n Birthday: " + birthday + "\n Salary: $1000";
	}

}