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
		System.out.println("Exercise: Reversing a String");
		String str = "abcd";
		StringReverser reverser = new StringReverser();
		var result = reverser.reverse(str);
		System.out.println(result);


		// -------------------- Exercise: Balanced Expressions --------------------
		System.out.println("\nExercise: Balanced Expressions");
		String str2 = "(([1] + <2>)){a}";
		Expression exp = new Expression();
		exp.isBalanced(str2);
		var result2 = exp.isBalanced(str2);
		System.out.println(result2);


		// -------------------- Exercise: Building a Stack Using an Array --------------------
		System.out.println("\nExercise: Building a Stack Using an Array");
		Stack stack2 = new Stack();
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		stack2.pop();
		System.out.println(stack2);
		System.out.println(stack2.peek());


		// -------------------- Exercise: Two Stacks in One Array --------------------
		System.out.println("\nExercise: Two Stacks in One Array");
		TwoStacks twoStacks = new TwoStacks(6);
		twoStacks.push1(11);
		twoStacks.push1(22);
		twoStacks.push1(33);
		twoStacks.push2(44);
		twoStacks.push2(55);
		twoStacks.push2(66);
		System.out.println(twoStacks);
		twoStacks.printStack1();
		twoStacks.printStack2();
		twoStacks.pop1();
		twoStacks.pop2();
		twoStacks.printStack1();
		twoStacks.printStack2();


		// -------------------- Exercise: Minimum Value in a Stack --------------------
		System.out.println("\nExercise: Minimum Value in a Stack");
		MinStack minStack = new MinStack();
		minStack.push(10);
		minStack.push(5);
		minStack.push(7);
		minStack.push(3);
		System.out.println(minStack);
		System.out.println(minStack.min());
		minStack.pop();
		System.out.println(minStack.min());

	} // main method

} // Main class
