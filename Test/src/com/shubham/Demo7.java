package com.shubham;

class A1{
	static int i = 0;
	public void finalize() {
		System.out.println("Finalize for"+ i++);
	}
}
public class Demo7 {
	
	public static void main(String[] args)
	{
		
//		A1 a[] = new A1[10000000];
//		for(int j=0; j<a.length;j++) {
//			System.out.println("hello");
//			a[j]=new A1();
//			a[j]=null;
//		}
		A1 a = new A1();
		
		System.gc();
		A1 a1 = new A1();
		a1.finalize();
	}
}
