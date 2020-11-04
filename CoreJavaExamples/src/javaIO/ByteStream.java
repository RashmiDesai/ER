package javaIO;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {

	public static void main(String[] args) 
	{
	try{
		 String str = "read/ write byte stream.. hahahaha";
		 int c=0;
		 
		//Create a file
		File file = new File("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\TestByteStr.txt");
		
		FileOutputStream fout = new FileOutputStream(file);
		
		//fout.write(str);
		for(int i=0;i<str.length();i++)
		{
			fout.write(str.charAt(i));
			System.out.print(str.charAt(i));	
		}
		fout.close();
	}
	catch(IOException e)
	{
		System.out.println("IOException occured");
	}
}
}