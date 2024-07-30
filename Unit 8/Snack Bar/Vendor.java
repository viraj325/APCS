//	Place your name here: Shane Spillman



/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/

public class Vendor
{
  // Fields:

 private static double totalSales;
 private int change = 0;
 private int money = 0;
 private int price = 0;
 private int temp = 0;
 private int stock = 0;


  //  Constructor
  //  Parameters:
  //    int price of a single item in cents
  //    int number of items to place in stock
  public Vendor(int a, int b)
  {
    stock = a;
    price = b;
  }

  //  Sets the quantity of items in stock.
  //    int number of items to place in stock
  //  Return:
  //  Parameters:
  //    None
  public setStock(int a)
  {
    stock = a;
  }

  //  Returns the number of items currently in stock.
  //  Parameters:
  //    None
  //  Return:
  //    int number of items currently in stock
  public getStock()
  {
    return stock;
  }

  //  Adds a specified amount (in cents) to the deposited amount.
  //  Parameters:
  //    int number of cents to add to the deposit
  //  Return:
  //    None
  public void addMoney(int m)
  {
    money += m;
  }

  //  Returns the currently deposited amount (in cents).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current deposit
  public int getDeposit()
  {
    return money;
  }

  //  Implements a sale.  If there are items in stock and
  //  the deposited amount is greater than or equal to
  //  the single item price, then adjusts the stock
  //  and calculates and sets change and returns true;
  //  otherwise refunds the whole deposit (moves it into change)
  //  and returns false.
  //  Parameters:
  //    None
  //  Return:
  //    boolean successful sale (true) or failure (false)
  public boolean makeSale()
  {
    if(money >= price)
    {
		stock--;
		totalSales += price;
		change = money - price;
		money = change;
		return true;
	}
	else
	{
		return false;
	}
  }

  //  Returns and zeroes out the amount of change (from the last
  //  sale or refund).
  //  Parameters:
  //    None
  //  Return:
  //    int number of cents in the current change
  ... getChange ...
  {
    ...
  }
}
