//Viraj Patel

public class Sandwich2 implements Comparable<Sandwich2>{

private String breadRan;
private String cheeseRan;
private String meatRan;
private double price;

public Sandwich2()
{
    breadRan = chooseBread();
    cheeseRan = chooseCheese();
    meatRan = chooseMeat();
    price =2.50;
    calcPrice();
}


public int compareTo(Sandwich2 obj)
{
    if (this.getPrice() == obj.getPrice())
    {
   	 return 0;
    }
    else if(this.getPrice() < obj.getPrice())
    {
   	 return -1;
    }
    else
    return 1;
}

public String chooseBread()
{
    String [] bread = {"Black Bread","Wheat Bread","Whole Grain","Rye","Flat Bread"};
    int x = (int)(Math.random()*bread.length);
    return bread[x];
}
public String chooseMeat()
{String [] meat = {"Ham","Roast Beef","Raw Slab of Cow","Turkey","Tuna Salad"};

    int y = (int)(Math.random()*meat.length);
    return meat[y];
}
public String chooseCheese()
{
    String [] cheese = {"Swiss Cheese","American Cheese","Colby Cheese","Moldy Cheese","Provolone Cheese"};
    int z = (int)(Math.random()*cheese.length);
    return cheese[z];
}
public void calcPrice()
{
    if(breadRan.equals("Flat Bread")){
   	 price += 0.75;
    }
	if(meatRan.equals("Roast Beef")){
   	 price += 1.00;
    }
}

	public String getBread()
	{
    	return breadRan;
	}
	public String getMeat()
	{
    	return meatRan;
	}
	public String getCheese()
	{
    	return cheeseRan;
	}
	public double getPrice()
	{
    	return price;
	}

	public String toString()
	{
    	return this.getBread()+", "+ this.getMeat()+", "+ this.getCheese()+", "+ this.getPrice();
	}
}