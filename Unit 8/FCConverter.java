//Name- Viraj Patel

public class FCConverter
{
	private double Fahrenheit;
	private double Celsius;

	public double setFahrenheit(double deg)
	{
		Celsius = 5.0/9*(deg-32);
		return Celsius;
	}
	public double getFahrenheit()
	{
		return Fahrenheit;
	}
	public double setCelsius(double deg)
	{
		Fahrenheit = 9.0/5*deg +32;
		return Fahrenheit;
	}
	public double getCelsius()
	{
		return Celsius;
	}
}