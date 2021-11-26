package com.linkedList;

public class LinkedListServices {
	
	Node head;

	// add data
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}	
		newNode.next = head;
		head = newNode;	
	}
	
	//print list
	public void printList() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode!= null) {
			System.out.print(currNode.data + " -->");
			currNode = currNode.next;
		}
		 System.out.println("NULL");
	}
}
