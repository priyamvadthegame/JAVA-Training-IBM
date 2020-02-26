package com.Collections;

import java.util.Iterator;
import java.util.TreeSet;

class PersonUsingCollection implements Comparable<PersonUsingCollection>
{	String name;
	int height,weight;
	public PersonUsingCollection(String name,int height,int weight) {
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	@Override
	public int compareTo(PersonUsingCollection o) {
		if(this.weight>o.weight)
		{
			return 1;
		}
		else if(this.weight<o.weight)
		{
			return -1;
		}
		else
		{
			if(this.height>o.height)
			{
				return 1;
			}
			else if(this.height<o.height)
			{
				return -1;
			}
			else
			{
				return 0;
			}
		}
	}
	@Override
	public String toString() {
		return "PersonUsingCollection [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
public class PersonUsingCollectionSort {
	public static void main(String args[])
	{
		TreeSet<PersonUsingCollection> treeset=new TreeSet<PersonUsingCollection>();
		treeset.add(new PersonUsingCollection("Priyamvad",5,50));
		treeset.add(new PersonUsingCollection("Hemant",6,50));
		treeset.add(new PersonUsingCollection("Abhishek",5,51));
		treeset.add(new PersonUsingCollection("Abhishek Anand",7,60));
		Iterator<PersonUsingCollection> it=treeset.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}

}
