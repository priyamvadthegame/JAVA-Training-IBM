package com.lambdaExpression;
import java.util.function.*;
public class LambdaAssignment3 {
	public static void main(String args[])
	{	OrderLambda testOrder=new OrderLambda("cake","Accepted",100);
		Predicate<String> predicateTest=(String s)->s.isBlank();
		System.out.println(predicateTest.test("mota "));
		Consumer<OrderLambda> consumerTest=(OrderLambda o)->System.out.println(o);
		consumerTest.accept(testOrder);
		Supplier<OrderLambda> supplierTest=()->testOrder;
		System.out.println(supplierTest.get());
		Function<OrderLambda,Boolean> functionTest=(OrderLambda o)->o.getStatus().equals("Accepted");
		System.out.println(functionTest.apply(testOrder));
	}
	
}
