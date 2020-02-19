
class TestEnum
{   
	String s="Test Enum Class";
	@Override
	public String toString()
	{
		return s;
	}
	public void print()
	{
		System.out.println("print method is printed");
	}
	@Deprecated
	public void print1()
	{
		System.out.println("print1 method is printed");
	}
	
	
	public static void main(String args[])
	{	
		TestEnum t=new TestEnum();
		t.print1();
		t.print();
	}
}
		
		