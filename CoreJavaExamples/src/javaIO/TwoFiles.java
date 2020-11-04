package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TwoFiles {

	public static void main(String[] args)
	{
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try
		{
			int c;
			File oldFile = new File("C:\\Users\\Rashmi\\Desktop\\old_file.txt");
			File newFile = new File("C:\\Users\\Rashmi\\Desktop\\new_file.txt");
			
			fin = new FileInputStream(oldFile);
			fout = new FileOutputStream(newFile);
			
			while((c=fin.read())!=-1)
			{
				fout.write(c);
				System.out.print((char)c);
			}
		
		}
		catch(IOException e)
		{
			System.out.println("exception occured...");
		}
		finally
		{
			try
			{
				fin.close();
				fout.close();
			}
			catch(IOException e)
			{
				System.out.println("Exception in finally block..");
			}
		}

	}

}
