class Date implements Cloneable
{
	private int day,month,year;
	public Date()
	{
		this.day=15;
		this.month=10;
		this.year=1998;
	}
	public Date(int day,int month,int year)
	{
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay()
	{
		return this.day;
	}
	public int getMonth()
	{
		return this.month;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setDay(int day)
	{
		this.day=day;
	}
	public void setMonth(int month)
	{
		this.month=month;
	}
	public int getYear()
	{
		return this.year;
	}
	public Object clone() 
   {  try
	   {
			return super.clone();
	   }
	   catch (CloneNotSupportedException e)
	   {
			e.printStackTrace();
			return null;
	   }
   }
   
	public void swapDate(Date d)
	{
		int tempDay,tempMon,tempYear;
		tempDay=d.getDay();
		d.setDay(this.day);
		this.day=tempDay;
		
		tempMon=d.getMonth();
		d.setMonth(this.month);
		this.month=tempMon;
		
		tempYear=d.getYear();
		d.setYear(this.year);
		this.year=tempYear;
	}
	public String toString()
	{
		return this.month+"/"+this.day+"/"+this.year;
	}
}


class DateMain
{
	public static void main(String args[])
	{
		Date d=new Date();
		Date d1=new Date(10,03,1998);
		
		System.out.println("Before swapping dates are " +d+" "+d1);
		d.swapDate(d1);
		System.out.println("After swapping dates are " +d+" "+d1);
	}
}

		
	
		
		