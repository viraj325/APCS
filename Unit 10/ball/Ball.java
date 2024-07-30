public abstract class Ball
{
	private String type;

	public Ball(String t)
	{
		type = t;
	}
	public String getType()
	{
		return type;
	}
	public abstract void play();
}