package com.MultiThreading;

public class MyPingPongMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPingPong p=new MyPingPong("ping");
		MyPingPong p1=new MyPingPong("pong");
	}

}
class MyPingPong extends Thread
{
	
	public MyPingPong(String name) {
		;
		this.setName(name);
		this.start();
		// TODO Auto-generated constructor stub
	}
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		MyPingPong temp=(MyPingPong) MyPingPong.currentThread();
		if(temp.getName().equals("ping"))
		{
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
		
		else if(temp.getName().equals("pong"))
		{	
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
		
		
	}
	
}
