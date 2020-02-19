package com.Annotation;
class Singleton 
{ 
    
    private static Singleton single_instance = null; 
	private Singleton() 
    { 
        
    } 
	public static Singleton getInstance() 
    { 
        if (single_instance == null) 
            single_instance = new Singleton(); 
  
        return single_instance; 
    } 
} 
  

class SingletonMain 
{ 
    public static void main(String args[]) 
    { 
        
        Singleton x = Singleton.getInstance(); 
		Singleton y = Singleton.getInstance(); 
		Singleton z = Singleton.getInstance(); 
		System.out.println("Singleton from x is " + x); 
        System.out.println("Singleton from y is " + y); 
        System.out.println("Singleton from z is " + z); 
        System.out.println("\n");
  
    } 
} 