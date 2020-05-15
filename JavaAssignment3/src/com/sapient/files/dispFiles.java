package com.sapient.files;

import java.io.File;

public class dispFiles {
	public static void main(String[] args) {
		
	
	String path="E:/";
	File file=new File(path);
	if(file.isDirectory())
	{
		File[] lists=file.listFiles();
		for(File f:lists)
			System.out.println(f.getName());
	}
	else {
		System.out.println("Not a directory");
	}
	}
}
