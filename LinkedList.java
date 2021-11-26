package com.linkedList;

public class LinkedList {
	
	Node head;
	
	public static void main(String[] args) {
		
		LinkedListServices list = new LinkedListServices(); 
		list.addFirst(70);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(56);
		list.printList();
	
		list.findNode(40);
		list.deleteNode(40);
		
		
		list.printList();
		System.out.println("Size of the Linked list is : " + list.size());
  }
}
