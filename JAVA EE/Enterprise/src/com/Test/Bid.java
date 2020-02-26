package com.Test;
import java.util.*;
public class Bid {
public static void method(int n,ArrayList a1,ArrayList a2)
{	
	ArrayList<Integer> al=new ArrayList<Integer>();
	boolean check=false;
	int ans=0;
	for(int i=0;i<n;i++)
	{	check=false;
		al.clear();
		for(int j=0;j<a1.size();j++)
		{	int value=((Integer)a1.get(j)).intValue();
			if(value==i)
			{	check=true;
				al.add((Integer)(a2.get(j)));
			}
		}
		if(check)
		{
			ans+=Collections.min(al);
		}
		else
		{
			ans+=-1;
		}
	}
	System.out.println(ans);
	
}
}
