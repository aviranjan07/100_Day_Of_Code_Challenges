import java.util.*;

public class serialize {
  public static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>(); // bhoolna matt

    Node(int data){
      this.data = data;
    }
  }

  public static void levelOrder(Node root){
    Queue<Node> queue = new ArrayDeque<Node>();
    queue.add(root);

    while(queue.size() > 0){
      // r,p,a
      Node temp = queue.remove();
      System.out.print(temp.data + " ");
      for(Node child: temp.children){
        queue.add(child);
      }
    }

    System.out.println(".");
  }

  public static void levelOrderLinewise(Node root){
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

  public static Node construct(int[] arr){
    // using the array, create the tree and return  root
    Node root = null;
    Stack<Node> stack = new Stack<>();

    for(int val: arr){
      if(val != -1){
        Node node = new Node(val);
        stack.push(node);
      } else {
        Node node = stack.pop();

        if(stack.size() > 0){
          Node parent = stack.peek();
          parent.children.add(node);
        } else {
          root = node;
        }
      }
    }

    return root;
  }

  public static void serialize(Node node, ArrayList<Integer> list){
    // fill data like the array below
    list.add(node.data); // node pre

    for(Node child: node.children){
      serialize(child, list);
    }

    list.add(-1);
  }

  public static void main(String[] args) {
    int[] arr = {10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1, 120, -1, -1, 90, -1, -1, 40, 100, -1, -1, -1};
    Node root = construct(arr);

    ArrayList<Integer> list = new ArrayList<>();
    serialize(root, list);
    System.out.println(list);

    // levelOrderLinewise(root);
  }
}