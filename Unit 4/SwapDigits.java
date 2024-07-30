/*
	Name: Viraj Patel
	Date: 9/22/2016
	Project: SwapDigits
	FileName: SwapDigits.java
	Program Description: This program will switch the last two digits of any user input
*/
import java.util.*;

public class SwapDigits
{
	public static void main(String [] args)
	{
		Scanner shane = new Scanner(System.in);

		System.out.println("Enter a number:");
			int j = shane.nextInt();

		int javi = (j/100) * 100;
		int sh = j - javi;
		int go = sh/10;
		int vi = sh - (go * 10);
		int jalepeno = go + (vi * 10);
		int digits = javi + jalepeno;

		System.out.println(digits);
	}
}