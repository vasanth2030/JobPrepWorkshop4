package com.vasanth.oops;

public class Animal {

	private String name;
	private int numberOfLegs;
	
	Animal(String name, int numberOfLegs)
	{
		this.name=name;
		this.numberOfLegs=numberOfLegs;
	}
	Animal()
	{
		
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getNumberOfLegs() {
		return numberOfLegs;
	}



	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}



	public void eat()
	{
		System.out.println("Eating food.");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping.");
	}
}
