package com.Annotation;
public class ThreadSleep {

    public static void main(String[] args)throws InterruptedException
	{
        StringBuffer sb=new StringBuffer("Hemant weds sh");
        while(true)
		{
			System.out.print(sb+"\r");
			String s=sb.charAt(sb.length()-1)+(sb.substring(0,sb.length()-1));
			sb=sb.delete(0,sb.length());
			sb=sb.append(s);
			Thread.sleep(500);
		}
        
        
    }

}