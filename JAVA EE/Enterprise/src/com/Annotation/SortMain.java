package com.Annotation;
interface Sortable
{
	boolean comp(Sortable s);
}
class Employee implements Sortable
{
	public String name;
	Employee(String name)
	{
		this.name=name;
	}
	public boolean comp(Sortable s)
	{
		if((this.name.compareTo(((Employee)s).name))>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return this.name;
	}
}
class Circle implements Sortable
{
	public int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public boolean comp(Sortable s)
	{
		if(this.radius>(((Circle)s).radius))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		return this.radius+"";
	}
}
class SortMain
{
		public static void sortAll(Sortable arr[])
		{
			int n = arr.length; 
			for (int i = 0; i < n-1; i++) 
			{	for (int j = 0; j < n-i-1; j++)
				{					
					if (arr[j].comp(arr[j+1])) 
					{	 
						Sortable temp = arr[j]; 
						arr[j] = arr[j+1]; 
						arr[j+1] = temp; 
					}
				}   
			}
		}
		public static void main(String args[])
		{
			Sortable s[]=new Sortable[4];
			Sortable s1[]=new Sortable[4];
			s[0] =new Employee("priyam");
			s[1] =new Employee("priya");
			s[2] =new Employee("hemant");
			s[3]=new Employee("Abhishek");
			s1[0]=new Circle(11);
			s1[1]= new  Circle(10);
			s1[2]=new Circle(5);
			s1[3]=new Circle(1);
			SortMain.sortAll(s);
			SortMain.sortAll(s1);
			for (int i = 0; i < s.length; i++)
			{
					System.out.println(s[i]);
			}
			for (int i = 0; i < s.length; i++)
			{
					System.out.println(s1[i]);
			}
		}
}
			
			

