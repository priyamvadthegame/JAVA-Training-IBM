package com.JavaBasics;



public class MyThreadAnonymous {
	
	public MyThreadAnonymous(Runnable r,boolean deamon) {
		Thread t=new Thread(r);
		t.setDaemon(deamon);
		t.start();
		
	}
	public static void main(String args[])
	{
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				
					for(int i=0;i<20;i++)
					{
						System.out.println("ping");
						try
						{
							Thread.sleep(200);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
				
			
		};
Runnable r1=new Runnable() {
			
			@Override
			public void run() {
					
					for(int i=0;i<20;i++)
					{	
						System.out.println("\tpong");
						try
						{
							Thread.sleep(300);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			
		};
Runnable r2=new Runnable() {
			
			@Override
			public void run() {
					
					for(;;)
					{	
						System.out.println("\t\ttong");
						try
						{
							Thread.sleep(300);
						}
						catch(InterruptedException e)
						{
							e.printStackTrace();
						}
					}
				}
			
		};
		new MyThreadAnonymous(r,false);
		new MyThreadAnonymous(r1,false);
		new MyThreadAnonymous(r2,true);
		
	}

}
