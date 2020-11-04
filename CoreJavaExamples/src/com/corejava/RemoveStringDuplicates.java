package com.corejava;

import java.util.Arrays;

public class RemoveStringDuplicates {

	public static void main(String[] args)
	{
		String str = "raashmir";	
		
		char ch[]=str.toCharArray();	
		int len = ch.length;
		int fIndex = len-(len-1);
		int lastIndex = len-1;
		
		System.out.println("Old array with duplicates is :");
		for(int k=0;k<ch.length;k++)
		{
			System.out.print(ch[k]+" ");
		}
		
		System.out.println('\n'+"String is :"+str);
		if(ch[fIndex] == ch[lastIndex])
		{
			ch[fIndex] = ch[lastIndex];
		}
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(ch[i]==ch[j])
				{
					ch[j]=ch[len-1];
					len--;
					j--;
				}
			}
		}
		
		char[] chNew=Arrays.copyOf(ch,len);
		System.out.println("New array after removin is :");
		for(int k=0;k<chNew.length;k++)
		{
			System.out.print(chNew[k]+" ");
		}
		
		String newStr = String.valueOf(chNew);
		
		//String newStr=Arrays.toString(chNew);
		System.out.println('\n'+"After removing duplicate, new string is :"+newStr);
		
	}

}
