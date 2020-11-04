package com.corejava;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) 
	{
//		int a[]=new int[]{10,55,30,60,20};
//		
//		int largest=a[0];
//		int pos=0;
//		int secLargest = a[0];
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i] > largest)
//			{
//				largest = a[i];
//				pos = i;
//			}
//		}
//		
//		for(int j=0;j<a.length;j++)
//		{
//			if(j == pos) continue;
//			
//			if(a[j] > secLargest)
//				secLargest = a[j];
//		}
//
//		System.out.println("Largest element of array is :"+largest);
//		System.out.println("Second largest element of array is :"+secLargest);
		
		
		int a[]={10,4,20,90,11};
		int b[]={33,22,66,44,99,11,43,21,10};
		
		System.out.println("The second largest element is : "+SecondLargest.getSecondLargestNumber(a,a.length));
		System.out.println("The second largest element is : "+SecondLargest.getSecondLargestNumber(b,b.length));
	}
	
	public static int getSecondLargestNumber(int arr[],int size)
	{
		Arrays.sort(arr);
		return arr[size-3];
		
	}

}