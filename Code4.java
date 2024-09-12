//4. Write a Java program that initializes a `Stack` of doubles with the values {1.1, 2.2, 3.3, 4.4, 5.5}.
    //Convert the stack to an array and print the array.
    //Then, create a new stack from the array and print the elements of the new stack.
package stack;

import java.util.Arrays;
import java.util.Stack;

public class Code4 {
    
    public static void main(String[] args) {
        Stack<Double> value=new Stack<>();
        value.push(1.1);
        value.push(2.2);
        value.push(3.3);
        value.push(4.4);
        value.push(5.5);
    }
}
