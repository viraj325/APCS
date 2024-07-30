//Name- Viraj Patel
public class Die
{
	private int rollNum;

	public static void main(String [] args)
	{
		Die die = new Die();
		die.roll();
		System.out.println(die.getNumDots());
		die.roll();
	}
	public void roll()
	{
		rollNum =(int)(Math.random()*6)+1;
	}
	public int getNumDots()
	{
		return rollNum;
	}
}