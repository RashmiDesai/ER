package com.corejava;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Read and write from file using FileReader and FileWriter ( i.e. character stream)
 */
public class CharacterStr {

	public static void main(String[] args)
	{
		try
		{
			String fileToBeWritten = "Rashmi Amar Desaiiii";
			
			//Create object of file class
			File file = new File("C:\\Users\\Rashmi\\Desktop\\Test1.txt");
			System.out.println("File path is :"+file.getAbsolutePath());
	
			//Create file writer class obj 
			FileWriter writer = new FileWriter(file);
			writer.write(fileToBeWritten);
			writer.close();
			
			//Reading from the file and printing on the console
			
			FileReader reader = new FileReader(file);
			int ch;
			
			while((ch = reader.read())!=-1)
			{
				System.out.print((char)ch);
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("Exception occured ");
		}
		
	}

}
