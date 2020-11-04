package com.testPackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args)
	{
		Map<Integer,String> map = new TreeMap<Integer,String>();
		map.put(1, "Rashmi");
		map.put(4,"Anuja");
		map.put(2,"Adhira");
		map.put(3,"Amar");
		//map.put(null, null);
	
		System.out.println("Map values are : ");
		
//		for(Map.Entry<Integer, String> mapEntries : map.entrySet())
//		{
//			System.out.println(mapEntries.getKey()+"-->"+mapEntries.getValue());
//			
//		}
		
		System.out.println(map.entrySet());
		System.out.println(map.keySet());
		System.out.println(map.values());
		
	for(int i=0;i<map.size();i++)
	{
		if(!map.containsKey(6))
		{	
			map.put(6, "Satish");
		}}
	 System.out.println("Map after adding new key is :"+map.entrySet());
	
	for(int i=0;i<map.size();i++)
	{
		if(!map.containsValue("Sujata"))
		{	
			map.put(5, "Sujata");
		}
		}
	 System.out.println("Map after adding new value is :"+map.entrySet());
	

}}

