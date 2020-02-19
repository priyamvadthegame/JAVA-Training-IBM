class TestEnum
{   Sring s="Test Enum Class";
	@deprecated
	public void print()
	{
		System.out.println("print method is printed");
	}
	@override
	public String toString()
	{
		return s;
	}
	public static void main(String args[])
	{
		TestEnum t=new TestEnum();
		t.print();
	}
}
		
		