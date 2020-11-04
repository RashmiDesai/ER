package com.corejava;

public class SumOfArrayElements 
{
	public static void main(String[] args)
	{
		ArrayOperations arrOp = new ArrayOperations();
		SumOfArrayElements sumOfArrayElementsObj = new SumOfArrayElements();
		int arrSize;
		
		arrSize = arrOp.arraySize();
		
		int arr1[] = new int[arrSize];
		arr1=arrOp.insertElements(arrSize);
		
		arrOp.printElements(arr1);
		sumOfArrayElementsObj.findArraySum(arr1);
	}
  
	//Find the sum of array elements
	public void findArraySum(int[] arr1)
	{ 
		int sum=0;
		for (int i = 0; i < arr1.length; i++) 
		{
			sum=sum+arr1[i];
		}
		
		//Print sum of elements
		System.out.println("Sum of array elements is :"+sum);
	}
	
}