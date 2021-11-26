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
	
	public void insertBetween(int before, int data) {
		Node currNode = head;
		Node newNode = new Node(data);
		
		while(currNode.data != before) {
			currNode = currNode.next;
		}
		
		newNode.next = currNode.next;
		currNode.next = newNode;
		System.out.println("Inserted value " + data + " after node value " + before);
	}
	
	 //delete first node
	public void deleteFirst() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		head = head.next;
	}
	
	//delete last node
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
			}
		secondLast.next = null;
	}
}



