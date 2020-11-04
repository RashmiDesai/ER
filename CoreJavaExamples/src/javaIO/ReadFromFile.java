package javaIO;

import java.io.File;
import java.io.FileInputStream;

public class ReadFromFile {

	public static void main(String[] args) 
	{
		try
		{
			int c;
			File file =new File("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\ReadFromFile.txt");			
			FileInputStream fin = new FileInputStream(file);
			
			while((c=fin.read())!=-1)
			{
				System.out.print((char)c);
			}
		}
		catch(Exception e)
		{
			System.out.println("Exeption occured..");
		}
	}

}
