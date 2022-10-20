package com.shubham;

// Abstract class
abstract class Animal {
  // Abstract method (does not have a body)
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Animal {
	public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The Dog says: bhoo bhoo");
	  }
	}

class Demo5 {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
    Dog myDog = new Dog();
    myDog.animalSound();
    myDog.sleep();
    StringBuilder builder = new StringBuilder("ram");
    String s = "ram";
    
    System.out.println(s);
    System.out.print(builder.length());
  }
}