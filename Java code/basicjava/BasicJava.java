package com.vasanth.basicjava;

import java.util.Scanner;

public class BasicJava {
	public static void main(String[] args) {
		
//		String name=" - by Vasanth";     Ctrl+/
//		int age=20;
//		float height = 178.6f;
		
		
		
		String name;
		int age;
		int height= (int)178.6;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		name= sc.nextLine();
		System.out.println("Enter your age:");
		age=sc.nextInt();
		
		System.out.println("Hello World "+ name);
		System.out.println("How are you? "+ name);
		System.out.println("I hope you're doing well "+ name);
		
		System.out.println("I am " +age+ " years old and I'm " +height+ " cm tall.");

		
	}

}
