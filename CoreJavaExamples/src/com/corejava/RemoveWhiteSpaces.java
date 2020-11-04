package com.corejava;

public class RemoveWhiteSpaces {

	public static void main(String[] args) 
	{
		//Using trim method
		String str = "   This    sentence contains whitespces ";
		System.out.println("String before removing WS(trim()) is:"+str);
		System.out.println("Length before removing WS: "+str.length());
		String strTrim = str.trim();
		System.out.println("String after removing WS through trim() is  :"+strTrim);
		System.out.println("String length after removing whitespaces through trim() :"+strTrim.length());
	
		System.out.println("=====================================================================");
		
		//Using //s method
		String str1 = "   This    sentence contains whitespces ";
		System.out.println("String before removing WS (Re) is:"+str1);
		System.out.println("Length before removing WS: "+str1.length());

		String strRegExp = str1.replaceAll("\\s", "");
		System.out.println("String after removing WS through reg exp is  :"+strRegExp);
		
		System.out.println("String length after removing whitespaces through reg exp :"+strRegExp.length());
		
	}

}
