package com.linkedList;

public class LinkedList {
	
	Node head;
	
	public static void main(String[] args) {
		
		LinkedListServices list = new LinkedListServices(); 
		list.addFirst(56);
		list.addFirst(30);
		list.addFirst(70);
		list.printList();
		
}
}
