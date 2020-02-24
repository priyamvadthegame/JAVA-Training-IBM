package com.MultiThreading;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowEvent;



import java.awt.event.WindowAdapter;

public class OvalGame extends Frame {

	public static int y1 = 400, y2 = 400, y3 = 400;
	public OvalGame() {
		super("Oval game");
		setBackground(Color.CYAN);
		setSize(500, 500);
		setVisible(true);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
		
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillOval(100, y1, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(200, y2, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(300, y3, 50, 50);
		
	}

	public static void main(String[] args) throws InterruptedException {
		Frame mf = new OvalGame();
		mf.setSize(500, 500);
		mf.setVisible(true);
		
		Thread ball1 =new Thread(new Runnable() {
			boolean flag=false;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				while(true)
				{   if(y1>=100&&flag==false)
					y1=y1-10;
				else
				{
					flag=true;
					y1=y1+10;
					if(y1==400)
					{
						flag=false;
					}
				}
				mf.repaint();
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				}
				
				
			}
			
		});
Thread ball2 =new Thread(new Runnable() {
			boolean flag=false;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true)
				{   if(y2>=100&&flag==false)
					y2=y2-10;
				else
				{
					flag=true;
					y2=y2+10;
					if(y2==400)
					{
						flag=false;
					}
				}
				mf.repaint();
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				}
				
			}
		});
Thread ball3 =new Thread(new Runnable() {
	
	boolean flag=false;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{   if(y3>=100&&flag==false)
			y3=y3-10;
		else
		{
			flag=true;
			y3=y3+10;
			if(y3==400)
			{
				flag=false;
			}
		}
		mf.repaint();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		
	}
});

ball1.start();
ball2.start();
ball3.start();

	}
}