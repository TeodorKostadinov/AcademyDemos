package net.tsvm.demo.lists;

public class MyLinkedList {
	private Node head;
	private int count = 0;
		
	public void add(Object element) {
		Node newNode = new Node(element, null);
		
		if (head != null) {
			Node temp = head;
			while (temp.next() != null) {
				temp = temp.next();
			}
			temp.setNext(newNode);			
		} else {
			this.head = newNode;			
		}
		this.count++;
	}
	
	public Object get(int position) {
		if (head != null) {
			Node temp = head;
			int tempCount = 0;
			while (temp.next() != null && tempCount < position) {
				temp = temp.next();
				tempCount++;
			}
			if (tempCount == position) {
				return temp.getData();
			}
		}
		
		return null;
	}
	
	public int count() {
		return this.count;		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
