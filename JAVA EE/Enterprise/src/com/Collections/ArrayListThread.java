package com.Collections;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class ArrayListThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Integer>arr=new CopyOnWriteArrayList<Integer>();
		ConcurrentHashMap<Integer, Integer> hmap=new ConcurrentHashMap<Integer, Integer>();		
		Runnable r=new Runnable() {
			int k=0,k1=3;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true)
				{
					hmap.put(k++,k1++);
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
	
	Runnable r1=new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			while(true)
			{
			for(Integer Int :hmap.keySet())
			{
				System.out.println(hmap.get(Int)+"\t"+Int);
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			}
	}};
	
	Thread t=new Thread(r);
	Thread t1=new Thread(r1);
	t.start();
	t1.start();

	
	}
}
	

