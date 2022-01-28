/*
simple input-
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
70

simple output-
CEIL = 90
FLOOR = 60
*/
import java.io.*;
import java.util.*;

public class Ceil_And_Floor_In_Generic_Tree {
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
  public static void ceilAndFloor1(Node node, int data){
      if(node.data > data){
          // valid for ceil
          if(node.data < ceil){
              ceil = node.data;
          }
      }

      if(node.data < data){
          // relevant for floor

        if(node.data > floor){
            floor = node.data;
        }
      }

      for(Node child: node.children){
          ceilAndFloor1(child, data);
      }
  }

  static class CFMover {
      int ceil = Integer.MAX_VALUE;
      int floor = Integer.MIN_VALUE;
  }
  
  public static void ceilAndFloor2(Node node, int data, CFMover cfmover){
      if(node.data > data){
          // valid for ceil
          if(node.data < cfmover.ceil){
              cfmover.ceil = node.data;
          }
      }

      if(node.data < data){
          // relevant for floor

        if(node.data > cfmover.floor){
            cfmover.floor = node.data;
        }
      }

      for(Node child: node.children){
          ceilAndFloor2(child, data, cfmover);
      }
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
    secondLargest(root);
    // System.out.println(largest + " " + slargest);

    MoverForSlargest mover = new MoverForSlargest();
    slargest2(root, mover);
    // System.out.println(mover.largest + " " + mover.slargest);


    int d = Integer.parseInt(br.readLine());
    // ceilAndFloor1(root, d);
    // System.out.println("Ceil = " + ceil);
    // System.out.println("Floor = " + floor);
    
    CFMover cfmover = new CFMover();
    ceilAndFloor2(root, d, cfmover);
    System.out.println("CEIL = " + cfmover.ceil);
    System.out.println("FLOOR = " + cfmover.floor);
  }

}