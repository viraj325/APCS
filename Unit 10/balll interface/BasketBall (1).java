public class BasketBall extends Ball implements Bounceable
{
	public BasketBall()
	{
		super("Basketball");
	}
	public void play()
	{
		System.out.println("Playing: Basketball starts with a tipoff");
	}
	public String bounce()
	{
		return "Bouncing dribble...";
	}
}