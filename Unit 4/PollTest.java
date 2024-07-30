/*
	Name- Viraj Patel
	Date- 9/28/2016
	Program- PollTest
	File Name- PollTest.java
	Description- This program will display the scores of tami, brian, liz
*/

public class PollTest
{
	public static void main(String [] args)
	{
		PollDisplayPanel votingMachine = new PollDisplayPanel("Tami", "Brian", "Liz");

		votingMachine.vote1();
		votingMachine.vote2();
		votingMachine.vote2();

		System.out.println(votingMachine);
	}
}