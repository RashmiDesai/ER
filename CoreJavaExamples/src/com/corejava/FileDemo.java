package com.corejava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {

	public static void main(String[] args) throws IOException
	{
		File f = new File("C:\\Users\\SAMSUNG\\Desktop\\TestFile.txt");
		@SuppressWarnings("resource")
			
		Scanner scan = new Scanner(f);
		String strFromFile = "";
		
		while(scan.hasNextLine())
		{	
			strFromFile = strFromFile.concat(scan.nextLine()+ "\n");
			//System.out.println(scan.nextLine());		
		}
	
		
		FileWriter writer = new FileWriter("C:\\Users\\SAMSUNG\\Desktop\\IOTestFile.txt");
		writer.write(strFromFile);
		//scan.close();
		writer.close();
	}

}
