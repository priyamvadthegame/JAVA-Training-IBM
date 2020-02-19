package com.JavaBasics;
class StackArray
{
	private int arr[];
	
	public StackArray(int arr[])
	{
		this.arr=arr;
	}
	private int getTop()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				return i;
			}
		}
		return 0;
	}
	public boolean push(int x)
	{
		arr[getTop()]=x;
		return false;
	}
	public int pop()
	{
		return arr[getTop()];
	}
	
}
