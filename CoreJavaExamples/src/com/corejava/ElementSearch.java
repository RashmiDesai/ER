package com.corejava;

import java.util.Scanner;

public class ElementSearch 
{
	ArrayOperations arrOp = new ArrayOperations();
	public static void main(String args[])
	{	
		try
		{
			ElementSearch elementSearch = new ElementSearch();
			
			//Find element and its position in array
			elementSearch.findElementInArray();
		}
		catch(Exception e)
		{
			System.out.println("Exception in ElementSearch class main() ");
		}	
	}

	private  void findElementInArray() 
	{
		try
		{		
			Scanner in = new Scanner(System.in);
			boolean flag=false;
			int pos=0;		 
			
			//Enter the size of array
			int size = arrOp.arraySize();
			int[] arr1 = new int[size];
			
			//Insert the elements of array
			arr1=arrOp.insertElements(size);
			
			//Print the elements of array
			arrOp.printElements(arr1);
						 
		    System.out.println("Enter the element to be searched : ");
		    int elementToBeSearched = in.nextInt();
		    
		    //Find element and its position in array	
			for (int i = 0; i < arr1.length; i++) 
			{
				if(elementToBeSearched==arr1[i])
				{
					pos = i;
					flag= true;
					break;
				}
			}			 
		    if(flag ==  true)
		    	System.out.println("Element found and its position is :" +pos+" in array");
		    else
		    	System.out.println("Element not found in array");
		}
		catch(Exception e)
		{
			System.out.println("Exception in findElementInArray() ");
		}
	}
	

	
}