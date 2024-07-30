//Viraj Patel

public class Triangles
{

public static void printStars(int n)
{
    for(int i = 0; i < n; i++)
    {
    System.out.print("*");
    }
    System.out.println();
}

public static void main(String [] args)
{
    printTriangle(5);
    System.out.println();
    printTriangle1(5);
}

public static void printTriangle(int n)
{
	if(n > 0)
	{
		printTriangle(n-1);
		printStars(n);
	}
 }
public static void printTriangle1(int n)
{
	if(n > 0)
	{
	 printStars(n);
		printTriangle1(n-1);
	}
}
}