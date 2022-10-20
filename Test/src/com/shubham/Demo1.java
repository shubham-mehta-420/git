package com.shubham;


public class Demo1{  
		   void method1()// generates an exception 
		   {
//		      int arr[] = {10,20,30};
//		      System.out.println(arr[7]);
		      throw new NullPointerException();
		   }
		   void method2()// doesn't catch the exception 
		   {
		      method1();
		   }
		   // method1 drops down the call stack
		   void method3()// method3 catches the exception 
		   {
		      try {
		         method1();
		      } catch(NullPointerException e) {
		         System.out.println("Exception is caught");
		      }
		   }
		   public static void main(String args[]) {
		      Demo1 obj = new Demo1();
		      obj.method3();
		   }
		}
