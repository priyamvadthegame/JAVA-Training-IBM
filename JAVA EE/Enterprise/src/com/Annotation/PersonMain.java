package com.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person>{
	String name;
	double height_in_inches;
	double weight;
	
	public Person(String name,double height_in_inches,double weight){
		this.name=name;
		this.height_in_inches=height_in_inches;
		this.weight=weight;
	}
	
	public int compareTo(Person p){
		return this.name.compareTo(((Person)p).name);
	}
	
	public String toString(){
		return this.name+" :Height-"+this.height_in_inches+", Weight- "+this.weight;
	}
	
}

class PersonHeightComparator implements Comparator<Person>{
		public int compare(Person p1, Person p2){
			if(p1.height_in_inches>p2.height_in_inches){
				return 1;
			}
			else if(p1.height_in_inches<p2.height_in_inches){
				return -1;
			}
			return 0;
		}
}
class PersonWeightComparator implements Comparator<Person>{
		public int compare(Person p1, Person p2){
			if(p1.weight>p2.weight){
				return 1;
			}
			else if(p1.weight<p2.weight){
				return -1;
			}
			return 0;
		}
}

public class PersonMain{
	public static void main(String [] args){
		Person p1=new Person("Hemant",5.6,60.0);
		Person p2=new Person("Priyamvad",5.7,110.0);
		Person p3=new Person("Abhishek",5.11,65);
		
		List<Person> list= new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		Collections.sort(list);
		Collections.sort(list,new PersonWeightComparator());
		Collections.sort(list,new PersonHeightComparator());
		
		for (Person person:list)
			System.out.println(person);
	}
}