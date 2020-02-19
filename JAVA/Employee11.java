class Employee11 implements Cloneable
{
  private String dob;
  public Employee11(String dob)
  {
	this.dob=dob;
  }
  public String getDob()
  {
	return dob;
  }
 public static void main(String args[]) throws CloneNotSupportedException
	{
		Employee11 e=new Employee11("15-10-1998");
		Employee11 e1=e;
		Employee11 copy = (Employee11)e.clone();
		System.out.println(e1+" "+copy);
	}
}
