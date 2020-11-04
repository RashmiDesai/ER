package com.corejava;

public class LargestElementOfArray {

	public static void main(String[] args)
	{
		int arr[]= new int[]{10,20,40,5,130,70,};
		int pos=0;
		int largest;
		
		System.out.println("The elements of array are :");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		largest = arr[0];
		for(int i=1;i<arr.length;i++)
		{			
			if(arr[i] > largest)
			{
				largest = arr[i];
				pos = i;
			}
		}
			System.out.println("The largest element in the array is : "+largest+" at position of "+(pos+1)+"in array");
		
}

}
