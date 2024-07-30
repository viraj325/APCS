
//Name:Viraj Patel
import java.util.*;

public class TestFractions
{
  public static void testConstructors()
  {

    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction(7);
    Fraction f3 = new Fraction(12, -20);
    Fraction f4 = new Fraction(f3);

    System.out.println("f1 = " + f1);
    System.out.println("f2 = " + f2);
    System.out.println("f3 = " + f3);
    System.out.println("f4 = " + f4);
    System.out.println();
  }

  public static void testArithmetic()
  {
    Fraction f1 = new Fraction(1, 2);
    Fraction f2 = new Fraction(1, 3);

    Fraction sum = f1.add(f2);
    System.out.println(f1 + " + " + f2 + " = " + sum);

    Fraction product = f1.multiply(f2);
    System.out.println(f1 + " * " + f2 + " = " + product);

    System.out.println();
  }

  public static void testValues()
  {
    Fraction f = new Fraction(2, 3);
    System.out.println(f + " = " + f.getValue());
    System.out.println();
  }

  public static void main(String[] args)
  {
	  	  Fraction[] frac = new Fraction[3];

    Fraction s2 = new Fraction(7,8);
    Fraction s1 = new Fraction(2,3);
    Fraction s3 = new Fraction(4, 6);

    frac[0] = s1;
    frac[1] = s2;
    frac[2] = s3;
    Arrays.sort(frac);
    System.out.println(s1);
    testConstructors();
    testArithmetic();
    testValues();

    System.out.println(frac[0].compareTo(frac[2]));
    System.out.println(frac[0].equals(frac[2]));

  }
}
