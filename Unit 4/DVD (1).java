/*
	Programmer:Viraj Patel
	Date:9/15/2016
	Project:DVD
	FileName:DVD.java
	Program Description: This is the DVD class modification which allows the program to print using toString.
*/

public class DVD
{
	private String ti;
	private String gen;
	private int len;
	private double price;

	public String toString()
	{
		return "Title: " + ti + "\nGenre: " + gen + "\nLength: " + len + " minutes" + "\nPrice: $" + price + "\n";
	}

	//1st Constructor
	public DVD(String title, String genre, int length)
	{
		ti = title;
		gen = genre;
		len = length;
		price = 14.99;
	}
	//2nd Constructor
	public DVD(int length, String genre, String title)
	{
		ti = title;
		gen = genre;
		len = length;
		price = 24.99;
	}

	//Accessor methods
	public String getTitle()
	{
		return ti;
	}
	public String getGenre()
	{
		return gen;
	}
	public int getLength()
	{
		return len;
	}
	public double getPrice()
	{
		return price;
	}

	//printLogo
	public static void printLogo()
	{
		System.out.println("!@#$%^&*()_+{}|:<>??><:}{+_)(*&^%$#@!!@#$%^&*()_+{}|:<>+?");
		System.out.println("@               Welcome to Don's DVD Shop               >");
		System.out.println("#    We are the best DVD seller in the whole universe,  <");
		System.out.println("$ I mean who even buy's DVDs from BlockBuster's anymore,:");
		System.out.println("%            We are the NEXT BIG THING!!                !");
		System.out.println("^    Thank you for shopping at Don's DVD Shop           @");
		System.out.println(":-------------------------------------------------------:");
		System.out.println("!             Single DVD's: $14.99                      @");
		System.out.println("$             Multiple Set DVD's: $24.99                *");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}
}