package com.corejava;

import java.util.Scanner;

public class ArrayOperations 
{
	Scanner in = new Scanner(System.in);
	
	//Read the size of array
	public int arraySize()
	{
		int n; 
		System.out.println("Enter the size of array");
		n=in.nextInt(); 
		return n;
	}
	
	//Insert elements of array
	public int[] insertElements(int n )
	{
		int[] arr = new int[n];
		System.out.println("Enter the elements of array : ");    
		for(int i=0;i<n;i++)
		arr[i]=in.nextInt();
	    return arr;
	}
	
	//Print elements of array
	public void printElements(int arr[])
	{
		System.out.println("Elements of array are : ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
		}
	}
}
