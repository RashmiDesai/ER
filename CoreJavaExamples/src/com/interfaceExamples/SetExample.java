package com.interfaceExamples;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample
{
	public static void main(String[] args) 
	{
		//TreeSet operation 
		Set<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(20);
		treeSet.add(30);
		treeSet.add(40);
		treeSet.add(5);
		
		
		
		System.out.println("TreeSet is :"+treeSet);
		treeSet.remove(10);
		
		System.out.println("TreeSet after element removal is :"+treeSet);
		
		//HashSet operation example
		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(60);
		hashSet.add(70);
		hashSet.add(80);
		hashSet.add(85);
		hashSet.add(90);
		hashSet.add(85);
				
		System.out.println("HashSet is :"+hashSet);
		hashSet.remove(80);
		
		System.out.println("HashSet after element removal is :"+hashSet);		
	}
}
