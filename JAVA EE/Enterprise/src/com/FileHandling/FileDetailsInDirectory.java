package com.FileHandling;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDetailsInDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File folder = new File("D:\\IBM training\\Assignments");
		File[] listOfFiles = folder.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		for (File file : listOfFiles) {
		    if (file.isFile()) {
		        System.out.println("Name :"+file.getName()+"\nFile date:  "+sdf.format(file.lastModified())+"\nFile size: "+(file.length()/1024)+" KB"+" \nRead permission: "+file.canRead()+
		        		" \nWrite permission: "+file.canWrite()+" \nExecute permission:"+file.canExecute());
		        System.out.println();
		    }
		}
	}

}
