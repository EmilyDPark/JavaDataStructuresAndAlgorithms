package com.company;

//import java.util.Stack;

public class Main {

    public static void main(String[] args) {
    	// -------------------- Using Stacks --------------------
//	    Stack<Integer> stack = new Stack<>();
//	    stack.push(10);
//	    stack.push(20);
//	    stack.push(30);
//        System.out.println(stack);
//        var top = stack.pop();
//		System.out.println(top);
//		System.out.println(stack);
//		top = stack.peek();
//		System.out.println(top);


		// -------------------- Exercise: Reversing a String --------------------
		String str = "abcd";

		StringReverser reverser = new StringReverser();
		var result = reverser.reverse(str);

		System.out.println(result);


		// -------------------- Exercise: Balanced Expressions --------------------
		String str2 = "(([1] + <2>)){a}";

		Expression exp = new Expression();
		exp.isBalanced(str2);
		var result2 = exp.isBalanced(str2);
		System.out.println(result2);


		// -------------------- Exercise: Building a Stack Using an Array --------------------
		Stack stack2 = new Stack();
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		stack2.pop();
		System.out.println(stack2);
		System.out.println(stack2.peek());

	} // main method

} // Main class
