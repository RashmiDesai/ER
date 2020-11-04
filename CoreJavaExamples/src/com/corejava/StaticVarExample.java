package com.corejava;

public class StaticVarExample 
{
	//Variable declared as static
	static int StaticVariable=10;
	
	//Method declaration
	public void manupulateStatVar()
	{
		System.out.println("Static variable is : "+StaticVariable);
	}

	public static int getStaticVariable() {
		return StaticVariable;
	}

	public static void setStaticVariable(int staticVariable) {
		StaticVariable = staticVariable;
	}
	
	
}
