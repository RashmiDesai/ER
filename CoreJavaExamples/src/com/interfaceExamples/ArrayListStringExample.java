package com.interfaceExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListStringExample
{
	public static void main(String[] args)
	{
		List<String> strList = new ArrayList<String>();
		strList.add("Rashmi");
		strList.add("Anuja");
		strList.add("Adhira");
		strList.add("Sujata");
		strList.add("Satish");
		strList.add("Amar");
		
		
	System.out.println("String list is:"+strList); 
	
	Collections.sort(strList);
	System.out.println("String list after sorting is :"+strList); 
	
	Collections.sort(strList,Collections.reverseOrder());
	System.out.println("String list after sorting is :"+strList); 

	Collections.reverse(strList);
	System.out.println("String list after reverse is :"+strList); 
	}
}