package com.interfaceExamples;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) 
	{
		Map<Integer,String> map =new LinkedHashMap<Integer,String>();
		
		map.put(1, "Rashmi");
		map.put(3, "Anu");
		map.put(5, "ppp");
		map.put(4, "Larry");
		map.put(9, "lll");
		map.put(2, "Naina");
		map.put(null, null);
		
		
		//System.out.println(map.get(10));
		System.out.println("The map values are: ");
		for(Map.Entry<Integer, String> mapEntry : map.entrySet())
		{
			System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
		}
		
	}

}
