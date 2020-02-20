package com.JavaBasics;



public class MyThreadAnonymous {
	
	public MyThreadAnonymous(Runnable r) {
		// TODO Auto-generated constructor stub
		Thread t=new Thread(r);
		t.start();
	}
	public static void main(String args[])
	{
		Runnable r=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
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
				// TODO Auto-generated method stub
					
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
		new MyThreadAnonymous(r);
		new MyThreadAnonymous(r1);
		
	}

}
