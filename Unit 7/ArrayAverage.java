// 	Name:   Viraj Patel
public class ArrayAverage
{
	public static void main (String [] args)
	{
		double [] array = fillArray();
		printArray(array);
		// call the method average here...
		System.out.println("Average " + average(array));
	}

	public static double [] fillArray()
	{
		double [] arr = new double[25];
		for (int c = 0; c < arr.length; c++)
		{
			arr[c] = (int)(Math.random()*11);
		}
		return arr;
	}
	public static void printArray(double [] arr)
	{
		for (double x : arr)
			System.out.print(x +" ");
		System.out.println();
	}

	// Add the method average here
	public static double average(double[] array)
	{
		double s = 0;
		for(double i : array)
		{
			s += i;
		}
		s = s/array.length;

		return s;
	}
}