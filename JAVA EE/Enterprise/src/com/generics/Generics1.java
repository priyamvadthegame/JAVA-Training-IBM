package com.generics;


public class Generics1<T> {
	T t;	
	public Generics1(T t) {
			// TODO Auto-generated constructor stub
		this.t=t;
		}
	

	public T getT() {
		return this.t;
	}


	public void setT(T t) {
		this.t = t;
	}
	public void print()
	{
		System.out.println(this.getT());
	}

	public static void main(String[] args) {
		Generics1<String> g1=new Generics1<String>("Priyamvad");
		g1.print();
		Generics1<Number> g2=new Generics1<Number>(15);
		g2.print();
	}

}
