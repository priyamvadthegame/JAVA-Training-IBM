package com.FileHandling;

import java.io.*;

class Account
{
	private String name;
	private int accNo;
	private double balance; 
	public Account(String name,int accNo,double balance) {
		this.name=name;
		this.accNo=accNo;
		this.balance=balance;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	public int getAccountNumber() {
		// TODO Auto-generated method stub
		return this.accNo;
	}
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.balance;
	}
		
	
}
public class FileAccount {

	public static void main(String[] args) throws IOException {
		Account a[]=new Account[3];
		a[0]=new Account("Priyam",1,0.0);
		a[1]=new Account("Hemant",2,5.0);
		a[2]=new Account("Anand",3,50000.0);
		File file = new File("D:\\IBM training\\JAVA EE\\Enterprise\\src\\com\\FileHandling\\abc.txt"); 
		FileOutputStream fos = new FileOutputStream(file);
		FileInputStream fis = new FileInputStream(file); 
		DataOutputStream dos = new DataOutputStream(fos);
		DataInputStream dis = new DataInputStream(fis);
		for(Account ac:a)
		{	
			dos.writeUTF(ac.getName());
			dos.writeInt(ac.getAccountNumber()); 
			dos.writeDouble(ac.getBalance());
			
			
		}
		StringBuilder sb=new StringBuilder();
		int readInteger=0;
		String readString="";
		double readBalance=0.0;
		while(dis.available()>0)
		{
			sb=sb.append(String.valueOf(dis.readUTF())+" ");
			sb=sb.append(String.valueOf(dis.readInt())+" ");
			sb=sb.append(String.valueOf(dis.readDouble())+" ");
			sb.append("\n");
		}
		System.out.println(sb);
		dos.flush(); 
		fos.flush(); 
		dos.close(); 
		fos.close();

	}

}
