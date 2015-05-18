package com.bandhanhara.javautilities.string;

public class StringPool {
	
	public static void main(String args[]){ 
		String str1 = "Hello";
		String str2 = new String("Hello");
		String str3 = "Hello";
		String str4 = new String();
		
		if(str1==str2)
			System.out.println("str1 and str2 references same object");
		else
			System.out.println("str1 and str2 references different objects");
		
		if(str1==str3)
			System.out.println("str1 and str3 references same object");
		else
			System.out.println("str1 and str3 references different objects");
		
		if(str4==str2)
			System.out.println("str2 and str4 references same object");
		else
			System.out.println("str2 and str4 references different objects");
		
	}
}
