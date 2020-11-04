package com.interfaceExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample
{
	public static void main(String args[])
	{
		// ArrayList operation example
		//List<Integer> arrList = new ArrayList<Integer>();
		LinkedList<Integer> arrList = new LinkedList<Integer>();
		
		
		
		
		
		
		arrList.add(10);
		arrList.add(20);
		arrList.add(30);
		arrList.add(40);
		arrList.add(20);
		
		
		System.out.println("ArrayList is :"+arrList);
		System.out.println("lnkedList is :"+arrList.pop());
				
		Collections.sort(arrList);
		System.out.println("ArrayList after default sort is :"+arrList);
		
		Collections.sort(arrList,Collections.reverseOrder());
		System.out.println("ArrayList after reverseOrder sort is :"+arrList);
		
//		arrList.remove(0);
//		arrList.remove(1);
		//arrList.remove(40);
		
//		System.out.println("ArrayList after element removal is :"+arrList);
//		
//		//LinkedList operation example
//		List<Integer> lnkList = new LinkedList<Integer>();
//		
//		lnkList.add(50);
//		lnkList.add(60);
//		lnkList.add(70);
//		lnkList.add(80);
//		
//		System.out.println("LinkedList is :"+lnkList);
//		
//		lnkList.remove(0);
//		System.out.println("LinkedList after element removal is :"+lnkList);
		
	
		
		
		
	}
}
