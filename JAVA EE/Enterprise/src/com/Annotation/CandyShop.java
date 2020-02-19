import java.util.*;
abstract class DessertItem
{
  abstract double getcost();
}
class Candy extends DessertItem
{   private int id; 
	private String name;
	private int priceWithoutTax;
	private int taxPercentage;
	public Candy(int id,String name,int priceWithoutTax,int taxPercentage)
	{   this.id=id;
		this.name=name;
		this.priceWithoutTax=priceWithoutTax;
		this.taxPercentage=taxPercentage;
	}
	public double getCost()
	{
		return (priceWithoutTax+((taxPercentage/100.0)*priceWithoutTax))*60;
	}
}
class Cookies extends DessertItem
{
	private int id; 
	private String name;
	private int priceWithoutTax;
	private int taxPercentage;
	public Candy(int id,String name,int priceWithoutTax,int taxPercentage)
	{   this.id=id;
		this.name=name;
		this.priceWithoutTax=priceWithoutTax;
		this.taxPercentage=taxPercentage;
	}
	public double getCost()
	{
		return (priceWithoutTax+((taxPercentage/100.0)*priceWithoutTax))*70;
	}
}
class Icecream extends DessertItem
{
	private int id; 
	private String name;
	private int priceWithoutTax;
	private int taxPercentage;
	private int getItemCount;
	public Candy(int id,String name,int priceWithoutTax,int taxPercentage,int getItemCount)
	{   this.id=id;
		this.name=name;
		this.priceWithoutTax=priceWithoutTax;
		this.taxPercentage=taxPercentage;
		this.getItemCount=getItemCount;
	}
	public double getCost()
	{
		return priceWithoutTax+((taxPercentage/100.0)*priceWithoutTax);
	}
	public void setItemCount(int count);
	{
		this.getItemCount=count;
	}
	public int getItemCount()
	{
		return this.it
}
class CandyShop
{
	public static void main(String args[])
	{   DessertItem d[]=new DessertItem[100];
		System.out.println("Choose :");
		System.out.println("1: Customer");
		System.out.println("2: Shpkeeper");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("What do you want to buy");
			System.out.println("1. Candy");
			System.out.println("2. Cookies :");
			System.out.println("3. IceCream :");
			int customerChoice=sc.nextInt();
			if(customerChoice==1)
			{
					for(int i=0;i<d.length;i++)
					{
						if(d[i] instanceOf Candy)
						{
							for(int j=i;j<;j++)
							{
								
				
				
		


