package com.lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Lambda8 {
	public Lambda8() {
		// TODO Auto-generated constructor stub
		for(int i=0;i<ar.size();i++)
		{
			c.accept(ar.get(i));
			
		}
	}
	static ArrayList<Integer> ar= new ArrayList<Integer>();
	static Consumer<Integer> c;
	public static void main(String[] args) {
		
		
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		c=(Integer i)->System.out.println(i);
				
		Thread t=new Thread(Lambda8::new);
		t.start();
	}
	

}