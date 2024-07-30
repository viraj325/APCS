//Viraj Patel
public class SoccerTeamTester
{
	public static void main(String [] args)
	{
		SoccerTeam red = new SoccerTeam();
		SoccerTeam blue = new SoccerTeam();
		SoccerTeam green = new SoccerTeam();

		red.played(blue, 1, 2);
		red.played(green, 2, 2);
		blue.played(green, 4, 1);
		green.played(red, 1, 3);

		System.out.println("red team has " + red.getCount() + " points");
		System.out.println("blue team has " + blue.getCount() + " points");
		System.out.println("green team has " + green.getCount() + " points");
		System.out.println();
		System.out.println("Total of " + SoccerTeam.getTotal() + " played, " + SoccerTeam.getNum() + " goals scored.");

		red.reset();
		green.reset();
		blue.reset();
		SoccerTeam.startTournament();

		red.played(blue, 3, 2);
		green.played(blue, 0, 4);
		blue.played(red, 1, 1);


		System.out.println("red team has " + red.getCount() + " points");
		System.out.println("blue team has " + blue.getCount() + " points");
		System.out.println("green team has " + green.getCount() + " points");
		System.out.println();
		System.out.println("Total of " + SoccerTeam.getTotal() + " played, " + SoccerTeam.getNum() + " goals scored.");
	}
}