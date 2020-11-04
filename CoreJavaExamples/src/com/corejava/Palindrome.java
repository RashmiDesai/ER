package com.corejava;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		int rem;
		int rev = 0;
		System.out.println("Enter the value to check for palindrome : ");
		int num1 = in.nextInt();
		int num = num1;
		
		while(num > 0)
		{
			rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}

		if(num1 == rev)
			System.out.println(num1+" is palindrome");
		else
			System.out.println(num1+" is not palindrome");

}
}
