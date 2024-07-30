public class TennisBall extends Ball implements Bounceable
{
	public TennisBall()
	{
		super("Tennisball");
	}
	public void play()
	{
		System.out.println("Playing: All set for the match? I \" love \" this game!");
	}
	public String bounce()
	{
		return "Bouncing boing!";
	}
}