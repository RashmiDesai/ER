package com.interfaceExamples;
import java.util.Iterator;
import java.util.LinkedList;

public class ListInterfaceExample
{
	public static void main(String args[])
	{
		int sum = 0;
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		
		list1.add(10);
		list1.add(20);
		list1.add(5);
		list1.add(4);
		list1.add(20);
				
		System.out.println("List is :"+list1);
		Iterator<Integer> intIt = list1.iterator();
	   
	
		while(intIt.hasNext())
		{
			sum =sum+intIt.next();
			System.out.println("Sum of elements is:"+sum);
		}
		
		//Add element in first
		list1.addFirst(1);
		System.out.println("List after adding at first  :"+list1);
		
		//Add element in last
		list1.addLast(200);
		System.out.println("List after adding at last  :"+list1);
		
		//Add through index 
		list1.add(3, 40);
		System.out.println("List after adding at through index  :"+list1);
	
		//Remove element
		list1.remove();
		System.out.println("List after removing without index  :"+list1);
		
		//Remove element through index
		list1.remove(4);
		System.out.println("List after removing with index  :"+list1);
		 
		//Remove last occurrence 
		list1.removeLastOccurrence(20);
		System.out.println("List after removing last index  :"+list1);
		
		System.out.println("Element at index list1.get(3) :"+list1.get(3));
				
		//List after clearing is
		list1.clear();
		System.out.println("List after clear is :"+list1);	
	}
	
}
