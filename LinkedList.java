package com.linkedList;

public class LinkedList {
	
	Node head;
	
	public static void main(String[] args) {
		
		LinkedListServices list = new LinkedListServices(); 
		list.addLast(56);
		list.addLast(30);
		list.addLast(70);
		list.printList();
	
}
}
