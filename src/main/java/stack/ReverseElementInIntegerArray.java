package stack;

import java.util.Stack;

public class ReverseElementInIntegerArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.push(1));
        System.out.println(stack.push(2));
        System.out.println(stack.push(3));
        System.out.println(stack.push(4));
        System.out.println("*********");
        for (int x : stack) {
            System.out.print(x + "\t");
        }
        System.out.println();

        System.out.println("-------");
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        System.out.println("==========");
        System.out.println("List number before");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "\t");
        }
    }
}
