package com.corejava;

import java.util.Scanner;

public class ReverseExample {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int rem;
		int rev = 0;
		System.out.println("Enter the value to be reverse : ");
		int num1 = in.nextInt();
		int num = num1;
		
		while(num > 0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		
		System.out.println("The entered number is :"+num1);
		System.out.println("The reversed number is :"+rev);
	}

}
