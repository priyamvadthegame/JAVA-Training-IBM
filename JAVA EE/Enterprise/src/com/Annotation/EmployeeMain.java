class Employee
{
  private int id;
  private String name;
  private double salary;
  
  public Employee(int id,String name,double salary)
  {
	this.id=id;
	this.name=name;
	this.salary=salary;
  }
  public double getSalary()
  {
	return this.salary;
  }
}

class Manager extends Employee
{
	double incentive;
	public Manager(int id,String name,double salary,double incentive)
	{
		super(id,name,salary);
		this.incentive=incentive;
	}
	public double getSalary()
	{
		return super.getSalary()+this.incentive;
	}
}
class Labour extends Employee
{
	double overtime;
	public Labour(int id,String name,double salary,double overtime)
	{
		super(id,name,salary);
		this.overtime=overtime;
	}
	public double getSalary()
	{
		return super.getSalary()+this.overtime;
	}
}
class EmployeeMain
{	public static double calculateTotalSalary(Employee e[])
	{	double totalSalary=0;
		for(int i=0;i<e.length;i++)
		{
			totalSalary+=e[i].getSalary();
		}
		return totalSalary;
			
	}
	public static void main(String args[])
	{
		Employee e[]=new Employee[4];
		e[0]=new Manager(50,"Hemant",300000.0,30000.0);
		e[1]=new Manager(50,"Raj",30000.0,3000.0);
		e[2]=new Labour(50,"Priyamvad",3000.0,300.0);
		e[3]=new Labour(50,"Singh",300.0,30.0);
		System.out.println(calculateTotalSalary(e));
	}
}
		