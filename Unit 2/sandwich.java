/*
 	Programmer:Viraj Patel
 	Date:9/6/2016
 	Project:Sandwich
 	FileName:sandwich.java
 	Program Description:This program makes sandwich with random ingredients each time it runs with different prices.
*/

 public class sandwich
 {
	 private String Bread;
	 private String Cheese;
	 private String Meat;
	 private double Price;

	public sandwich()
	{
		Bread = chooseBread();
		Cheese = chooseCheese();
		Meat = chooseMeat();
		Price = 2.50;
		calcPrice();
	}
	 public String chooseBread()
	 {
		String [] bread = {"White Bread", "Wheat Bread", "Whole Grain", "Rye", "Flat Bread"};
		int x = (int)(Math.random()*bread.length);
		return bread[x];
	 }
	 public String chooseMeat()
	 {
		 String [] meat = {"Ham", "Roast Beef", "Chicken", "Turkey", "Tuna Salad"};
		 int y = (int)(Math.random()*meat.length);
		 return meat[y];
	 }
	 public String chooseCheese()
	 {
		 String [] cheese = {"Swiss Cheese", "American Cheese", "Colby Cheese", "Cheddar Cheese", "Provolone Cheese"};
		 int z = (int)(Math.random()*cheese.length);
		 return cheese[z];
	 }
	 public void calcPrice()
	 {
		if(Bread.equals("Flat Bread"))
		{
		 	Price += .75;
		}

		if(Meat.equals("Roast Beef"))
		{
			Price += 1.00;
		}
	}
	public String getBread()
	{
		return Bread;
	}
	public String getMeat()
	{
		return Meat;
	}
	public String getCheese()
	{
		return Cheese;
	}
	public double getPrice()
	{
		return Price;
	}
}