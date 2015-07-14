package net.tsvm.demo.lists;

public class LinkedListTest {
	public static void main(String[] args) {
		MyLinkedList list1 = new MyLinkedList();
		System.out.println(list1.count());
		fillList(list1);
		
		for (int i = 0; i < list1.count(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println(list1.count());
	}
	
	private static void fillList(MyLinkedList list) {
		list.add("Message 1: Hi");
		list.add("Message 2: Hello!");
		list.add("Message 3: How are you?");
		list.add("Message 4: Fine, Thanks!");
		list.add("Message 5: And you?");
	}
}
