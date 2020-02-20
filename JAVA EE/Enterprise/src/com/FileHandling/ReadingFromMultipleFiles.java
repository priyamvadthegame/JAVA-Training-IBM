package com.FileHandling;
import java.io.*;
import java.util.*;
public class ReadingFromMultipleFiles {

	public static void main(String[] args) throws IOException {
		FileInputStream f[]=new FileInputStream[3];
		 f[0]=new FileInputStream("D:\\IBM training\\JAVA EE\\Enterprise\\src\\com\\FileHandling\\def.txt");
		 f[1]=new FileInputStream("D:\\IBM training\\JAVA EE\\Enterprise\\src\\com\\FileHandling\\abc.txt");
		 f[2]=new FileInputStream("D:\\IBM training\\JAVA EE\\Enterprise\\src\\com\\FileHandling\\ghi.txt");
		 ArrayList<FileInputStream> arr=new ArrayList<FileInputStream>();
		 Collections.addAll(arr,f);
		 InputStream sis =
		            new SequenceInputStream(Collections.enumeration(arr));
		            int ch;
		            while ((ch = sis.read()) != -1) { // read till end of file of both files
		                  System.out.print((char) ch);
		            }
		 
		            sis.close(); // closing SequenceInputStream
		                             
		 }

}
