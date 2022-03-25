package com.vasanth.basicjava;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {

		System.out.println("Start of program.");

//		throw new Exception("Manually thrown exception");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println();
		System.out.println("Division value: " + div(a, b));

		System.out.println("End of program.");

	}

	public static int div(int a, int b) {
		int div = -1;
		try {
			div = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Enter a non zero dividend.");
		} catch (NumberFormatException e) {
		} catch (Exception e) {
		} finally {
			return div;
		}
	}

}
