abstract class Abstract
{
	abstract void draw();
	public void draw1()
	{
		System.out.println("This is a non abstract method in abstract class");
	}
	
	
}
class hemant extends Abstract
{
	void draw()
	{
		System.out.println("Implemented draw in hemant");
	}
}