package com.Annotation;
class Employee implements Cloneable
{
  private Date d;
  public Employee(Date d)
  {
	this.d=d;
  }
  public Date getDob()
  {
	return this.d;
  }
   public void setDob(Date d){
		this.d=d;
   }
 
   public Object clone() 
   {  try
	   {
			Object ob=super.clone();
			Employee e=(Employee)ob;
		    e.setDob((Date)d.clone());
			return ob;
	   }
	   catch (CloneNotSupportedException e)
	   {
			e.printStackTrace();
			return null;
	   }
   }
   
   public String toString()
   {
	   return "dob="+this.d.toString();
   }
}

class EmployeeMain1 
{
	public static void main(String args[])
	{   Date d=new Date(15,10,1998);
		Employee e=new Employee(d);
		Employee e1=e;
		Employee e2=(Employee)e.clone();
		System.out.println(e.hashCode()+" "+e2.hashCode());
		System.out.println(e+" "+e2);
		System.out.println("Shallo: "+(e.getDob()==e2.getDob()));
	}
}
