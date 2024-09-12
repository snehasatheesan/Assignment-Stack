//1. Write a Java program that creates a `Stack` of integers.
    // Push the numbers 10, 20, 30, 40, and 50 onto the stack.
    // Then, pop the top element and print the remaining elements in the stack.
package stack;

import java.util.Stack;

public class Code1 {
    public static void main(String[] args) {
        Stack<Integer> sc=new Stack<>();
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.push(40);
        sc.push(50);

        sc.pop();

        System.out.println(" The remaining elements are: "+sc);
    }
}
