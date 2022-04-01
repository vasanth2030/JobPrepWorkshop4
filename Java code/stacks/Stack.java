package com.vasanth.stacks;

public class Stack {
	int arr[];
	int capacity;
	int top;
	
	Stack(int capacity)
	{
		this.capacity=capacity;
		arr=new int[capacity];
		top=-1;
	}
	
	public void push(int val)
	{
		if(top==capacity-1)
			System.out.println("Stack Overflow");
		else
		{
			top++;
			arr[top]=val;
		}
	}
	
	public void pop()
	{
		if(top==-1)
			System.out.println("Stack Underflow");
		else
			top--;
	}
	
	public int peek()
	{
		return arr[top];
	}
	
	
	public void printStack()
	{
		for(int i=top;i>=0;i--)
		{
			System.out.print(arr[i]+" --> ");
		}
		System.out.println();
	}

}
