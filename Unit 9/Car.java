public class Car
{
	private String make;
	private int yearModel;
	private double price;
	private int mileage;

	public Car (String mk, int year, double pr, int miles)
	{
		make = mk;
		yearModel = year;
		price = pr;
		mileage = miles;
	}

	public String getMake()
	{
		return make;
	}

	public int getYearModel()
	{
		return yearModel;
	}

	public double getPrice()
	{
		return price;
	}

	public int getMileage()
	{
		return mileage;
	}




	public String toString()
	{
		return "Make: " + make+"\n"+"YearModel: " + yearModel +"\n"+
		"Price: $" + price +"\n" + "Mileage: "+ mileage + " miles\n\n";
	}

}