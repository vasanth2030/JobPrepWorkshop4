package com.vasanth.linkedlist;

public class Node {
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		next=null;
	}
	
	public static void insertNode(Node head,int data)
	{
		Node newNode=new Node(data);
		Node curr=head;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=newNode;
	}
	
	public static void printLinkedList(Node head)
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.data+" --> ");
			curr=curr.next;
		}
		System.out.println();
		
	}
	
	public static Node insertNodeAtPos(Node head, int x,int pos)
	{
		Node newNode=new Node(x);
		
		if(pos==1)
		{
			newNode.next=head;
			return newNode;
		}
		else
		{
			Node curr=head;
			int i=1;
			while(i<pos-1)
			{
				curr=curr.next;
				i++;
			}
			newNode.next=curr.next;
			curr.next=newNode;
			return head;
		}
	}
	
	public static Node deleteNode(Node head,int x)
	{
		if(x==head.data)
			return head.next;
		Node curr=head;
		while(curr.next!=null)
		{
			if(curr.next.data==x)
			{
				curr.next=curr.next.next;
				return head;
			}
			else
				curr=curr.next;
		}
		return head;
	}

}
