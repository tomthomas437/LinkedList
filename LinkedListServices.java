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
	 // delete node
	public void deleteNode(int data) {
		Node currNode = head;
		Node prevNode = head;
		
		while(currNode != null) {
			if(currNode.data == data) {
				prevNode.next = currNode.next;
				return;
			}
			
			prevNode = currNode;
			currNode = currNode.next;
		}
		
		System.out.println(" Unable to find the node for value " + data);
		
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
	   // Search to find Node
	public Node findNode(int data) {
		Node currNode = head;
		
		while(currNode != null) {
			if(currNode.data == data) {
				System.out.println(" Node found for the value " + data);
				return currNode;
			}
			
			currNode = currNode.next;
		}
		System.out.println(" Sorry!! Unable to find the node of value " + data);
		return null;
		
	}
	 
	public int size() {
		Node currNode = head;
		int count = 0;
		
		while(currNode != null) {
			count++;
			currNode = currNode.next;
		}
		
		return count;
	}
	
}



