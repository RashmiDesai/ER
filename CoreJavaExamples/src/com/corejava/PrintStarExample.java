package com.corejava;

public class PrintStarExample {

	public static void main(String[] args) 
	{
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.print("*"+"");
				if(j>=i)
				break;      
			}
			System.out.println();
		}
	}

}
