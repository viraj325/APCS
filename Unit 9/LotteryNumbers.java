// Abhishek, Viraj, Angelica
public class LotteryNumbers
{
	public static void main(String[] args)
	{
		int[][] numbers = new int[2] [5];
		int i=0;
		while(i<5)
		{
			int x = (int) (Math.random()*55)+1;
			boolean removeDupes = false;

			for(int j=0; j<i; j++)
			{
				if(numbers[0][j]==x)
				{
					removeDupes=true;
				}
			}
			if(!removeDupes)
			{
				numbers[0][i] = x;
				System.out.println(numbers[0][i]);
				i++;
			}

		}
	}
}