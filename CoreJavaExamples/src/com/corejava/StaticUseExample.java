package com.corejava;

public class StaticUseExample 
{
	static int statVar1 = 10;
	static int statVar2 = 0;
	int m = 30;

	public static void main(String[] args) 
	{
		StaticUseExample objMain = new StaticUseExample();
		System.out.println("Main method executed ");
		objMain.nonStatMeth(42);
		objMain.statMethod("main class object");
		StaticUseExample.statMethod("classname staticUseExample");
	}

	private void nonStatMeth(int i) 
	{
		System.out.println("Static variable1 value :  " + statVar1);
		System.out.println("Static variable2 value :  " + statVar2);
		System.out.println("Non-static variable : " + m);
	}

	static
	{
		System.out.println("Static block initiated..");
		statVar2 = statVar1 * 40;
	}
	
	public static void statMethod(String msg)
	{
		System.out.println("Static method called by "+msg);
		
	}
}
