//2. Write a Java program that uses a `Stack` to reverse a string.
    // For example, given the input string "hello", the program should output "olleh".
package stack;

import java.util.Scanner;
import java.util.Stack;

public class Code2 {
    
    public static void reverse(String a){
        Stack<Character>rev=new Stack<>();
        for (int i=0;i<a.length();i++)
            rev.push(a.charAt(i));
        System.out.println("Reversed string by using stack");
        while (!rev.empty()){
            System.out.print(rev.pop());
        }
    }
    public static void main(String[] args) {
        Scanner tc=new Scanner(System.in);
        System.out.println("Enter string:");
        String b=tc.next();
        reverse(b);
    }
}
