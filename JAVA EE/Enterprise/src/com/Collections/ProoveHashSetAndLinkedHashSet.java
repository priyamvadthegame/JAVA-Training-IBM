package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class ProoveHashSetAndLinkedHashSet {

	public static void main(String[] args) {
		HashSet<String> hset=new HashSet<String>();
		hset.add("Hello");
		hset.add("World");
		hset.add("WorldWar");
		hset.add("Three");
		Iterator<String> it=hset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println();
		System.out.println("This is Linked Hash Set");
		System.out.println();
		LinkedHashSet<String> lhset=new LinkedHashSet<String>();
		lhset.add("Hello");
		lhset.add("World");
		lhset.add("WorldWar");
		lhset.add("Three");
		Iterator<String> lit=lhset.iterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}

	}

}
