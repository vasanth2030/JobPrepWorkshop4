package com.vasanth.oops;

public class Dog extends Animal {

	//Overriding
	public void eat()
	{
		System.out.println("Eating dog food.");
	}
	
	
	//Overloading
	public void eat(String food)
	{
		System.out.println("Eating "+food);
	}
}
