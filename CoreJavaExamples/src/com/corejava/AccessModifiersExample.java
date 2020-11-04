package com.corejava;

import com.testPackage.DefaultAccessTest;

public class AccessModifiersExample {

	public static void main(String[] args)
	{
//		AccessMembers accessMeb = new AccessMembers();
//		accessMeb.setDefaultMember(10);
//		accessMeb.setPriMember(20);
//		accessMeb.setPubMember(30);
//		
//		System.out.println("Default member is "+accessMeb.getDefaultMember());
//		System.out.println("Private member is "+accessMeb.getPriMember());
//		System.out.println("Public member is "+accessMeb.getPubMember());
//		
		
		DefaultAccessTest testDefault = new DefaultAccessTest();
		testDefault.pu=5000;
		testDefault.setD(8000);
		testDefault.setPr(1200);
		
		System.out.println("Public value :"+testDefault.pu);
		System.out.println("Default value :"+testDefault.getD());
		System.out.println("Private value :"+testDefault.getPr());
		
	}

}
