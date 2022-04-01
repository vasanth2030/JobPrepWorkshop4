package com.vasanth.queue;

import java.util.Scanner;

public class QueueMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the queue: ");
		int n=sc.nextInt();
		Queue q=new Queue(n);
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			q.enqueue(sc.nextInt());
		}
			
		q.printQueue();
		
		System.out.println("Dequeue");
		q.dequeue();		
		q.printQueue();
		
		System.out.println("Dequeue");
		q.dequeue();
		q.printQueue();

	}
}
