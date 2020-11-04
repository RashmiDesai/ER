package com.corejava;

public class UniqueString {

	public static void main(String[] args) 
	{
		String str = "Rashmi";
		Boolean flag = false;
	
		
		System.out.println("String is :"+str);
		System.out.println("String length is :"+str.length());
		
		for(int i = 0;i<str.length();i++)
		{
			System.out.println("String character is :"+str.charAt(i));
		}
		
		
		for(int i = 0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					flag=true;
					break;
				}
			}
		}
		if(flag==false)
			System.out.println("String is unique");
		else
			System.out.println("String is not unique");

	}

}
