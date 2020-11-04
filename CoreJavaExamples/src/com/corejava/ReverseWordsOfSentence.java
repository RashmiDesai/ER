package com.corejava;

public class ReverseWordsOfSentence {

	public static void main(String[] args)
	{
		String str = "Hi Good Morning";
		String resStr ="";
				
		System.out.println("String to be reveresed is :"+str.length());
		
		//Create string array
		String[] strArray = str.split(" ");
		
		for(int i=0;i<strArray.length;i++)
		{
			System.out.println(strArray[i]);
		}
		for(int i=0;i<strArray.length;i++)
		{		
			String strAt = strArray[i];
			System.out.println("strAt :"+strAt);
			System.out.println("strAt.length :"+strAt.length());
			
			for(int j=strAt.length()-1;j>=0;j--)
			{
				resStr = resStr+strAt.charAt(j);
			}
			
			resStr = resStr+" ";
		}

		System.out.println("Reversed string is : "+resStr.trim());
	}

}
