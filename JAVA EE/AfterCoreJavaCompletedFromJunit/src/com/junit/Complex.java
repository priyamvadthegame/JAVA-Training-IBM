package com.junit;
public class Complex
{
	private int imaginary;
	private int real;
	
	public Complex(int real ,int imaginary)
	{
		this.imaginary=imaginary;
		this.real=real;
	}
	public int getImaginary()
	{
		return this.imaginary;
	}
	public int getReal()
	{
		return this.real;
	}
	
	public Complex add(Complex c)
	{
		int imaginary=this.imaginary+c.getImaginary();
		int real=this.real+c.getReal();
		return new Complex(real,imaginary);
	}
	public Complex substract(Complex c)
	{
		int imaginary=this.imaginary-c.getImaginary();
		int real=this.real-c.getReal();
		return new Complex(real,imaginary);
	}
	public Complex multiply(Complex c)
	{
		int imaginary=this.imaginary*c.getImaginary();
		int real=this.real*c.getReal();
		return new Complex(real,imaginary);
	}
	public void swap(Complex c[])
	{
		Complex temp;
		temp=c[0];
		c[0]=c[1];
		c[1]=temp;
	}
	public String toString()
	{
		return this.getReal()+"+ "+this.getImaginary()+"i";
	}
	@Override
	public boolean equals(Object obj) {
		
		Complex c=(Complex)obj;
		if(this.getImaginary()==c.getImaginary()&&this.getReal()==c.getReal())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
	