/*
	Name:Viraj Patel
*/
public class DieTester
{
	public static void main(String [] args)
	{
		Die die = new Die();

		die.roll();
		System.out.println(die.getNumDots());

		die.roll();
		System.out.println(die.getNumDots());

		die.roll();
		System.out.println(die.getNumDots());

		die.roll();
		System.out.println(die.getNumDots());
	}
}