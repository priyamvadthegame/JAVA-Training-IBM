package com.Annotation;
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
	}
	public boolean push(int x)
	{
		arr[getTop()]=x;
	}
	public int pop()
	{
		return arr[getTop()];
	}
}