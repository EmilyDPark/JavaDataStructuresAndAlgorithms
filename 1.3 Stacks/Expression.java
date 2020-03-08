package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    } // isBalanced method

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    } // isLeftBracket method

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    } // isRightBracket method

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    } // bracketsMatch method

} // Expression class

