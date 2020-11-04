package com.corejava;

public class StrDemo {

	public static void main(String[] args) 
	{
		String str = "Good morning everyone";
	
		System.out.println("String length is :"+str.length());
		String[] str1 = str.split(" ");
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(i+":"+"->"+str1[i]);
			
			for(int j=0;j<str1.length;j++)
			{
				System.out.println("The elements of "+i+"th index is : "+str1[i]);
				char ch[]=str1[j].toCharArray(); 
				for(int k=0;k<ch.length;k++)
				{
					System.out.println("character array is : "+ch[k]);
				}
				
			}
		}
	}

}
