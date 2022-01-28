/*
simple input-
24
10 20 50 -1 60 -1 -1 30 70 -1 80 110 -1 120 -1 -1 90 -1 -1 40 100 -1 -1 -1

simple output -
10 20 30 40 50 60 70 80 90 100 110 120 .
*/
// import java.io.*;
import java.util.*;

public class Level_order_Of_Generic_Tree {

     public static class Node {
         int data;
         ArrayList<Node> children = new ArrayList<>();

         Node(int data){
             this.data = data;
         }
     }

     public static void levelOrder(Node root){
         Queue<Node> queue = new ArrayDeque<Node>();
         queue.add(root);

         while(queue.size() > 0){
          // r, p , a
            Node temp = queue.remove();
            System.out.println(temp.data + " ");
            for(Node child: temp.children){
            queue.add(child);
         }
     }
     System.out.println(".");
    }

    public static void lavelOrderLineWise(Node root){
        Queue<Node> queue = new ArrayDeque<Node>();
        Queue<Node> cqueue = new ArrayDeque<Node>();

        queue.add(root);
        while(queue.size() > 0){
            Node temp = queue.remove();
            System.out.print(temp.data + " ");
            for(Node child: temp.children){
                cqueue.add(child);
            }
            if(queue.size() == 0){
               queue = cqueue;
               cqueue = new ArrayDeque<>();
               System.out.println(".");
            }
        }

    }
    public static void main(String[] args) {
       Node root = new Node(10);
       
       Node twenty = new Node(20);
       root.children.add(twenty);

       Node thirty = new Node(30);
       root.children.add(thirty);

       Node fourty = new Node(40);
       root.children.add(fourty);
// children of twenty 
       Node fifty = new Node(50);
       twenty.children.add(fifty);

       Node sixty = new Node(60);
       twenty.children.add(sixty);
//children of thirty
       Node seventy = new Node(70);
       thirty.children.add(seventy);

       Node eighty = new Node(80);
       thirty.children.add(eighty);

       Node ninety = new Node(90);
       thirty.children.add(ninety);
// children of fourty
       Node hundred = new Node(100);
       fourty.children.add(hundred);
// children of eighty 
       Node hundredTen = new Node(110);
       eighty.children.add(hundredTen);

       Node hundredatwenty = new Node(120);
       eighty.children.add(hundredatwenty);

       levelOrder(root);
       lavelOrderLineWise(root);
   
    }

}