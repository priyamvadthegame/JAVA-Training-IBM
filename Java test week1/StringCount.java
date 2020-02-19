class StringCount
{
	public static void main(String args[])
	{
		String s="",s1="";
		int c=0;
		for(int i=0;i<args.length;i++)
		{
			s=s+args[i];
		}
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			c=0;
			if(!s1.contains(String.valueOf(Character.toLowerCase(ch))))
			{
				for(int j=0;j<s.length();j++)
				{
					if(String.valueOf(ch).equalsIgnoreCase(String.valueOf(s.charAt(j))))
					{
						c++;
					}
				}
				System.out.println(Character.toLowerCase(ch)+"->"+c);
				s1+=Character.toLowerCase(ch);
			}
		}
	}
}
						
					
					