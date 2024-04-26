package ai.developer.code.javastack;

import java.util.Stack;

public class JavaStackChecker {

    public static boolean isBalanced(String input) {
        if (input.isEmpty())
            return true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {

            char current = input.charAt(i);
            System.out.println(current);
            if (current == '{' || current == '(' || current == '[') {
                stack.push(current);
            }
            if (current == '}' || current == ')' || current == ']') {
                if (stack.isEmpty()) {
                    stack.push(current);
                } else {
                    char last = stack.peek();
                    if (current == '}' && last == '{' || current == ')' && last == '('
                            || current == ']' && last == '[') {
                        Character pop = stack.pop();
                    }
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }
}