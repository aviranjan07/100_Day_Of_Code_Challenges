// import java.io.*; 
import java.util.*;

public class stack_demo {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // push, pop, peek are all o(1)

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.peek()); //50
        stack.pop(); // 10 , 20, 30, 40

        System.out.println(stack.peek()); //40
        stack.pop(); // 10, 20, 30

        System.out.println(stack.peek()); //30
        stack.pop(); // 10, 20

        System.out.println(stack.peek()); //20
        stack.pop(); // 10

        System.out.println(stack.peek()); //10
        stack.pop(); //empty
    }

}