package com.Collections;

import java.util.HashMap;
import java.util.Iterator;

public class EmployeeCollectionTest {
	public static void main(String args[])
	{
		HashMap<EmployeeCollection,String> hmap=new HashMap<EmployeeCollection, String>();
		EmployeeCollection e1=new EmployeeCollection("Priyamvad");
		EmployeeCollection e2=new EmployeeCollection("Priyamvad1");
		EmployeeCollection e3=new EmployeeCollection("Priyamvad2");
		EmployeeCollection e4=new EmployeeCollection("Priyamvad3");
		hmap.put(e1, e1.getName());
		hmap.put(e2, e2.getName());
		hmap.put(e3, e3.getName());
		hmap.put(e4, e4.getName());
		Iterator<EmployeeCollection> itr=hmap.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(hmap.get(itr.next()));
		}
	}

}
class EmployeeCollection
{	String name;
	public EmployeeCollection(String name) {
		this.name=name;
	}
	public String getName()
	{
		return this.name;
	}
	@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 25;
		}
	@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return true;
		}
}
