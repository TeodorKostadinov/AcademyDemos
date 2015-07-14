package net.tsvm.demo.lists;

import java.util.Stack;

public class StackTest {
	
	public static void main(String[] args) {
		String expression = "((2+3)*(4+5))/(5-3)";
		
		boolean correctBrackets = checkBrackets(expression);
		
		System.out.println(correctBrackets);
	}
	
	private static boolean checkBrackets(String expression) {
		if (expression != null && expression.length() > 0) {
			Stack<String> stack = new Stack<String>();
			
			for (int i = 0; i < expression.length(); i++) {
				char currentChar = expression.charAt(i);
				if (currentChar == '(') {
					stack.push("");
				}
				
				if (currentChar == ')') {
					if (stack.isEmpty()) {
						return false;
					}
					stack.pop();
				}
			}
			
			return stack.isEmpty();
		}
		
		return true;
	}

}
