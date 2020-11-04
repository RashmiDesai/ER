package com.corejava;

import java.util.Scanner;

public class BubbleSort 
{

	public static void main(String[] args) 
	{
		try
		{
			BubbleSort bubbleSort = new BubbleSort();
			
			//Sort the array using bubble sort technique
			bubbleSort.sort();
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in BubbleSort class main() ");
		}	
	}
	
	public void sort()
	{
		try
		{
		
			Scanner in = new Scanner(System.in);
			ArrayOperations arrOp = new ArrayOperations();
			
			//Enter the size of array
			int size = arrOp.arraySize();
			int[] arr1 = new int[size];
			
			//Insert the unsorted elements of array 
			arr1=arrOp.insertElements(size);
			
			//Print the elements of array
			arrOp.printElements(arr1);
		
			//Sort elements of array
			int[] sortedArr=sortElements(arr1);
			
			//Print the elements of array
			 arrOp.printElements(sortedArr);	
		}
		catch(Exception e)
		{
			System.out.println("Exception in sort() ");
		}
	}

	//Sort the elements of array
	private int[] sortElements(int[] arr)
	{
		try
		{
			int temp;
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]>arr[j])
					{
						temp=arr[i];
						arr[i]=arr[j];
						arr[j] = temp;
					}
				}
			}	
		}		
		catch(Exception e)
		{
			System.out.println("Exception in sortElements() ");
		}
		return arr;
	}
}
