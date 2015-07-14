package net.tsvm.demo.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;

public class JavaListTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		LinkedList<Date> list2 = new LinkedList<Date>();
		
		list2.add(new Date());		
		list.add("asdf");
		list.add("12341234");
		
		System.out.println(list.size());
		
		for (String string : list) {
			
		}
		
		int[] numbers = new int[] {3,6,2,10, 12,4,6};
		
		Arrays.sort(numbers);	
		
		System.out.println(Arrays.toString(numbers));
	}
}
