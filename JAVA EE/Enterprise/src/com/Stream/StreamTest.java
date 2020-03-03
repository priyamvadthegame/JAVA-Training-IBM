package com.Stream;
import java.util.*;
import java.util.function.Predicate;
public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("priyamvad");
		ar.add("hemant");
		ar.add("raj");
		ar.add("singh");
		ar.add("abhishek");
		ar.add("anand");
		Predicate<String> p=(String s)->s.length()>4;
		//Comparator<String> c=(String s1,String s2)->s1.compareTo(s2)
		ar.stream().filter(p).sorted(Comparator.comparing(String::length)).forEach(System.out::println);	
	}

}
