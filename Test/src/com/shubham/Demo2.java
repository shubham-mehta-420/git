package com.shubham;


// Java program to demonstrate difference between
// String, StringBuilder and StringBuffer

// Main class
class Demo2 {

	static void show() {
		System.out.println("StringBufferqqqshow");
		throw new ArrayIndexOutOfBoundsException();
	}
	static void show1() {
		show();
		System.out.println("StringBufferqqqshow111");
		
	}
	
	public static void main(String[] args)
	{
		Demo2.show1();
		System.out.println("StringBuffer");
		
	}
}
