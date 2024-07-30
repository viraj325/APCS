public class Person
{
	protected String name;
	protected int birthday;

	public Person(String n, int b)
	{
		name = n;
		birthday = b;
	}
	public String toString()
	{
		return "Name: " + name + "\n Birthday: " + birthday;
	}
}