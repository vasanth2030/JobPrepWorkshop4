package com.vasanth.oops;

public class Main {

	public static void main(String[] args) {

		Animal animal1 = new Animal("Dog", 4);
		animal1.eat();
		animal1.sleep();

		System.out.println(animal1.getName());
		System.out.println(animal1.getNumberOfLegs());

		Dog dog1 = new Dog();
		dog1.eat();
		dog1.eat("Chicken");
		dog1.sleep();
		dog1.setName("Labrador");
		dog1.setNumberOfLegs(4);
		System.out.println(dog1.getName());
		System.out.println(dog1.getNumberOfLegs());
		
		AnotherClass ac=new AnotherClass();
		ac.doSomething();
		ac.print();

	}
}
