package com.corejava;

public class RemoveDuplicatesWithOrderPreserved {

	public static void main(String[] args)
	{
		String str = "raashmir";
		
		System.out.println("The string before removing duplicates is :"+str);
		//char[] ch = str.toCharArray();
		String resultStr="";
		
		for(int i=0;i<str.length();i++)
		{
			String s = String.valueOf(str.charAt(i));
			System.out.println(s);
			
			if(!resultStr.contains(s))
			{
				resultStr=resultStr+String.valueOf(str.charAt(i));
			}
		}
		
		
	
		System.out.println("The string after  duplicates is :"+resultStr);
	}

}
