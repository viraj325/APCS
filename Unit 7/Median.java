// Add name here: Viraj Patel

public class Median
{
	public static void main (String [] args)
	{
		double [] viraj = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7,7.8, 8.9};
		double [] patel = {1.2, 2.3, 3.4, 4.5, 5.6, 6.7,7.8};

		double test = 4.64;
		// add the method calls here to test if 4.64 is a
		// median for array1 and array2
		System.out.println(isMedian(viraj,test));
		System.out.println(isMedian(patel,test));

	}
	// complete the isMedian method here
	// follow the definition for median given in problem
	// #23, on page 264

	public static boolean isMedian(double [] sample, double m)
	{
		int mo = 0;
		int l = 0;
		int e = 0;

		for(double v : sample)
		{
			if(m < v)
			{
				l += 1;
			}
			else if(m > v)
			{
				mo += 1;
			}
			else
			{
				e += 1;
			}
		}
		if(mo == l)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}