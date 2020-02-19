package com.JavaBasics;
class ComplexNumberTest
{
	public static void main(String args[])
	{    Complex c[]=new Complex[2];
		c[0]=new Complex(2,3);
		c[1]=new Complex(4,5);
		Complex add=c[0].add(c[1]);
		Complex substract=c[0].substract(c[1]);
		Complex multiply=c[0].multiply(c[1]);
		System.out.println("Addition = "+add);
		System.out.println("Substraction = "+substract);
		System.out.println("Multiply = "+multiply);
		c[0].swap(c);
		System.out.print(c[0]+" "+c[1]);
	}
}

		