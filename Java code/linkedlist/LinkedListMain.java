package com.vasanth.linkedlist;

public class LinkedListMain {
	public static void main(String[] args) {
		Node head=new Node(10);
		Node.insertNode(head, 20);
		Node.insertNode(head, 30);
		Node.insertNode(head, 40);
		Node.insertNode(head, 50);
		Node.insertNode(head, 60);
		Node.insertNode(head, 70);
		
		Node.printLinkedList(head);
		
		head=Node.deleteNode(head, 10);
		head=Node.deleteNode(head, 50);
		
		Node.printLinkedList(head);
		
		head=Node.insertNodeAtPos(head, 80, 3);
		Node.printLinkedList(head);
		
		Node.insertNodeAtPos(head, 90, 5);
		Node.printLinkedList(head);
	}
}
