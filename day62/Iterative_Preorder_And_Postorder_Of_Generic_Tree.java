/*
Q.Iterative_Preorder_And_Postorder_Of_Generic_Tree
simple input--
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1

simple output-
10 20 -50 60 30 70 -80 110 -120 90 40 -100 
-50 60 20 70 110 -120 -80 90 30 -100 40 10 
*/
import java.io.*;
import java.util.*;

public class Iterative_Preorder_And_Postorder_Of_Generic_Tree {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  // code 
  static class Pair{
    Node node;
    int state;

     Pair(Node node, int state){
       this.node = node;
       this.state = state;
     }
  }
  public static void IterativePreandPostOrder(Node node) {
    // write your code here
    Stack<Pair> st = new Stack<>();
    st.push(new Pair(node, -1));

    String pre = "";
    String post = "";

    while(st.size() > 0){
      Pair top = st.peek();
      if(top.state == -1){
        pre += top.node.data + " ";
        top.state++;
      }else if(top.state == top.node.children.size()){
        post += top.node.data + " ";
        st.pop();
      }else {
        Pair cp = new Pair(top.node.children.get(top.state), - 1);
        st.push(cp);

        top.state++;
      }
    }
    System.out.println(pre);
    System.out.println(post);
  }
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    IterativePreandPostOrder(root);
  }

}


// Type 2 
/*
import java.io.*;
import java.util.*;

public class Iterative_Preorder_And_Postorder_Of_Generic_Tree\ {
  private static class Node {
    int data;
    ArrayList<Node> children = new ArrayList<>();
  }

  public static void display(Node node) {
    String str = node.data + " -> ";
    for (Node child : node.children) {
      str += child.data + ", ";
    }
    str += ".";
    System.out.println(str);

    for (Node child : node.children) {
      display(child);
    }
  }

  public static Node construct(int[] arr) {
    Node root = null;

    Stack<Node> st = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == -1) {
        st.pop();
      } else {
        Node t = new Node();
        t.data = arr[i];

        if (st.size() > 0) {
          st.peek().children.add(t);
        } else {
          root = t;
        }

        st.push(t);
      }
    }

    return root;
  }

  static int sum = 0;
  static int max = Integer.MIN_VALUE;
  static int min = Integer.MAX_VALUE;
  static int height = -1;
  
  public static void multiSolver(Node node, int depth){
      // every node will come here
      sum += node.data;
      if(node.data > max){
          max = node.data;
      }
      if(node.data < min){
          min = node.data;
      }
      if(depth > height){
          height = depth;
      }
      
      for(Node child: node.children){
          multiSolver(child, depth + 1);
      }
  }
  
  public static class HeapMover {
      int sum = 0;
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      int height = -1;
  }
  
   public static void multiSolver2(Node node, int depth, HeapMover mover){
      // every node will come here
      mover.sum += node.data;
      if(node.data > mover.max){
          mover.max = node.data;
      }
      if(node.data < mover.min){
          mover.min = node.data;
      }
      if(depth > mover.height){
          mover.height = depth;
      }
      
      for(Node child: node.children){
          multiSolver2(child, depth + 1, mover);
      }
  }

  static int largest = Integer.MIN_VALUE;
  static int slargest = Integer.MIN_VALUE;
  public static void secondLargest(Node node){
      if(node.data >= largest){
          slargest = largest;
          largest = node.data;
      } else if(node.data > slargest){
          slargest = node.data;
      }

      for(Node child: node.children){
          secondLargest(child);
      }
  }

  static class MoverForSlargest {
      int largest = Integer.MIN_VALUE;
      int slargest = Integer.MIN_VALUE;
  }

  public static void slargest2(Node node, MoverForSlargest mover){
    if(node.data >= mover.largest){
        mover.slargest = mover.largest;
        mover.largest = node.data;
    } else if(node.data > mover.slargest){
        mover.slargest = node.data;
    }

    for(Node child: node.children){
        slargest2(child, mover);
    }
  }

  static int ceil = Integer.MAX_VALUE; // because it is a min (of the larger elements)
  static int floor = Integer.MIN_VALUE; // because it is a max (of the smaller elements)
  public static void ceilAndFloor1(Node node, int criteria){
      if(node.data > criteria){
          // valid for ceil
          if(node.data < ceil){
              ceil = node.data;
          }
      }

      if(node.data < criteria){
          // relevant for floor

        if(node.data > floor){
            floor = node.data;
        }
      }

      for(Node child: node.children){
          ceilAndFloor1(child, criteria);
      }
  }
  
  
  public static void ceilAndFloor2(Node node, int criteria){
      if(node.data > criteria){
          // valid for ceil
          if(node.data < ceil){
              ceil = node.data;
          }
      }

      if(node.data < criteria){
          // relevant for floor

        if(node.data > floor){
            floor = node.data;
        }
      }

      for(Node child: node.children){
          ceilAndFloor1(child, criteria);
      }
  }

  

  public static void preorder(Node node){
      System.out.print(node.data + " ");
      for(Node child: node.children){
          preorder(child);
      }
  }
  
  
  static class Pair {
      int state;
      Node node;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(values[i]);
    }

    Node root = construct(arr);
    // preorder(root);
    // System.out.println(".");
    
    String preorder = "";
    String postorder = "";
    Stack<Pair> stack = new Stack<>();
    
    Pair rootp = new Pair();
    rootp.state = -1;
    rootp.node = root;
    
    stack.push(rootp);
    while(stack.size() > 0){
        Pair peekp = stack.peek();
        
        if(peekp.state == -1){
            // pre
            preorder += peekp.node.data + " ";
            peekp.state++;
        } else if(peekp.state < peekp.children.size()){
            // child
            Pair cp = new Pair();
            cp.state = -1;
            cp.node = peekp.children.get(peekp.state);
            stack.push(cp);
            
            peekp.state++;
        } else if(peekp.state == peekp.children.size()){
            // post
            postorder += peekp.node.data + " ";
            peekp.state++;
        } else {
            // pop
            stack.pop();
        }
    }
    
   
    
    System.out.println(preorder + ".");
    System.out.println(postorder + ".");
    
  }

}
*/