// import java.io.*;
import java.util.*;

public class queue_demo {

    public static void main(String[] args) {
     
        Queue<Integer> queue = new ArrayDeque<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue); // [10, 20, 30, 40, 50]
        System.out.println(queue.peek()); // 10
        queue.remove();

        
        System.out.println(queue); // [ 20, 30, 40, 50]
        System.out.println(queue.peek()); // 20
        queue.remove();

        
        System.out.println(queue); // [ 30, 40, 50]
        System.out.println(queue.peek()); // 30
        queue.remove();

        
        System.out.println(queue); // [ 40, 50]
        System.out.println(queue.peek()); // 40
        queue.remove();

        
        System.out.println(queue); // [ 50]
        System.out.println(queue.peek()); // 50
        queue.remove();
    }

}