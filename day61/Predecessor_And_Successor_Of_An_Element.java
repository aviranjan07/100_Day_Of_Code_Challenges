// some issue 
/*
Q.Predecessor_And_Successor_Of_An_Element
simple input-
24
10 20 -50 -1 60 -1 -1 30 70 -1 -80 110 -1 -120 -1 -1 90 -1 -1 40 -100 -1 -1 -1
-120

simple output-
Predecessor = 110
Successor = 90
*/

import java.io.*;
import java.lang.Thread.State;
import java.util.*;

public class Predecessor_And_Successor_Of_An_Element {
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

  static Node predecessor;
  static Node successor;
  static int state;
  public static void predecessorAndSuccessor(Node node, int data) {
    // write your code here
    if(state == 0){
      if(node.data == data){
        state = 1;
      }else{
        predecessor = node;
      }
    }else if(state == 1){
      successor = node;
      state = 2;
    }
    for(Node child: node.children){
      predecessorAndSuccessor(child, data);
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

    int data = Integer.parseInt(br.readLine());

    Node root = construct(arr);
    predecessor = null;
    successor = null;
    state = 0;
    predecessorAndSuccessor(root, data);
    if(predecessor == null){
      System.out.println("Predecessor = Not found");
    } else {
      System.out.println("Predecessor = " + predecessor.data);
    }

    if(successor == null){
      System.out.println("Successor = Not found");
    } else {
      System.out.println("Successor = " + successor.data);
    }
  }

}
// today- 1.Ceil_And_Floor_In_Generic_Tree 2.Is_Generic_Tree_Symmetric 3.Kth_Largest_Element_In_Tree 4.Predecessor_And_Successor_Of_An_Element