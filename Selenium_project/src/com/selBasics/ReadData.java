package com.selBasics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) 
	{
		try 
		{
			int c;
			FileInputStream fin = new FileInputStream("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\MailContent.txt");
			while((c=fin.read())!=-1)
			{
				System.out.print((char)c);
			}
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
