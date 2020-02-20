package com.FileHandling;
import java.util.*;
import java.io.*;
public class AccountRandomAccessFileMain {

	public static void main(String[] args) throws IOException {
		Account a[]=new Account[3];
		HashSet<Integer>m=new HashSet<>();
		a[0]=new Account("Priyam",1,0.0);
		a[1]=new Account("Hemant",2,5.0);
		a[2]=new Account("Anand10",3,50000.0);
		File file = new File("D:\\IBM training\\JAVA EE\\Enterprise\\src\\com\\FileHandling\\jkl1.txt");
		RandomAccessFile rd=new RandomAccessFile(file,"rw");
		//createAndUpdateAccount(a, rd, file);
		System.out.println(readAccount(rd,file));
		rd.close();
		
	}
	public static void createAndUpdateAccount(Account a[],RandomAccessFile rd,File f) throws IOException
	{	rd.seek(f.length());
		for(Account ac:a)
		{	
			rd.writeUTF(ac.getName());
			rd.writeInt(ac.getAccountNumber()); 
			rd.writeDouble(ac.getBalance());
		}
		
	}
	public static StringBuilder readAccount(RandomAccessFile rd,File f) throws IOException
	{	
		StringBuilder sb=new StringBuilder();
		rd.seek(0);
		long c=f.length()-1;
		while(rd.getFilePointer()<c-2)
		{	
			
			sb=sb.append(String.valueOf(rd.readUTF())+" ");
			sb=sb.append(String.valueOf(rd.readInt())+" ");
			sb=sb.append(String.valueOf(rd.readDouble())+" ");
		}
		return sb;
	}
}

