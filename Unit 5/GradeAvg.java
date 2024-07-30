
//	Viraj Patel


import java.io.*;
import java.util.Scanner;

public class GradeAvg
{
  public static void main(String[] args)
  {
	 double t = 0;
	 double c = 0;
    Scanner input = null;

    try
    {
      input = new Scanner(new File("scores.dat"));
    }
    catch (FileNotFoundException e)
    {
      System.out.println("***  Can't open scores.dat ***");
      System.exit(1);
    }

    while(input.hasNextInt() != false)
    {
		t += input.nextDouble();
		c++;
	}
	t = t/c;
	System.out.println(t);
  }
}
