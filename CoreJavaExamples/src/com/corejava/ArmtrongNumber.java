package com.corejava;

import java.util.Scanner;

public class ArmtrongNumber {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number :");
		int n = s.nextInt();
		int count = 0,
				sum =0;

		int num = n;
		int oNum=n;
		while(n>0)
		{
			n=n/10;
			count++;			
		}
		
		System.out.println("Number of digits in given number is :"+count);
		int rem=0;
		while(num > 0)
		{
			rem = num%10;
			num=num/10;	
			sum=sum+(int) Math.pow(rem,count);	
			System.out.println("sum is  :"+sum);
		}
		
		if(oNum == sum)
			System.out.println("Yes..Number is armstrong");
		else
			System.out.println("Noooo... Number is not armstrong");
	}
}