package com.corejava;

import java.util.Arrays;

public class RemoveDuplicate {

	public static void main(String[] args) 
	{
		int arr[] = {10,20,40,10,20,50,60};
		
		System.out.println("The content of the origional array before removing duplicate is: ");
		for(int i=0;i<arr.length;i++)
		{  }
		System.out.println();
		
		int len = arr.length;
		
	
		for(int i=0;i<len;i++)
		{	
			for(int j=i+1;j<len;j++)
			{
				if(arr[i] == arr[j])
				{
					arr[j]=arr[len-1];
					len--;
					j--;
				}	
			} 
		}
		
		int anotherArray[] = Arrays.copyOf(arr, len);
		
		System.out.println("The content of the origional array after removing duplicate is: ");
		for(int i=0;i<anotherArray.length;i++)
		{
			System.out.print(anotherArray[i]+" ");
		}
	}

}
