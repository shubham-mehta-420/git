package com.shubham;

class Parent
{
    void caste()
	{
		System.out.println("caste - parent Brahaman");
	}
}
class Child extends Parent{
    void caste()
	{
		System.out.println("caste - child Brahaman");
	}
}

public class Demo3 {
public static void main(String[] ar)
{
	Parent c = new Child();
	c.caste();
	System.out.println("HIII");
}
}
