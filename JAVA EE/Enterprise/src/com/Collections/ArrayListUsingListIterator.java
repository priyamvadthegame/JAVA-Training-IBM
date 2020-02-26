package com.Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListUsingListIterator {
 public static void main(String args[])
 {
	 ArrayList<Integer> al=new ArrayList<Integer>();
	 al.add(1);
	 al.add(2);
	 al.add(3);
	 al.add(4);
	 ListIterator<Integer> liter=al.listIterator(al.size());
	 
	 while(liter.hasPrevious())
	 {
		 System.out.println(liter.previous());
	 }
 }
}
