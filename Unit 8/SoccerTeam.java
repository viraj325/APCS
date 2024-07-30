//Name: Viraj Patel

public class SoccerTeam
{
	private int win;
	private int loss;
	private int tie;
	private static int total;
	private static int num;

	public void played(SoccerTeam other, int myScore, int otherScore)
	{
		total++;
		num += myScore + otherScore;
		if(myScore > otherScore)
		{
			this.win++;
			other.loss++;
		}
		else if(myScore < otherScore)
		{
			other.win++;
			this.loss++;
		}
		else if(myScore == otherScore)
		{
			this.tie++;
			other.tie++;
		}
	}
	public int getCount()
	{
		int tot;

		tot = 3 * win + tie;
		return tot;
	}
	public void reset()
	{
		win = 0;
		loss = 0;
		tie = 0;
	}
	public static int getTotal()
	{
		return total;
	}
	public static int getNum()
	{
		return num;
	}
	public static void startTournament()
	{
		num = 0;
		total = 0;
	}
}