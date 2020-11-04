package com.corejava;

public class StaticVariableClass1 
{
	public static void main(String args[])
	{
		StaticVariableClass1 staticVariableClass1Obj = new StaticVariableClass1();
				
		int varInMainMethod = 0;
		
		StaticVarExample staticVarExampleObj = new StaticVarExample();
		varInMainMethod = staticVarExampleObj.StaticVariable+10;
		
		System.out.println("Static variable result in main function is :"+varInMainMethod); 
		
		staticVariableClass1Obj.changeStaticVarInClass1();
	}
	
	 void changeStaticVarInClass1() 
	{		
		int res = 30;
		res= StaticVarExample.getStaticVariable()+res;
		System.out.println("Static variable result in changeStaticVarInClass1() is :"+res);
	}
}
