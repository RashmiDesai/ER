package StringExamples;

import java.util.Scanner;

public class ParanthesisProg {

	public static void main(String[] args) 
	{

//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
		
		String str = "(Hi,This is (Rashmi(Desai))";
		System.out.println(str);
		
		int openP = 0;
		int closeP = 0;
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)== '(')
				openP++;
			else if(str.charAt(i) ==')')
				closeP++;
			
		}
		System.out.println("Open paranthesis : "+openP);
		System.out.println("Close paranthesis : "+closeP);
		
		if(openP == closeP)
			System.out.println("equal 1");
		else
			System.out.println("Notequal 0");
	}

}
