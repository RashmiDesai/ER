package com.corejava;

public class RevString {

	public static void main(String[] args) 
	{
		String str = "Rashmi";
		String revStr = "";
		
		System.out.println("The origional string is : "+str);
		
		System.out  .println(str.length());
		for(int i=str.length()-1;i>=0;i--)
		{
			revStr = revStr+str.charAt(i);
		}
		System.out.println("Reversed string is :"+revStr);
	}

}
