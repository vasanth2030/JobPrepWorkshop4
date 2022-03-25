package com.vasanth.basicjava;

import java.util.Scanner;

public class LoopsJava {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Start of program.");
		System.out.println();
		
//		int i=1;
//		while(i<=5)
//		{
//			System.out.println("Hi "+ i);
//			i++;
//		}
		
		
//		int i=8;
//		do {
//			System.out.println("Hi "+i);
//			i++;
//		}while(i<=10);
		
		
//		for(int i=1;i<=5;i++)
//		{
//			System.out.println("Hi "+i);
//		}
		
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		
		int answer= sumOfFirstNNaturalNumbers(n);
		System.out.println(answer);
		
		
		System.out.println();
		System.out.println("End of program.");
		
	}
	
	public static int sumOfFirstNNaturalNumbers(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;    // sum=sum+i;
		}
		
		return sum;
		
	}

}
