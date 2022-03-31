package com.vasanth.array;

import java.util.Scanner;

public class ArrayMain {
	public static void main(String[] args) {
		
//		int arr[]= {1,2,3,4,5,6};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int arr[] = new int[n];
		
		for (int i=0;i<n;i++)
		{
			System.out.println("Enter the value: ");
			arr[i]=sc.nextInt();
		}
		
		printArray(arr);
		
		System.out.println("Largest element: "+largestElement(arr));
		System.out.println("Second Largest element: "+secondLargestElement(arr));
		
		System.out.println("Enter element you want to search: ");
		int num=sc.nextInt();
		
		int idx=linearSearch(arr, num);
		if(idx==-1)
			System.out.println("Linear Search: Element not found.");
		else
			System.out.println("Linear Search: Element found at index "+idx);
		
		
		int index=binarySearch(arr, num);
		if(index==-1)
			System.out.println("Binary Search: Element not found.");
		else
			System.out.println("Binary Search: Element found at index "+idx);
		
	}
	
	public static void printArray(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static int largestElement(int arr[])
	{
		if(arr.length==0)
			return -1;
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
		
	}
	
	public static int secondLargestElement(int arr[])
	{
		if(arr.length==0)
			return -1;
		int largest=arr[0];
		int secondLargest=Integer.MIN_VALUE;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				secondLargest=largest;
				largest=arr[i];
			}
			else if(arr[i]!=largest && arr[i]>secondLargest)
				secondLargest=arr[i];
		}
		if(secondLargest==Integer.MIN_VALUE)
			return -1;
		return secondLargest;
	}
	
	public static int linearSearch(int arr[],int x)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==x)
				return i;
		}
		
		return -1;
	}
	
	public static int binarySearch(int arr[],int x)
	{
		int l=0;
		int r=arr.length-1;
		while(l<r)
		{
			int mid=(l+r)/2;
			
			if(arr[mid]==x)
				return mid;
			else if(arr[mid]>x)
				r=mid-1;
			else
				l=mid+1;
		}
		return -1;
	}
}
