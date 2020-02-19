package com.Annotation;
import java.lang.reflect.*;
class StringOpr {
	public static String getCapital(String name,String name1) {
		return name.toUpperCase()+" "+name1.toUpperCase();
	}
	
}
class Middleware  {
	public static Object invokeMethod(String className, String methodName, Class paramTypes[], Object paramValues[]) throws Exception {
		Class c=Class.forName(className);
		Method method = c.getMethod(methodName,paramTypes);
		return method.invoke(c.newInstance(),paramValues);
		
	}
}
class MiddlewareTest {
	public static void main(String args[]) throws Exception {
		Class paramTypes[] = new Class[2];
		paramTypes[0] = java.lang.String.class;
		paramTypes[1] = java.lang.String.class;
		Object paramValues[] = new Object[2];
		paramValues[0] = "iter";
		paramValues[1] = "mc";
		System.out.println(Middleware.invokeMethod("StringOpr", "getCapital", paramTypes, paramValues));
	}
}