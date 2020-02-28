package com.lambdaExpression;

class LambdaAssignment1 {
	public static void main(String args[])
	{
		Perform<Integer> pInteger=(Integer a,Integer b)->(a+b);
		System.out.println(pInteger.perform(10, 15));
		Perform<Double> pDouble=(Double a,Double b)->(a+b);
		System.out.println(pDouble.perform(10.0, 15.1));
		Perform<String> pString=(String a,String b)->(a+b);
		System.out.println(pString.perform("Hello","World"));
		Perform<Integer> pSubInteger=(Integer a,Integer b)->(a-b);
		System.out.println(pSubInteger.perform(15, 10));
		Perform<Integer> pMulInteger=(Integer a,Integer b)->(a*b);
		System.out.println(pMulInteger.perform(15, 10));
		Perform<Integer> pDivInteger=(Integer a,Integer b)->(a/b);
		System.out.println(pDivInteger.perform(15,3));
	}
}
