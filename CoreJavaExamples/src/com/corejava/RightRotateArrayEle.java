package com.corejava;

public class RightRotateArrayEle {

	public static void main(String[] args)
	{
		int arr[]=new int[]{10,20,30,40,50};
		
		System.out.println("Elements of array are : "+"\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
		int last=arr[arr.length-1];
		
		for(int j=arr.length-1;j>0;j--)
		{
			arr[j]=arr[j-1];	
		}
		arr[0]=last;
		
		System.out.println("\n"+"Elements of array after right shift is : "+"\n");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

}
