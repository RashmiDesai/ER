package com.corejava;

class StaticNonStaticExamle {

	public static void main(String[] args) {
		StaticUseExample.statMethod("from other class");
	}
}

class StatExample1 {
	static int a = 10;
	static int b = 20;

	static void statMethod() {
		System.out.println("In static method...");
	}

	void nonStatMeth() {
		System.out.println("In non static method..");
	}
}