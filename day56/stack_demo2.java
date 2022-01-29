// import java.io.*;
import java.util.*;

public class stack_demo2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // push, pop, peek are all o(1)

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        while(stack.size() > 0){
            Integer tos = stack.peek();
            System.out.println(tos);
            stack.pop();
        }
    }

}
// today- 1.Level_order_Of_Generic_Tree 2.Levelorder_Linewise_generic_Tree 3.queue_demo 4.stack_demo  