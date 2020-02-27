package com.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Generics2 {
	public void print(Collection<?> c)
	{
		Iterator<?> itr=c.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Generics2 g=new Generics2();
			ArrayList<String>ar=new ArrayList<String>();
			ar.add("a");
			ar.add("b");
			HashSet<Integer> h=new HashSet<Integer>();
			h.add(1);
			g.print(ar);
			g.print(h);
		
	}

}
