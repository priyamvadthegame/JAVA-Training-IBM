import java.lang.reflect.*;
class CheckConstructor
{
    int i;
	public CheckConstructor()
	{
		i=0;
	}
	public CheckConstructor(int i)
	{
		this.i=i;
	}
	public int getValue()
	{
		return i;
	}
}
class ConstructorCheck
{
	public static void main(String args[])throws Exception
	{
		String className=args[0];
		int flag=0;
		Class c=Class.forName(className);
		Constructor con[]=c.getDeclaredConstructors();
		Object[] typeParameters=null;
		Constructor t1=null;
		for(Constructor t :con )
		{
				typeParameters= t.getParameterTypes();
				if(typeParameters.length!=0)
				{   t1=t;
					flag=1;
					break;
				}
		}
		if(flag==1)
		{
			System.out.println(t1.newInstance(typeParameters));
		}
			
	}
}
		
		
		