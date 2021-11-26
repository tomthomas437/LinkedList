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
	
	//Add in last
		public void addLast(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
		}
		    
			Node currNode = head;
			while(currNode.next != null) {
				currNode = currNode.next;
			}
		
		    currNode.next = newNode;
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
