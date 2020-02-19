package com.JavaBasics;
import java.util.*;
class OuterCache
{   public static HashMap<Integer,InnerCache> h=new HashMap<>();
	class InnerCache
	{   
		private String timeStamp;
		private String value;
		InnerCache(String value,String timeStamp)
		{
			this.value=value;
			this.timeStamp=timeStamp;
		}
		public String toString()
		{
			return "Value is: "+this.value+"\nTime is: "+this.timeStamp; 	
		}
	}
	
	public void putData(InnerCache data)
	{
		h.put(h.size(),data);
	}
	public InnerCache getData(int key)
	{
		return h.get(key);
	}

}
class CacheMain
{
	public static void main(String args[])
	{	OuterCache outerObject=new OuterCache();
		OuterCache.InnerCache innerObject=outerObject.new InnerCache("Personal","15-10-2020 15:30");
		outerObject.putData(innerObject);
		System.out.println(outerObject.getData(0));
	}
}