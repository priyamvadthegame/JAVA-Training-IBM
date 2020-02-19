interface Printable
{
	void print();
}

class Employee implements Printable
{
	public void print()
	{
		System.out.println("Employee is printed");
	}
}
class Circle implements Printable
{
	public void print()
	{
		System.out.println("Circle is printed");
	}
}
class PrintAll
{
	public static void printAll(Printable p[])
	{   
		for(int i=0;i<p.length;i++)
		{
			p[i].print();
		}
	}
	public static void main(String args[])
	{
		Printable p[]=new Printable[2];
		p[0]=new Employee();
		p[1]=new Circle();
		PrintAll.printAll(p);
	}
}
	