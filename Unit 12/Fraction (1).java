
//Name:Viraj Patel

// Represents a fraction with an int numerator and int denominator
// and provides methods for adding and multiplying fractions.
public class Fraction implements Comparable <Fraction>
{
  // *** instance variables ***
  private int num;
  private int denom;

  // *** Constructors ***

  public Fraction()       // no-args constructor
  {
    num = 0;
    denom = 1;
  }

  /*public int compareTo(Fraction obj)
  {
	  if (this.getValue() == obj.getValue())
	      {
	     	 return 0;
	      }
	      else if(this.getValue() < obj.getValue())
	      {
	     	 return -1;
	      }
	      else
	      return 1;
  }*/



  public Fraction(int n)
  {
    num = n;
    denom = 1;
  }

  public Fraction(int n, int d)
  {
    if (d != 0)
    {
      num = n;
      denom = d;
      reduce();
    }
    else
    {
      throw new IllegalArgumentException(
           "Fraction construction error: denominator is 0");
    }
  }

  public Fraction(Fraction other)  // copy constructor
  {
    num = other.num;
    denom = other.denom;
  }

  /*public boolean equals(Object other) // can't change the Object type
  	{
  		if (other != null)
  			return true;
  		else
  			return false;
  	}*/

  	public int compareTo(Fraction other)
  	{
  		if(this.getValue() == other.getValue())
		  		return 0;
		  		else if(this.getValue() > other.getValue())
		  		return -1;
		  		else
  		return 1;
	}

  // *** public methods ***

  // Returns the sum of this fraction and other
  public Fraction add(Fraction other)
  {
    int newNum = num * other.denom + denom * other.num;
    int newDenom = denom * other.denom;
    Fraction t = new Fraction(newNum, newDenom);
    return t;
  }

  // Returns the sum of this fraction and m
  public Fraction add(int m)
  {
    return new Fraction(num + m * denom, denom);
  }

  // Returns the product of this fraction and other
  public Fraction multiply(Fraction other)
  {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  // Returns the product of this fraction and m
  public Fraction multiply(int m)
  {
    return new Fraction(num * m, denom);
  }

  // Returns the value of this fraction as a double
  public double getValue()
  {
    return (double)num / (double)denom;
  }

  // Returns a string representation of this fraction
  public String toString()
  {
    return num + "/" + denom;
  }

  // *** private methods ***

  // Reduces this fraction by the gcf and makes denom > 0
  private void reduce()
  {
    if (num == 0)
    {
      denom = 1;
      return;
    }

    if (denom < 0)
    {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;
  }

  //  Returns the greatest common factor of two positive integers
  private int gcf(int n, int d)
  {
    if (n <= 0 || d <= 0)
    {
      throw new IllegalArgumentException(
                  "gcf precondition failed: " + n + ", " + d);
    }

    if (n % d == 0)
      return d;
    else if (d % n == 0)
      return n;
    else
      return gcf(n % d, d % n);
  }
}
