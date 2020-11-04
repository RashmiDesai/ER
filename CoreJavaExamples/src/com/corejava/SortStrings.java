package com.corejava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStrings {

	public static void main(String[] args)
	{
		List<String> strList = new ArrayList<String>();
		
		strList.add("Rashmi");
		strList.add("Anuja");
		strList.add("Neeta");
		strList.add("Adhira");
		strList.add("Sujata");
		strList.add("Satish");
		strList.add("Amar");
		
		System.out.println("List is: ");
		for(String str : strList)
		{
			System.out.println(str);
		}
		
		Collections.sort(strList,Collections.reverseOrder());
		
		System.out.println("List after sorting is :"+strList);
	}

}
