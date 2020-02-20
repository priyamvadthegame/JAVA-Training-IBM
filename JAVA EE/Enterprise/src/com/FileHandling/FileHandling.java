package com.FileHandling;
import java.io.*;
public class FileHandling {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\IBM training\\JAVA EE\\Enterprise\\src\\com\\FileHandling\\abc.txt");
		File file1= new File("D:\\IBM training\\JAVA EE\\Enterprise\\src\\com\\FileHandling\\def.txt"); 
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fis1= new FileOutputStream(file1);
		StringBuilder sb = new StringBuilder(""); 
		int i = 0;
		do 
		{
			i = fis.read(); 
			if(i != -1) 
				sb.append((char)i); 
			} while(i != -1); 
		fis1.write(String.valueOf(sb).getBytes());
		System.out.println("File written succesfully");
		fis1.flush();
		fis.close();
		fis1.close();

	}

}
