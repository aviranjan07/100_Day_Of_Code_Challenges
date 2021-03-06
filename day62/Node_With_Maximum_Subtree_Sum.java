/*
Q.Node_With_Maximum_Subtree_Sum
input-
20
10 20 -50 -1 60 -1 -1 30 -70 -1 80 -1 90 -1 -1 40 -100 -1 -1 -1

output-
30@130
*/
import java.io.*;
import java.util.*;

public class Node_With_Maximum_Subtree_Sum {
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

  // node 
  static int msn = 0;
  static int ms = Integer.MIN_VALUE;
  static int retSumAndCalculateMSST(Node node){
    int sum = 0;

      for(Node child : node.children){
        int csum = retSumAndCalculateMSST(child);
        sum += csum;
      }
      sum += node.data;

      if(sum > ms){
        msn = node.data;
        ms = sum;
      }
      return sum;
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
    retSumAndCalculateMSST(root);
    System.out.println(msn + "@" + ms);
    // write your code here
  }

}

// today- 1.Diameter_Of_Generic_Tree 2.Iterative_Preorder_And_Postorder_Of_Generic_Tree 3.Node_With_Maximum_Subtree_Sum