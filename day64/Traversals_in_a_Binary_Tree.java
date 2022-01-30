/*
Q.Traversals_in_a_Binary_Tree
simple input-
19
50 25 12 n n 37 30 n n n 75 62 n 70 n n 87 n n

output-
50 in preorder
25 in preorder
12 in preorder
12 in inorder 
12 in postorder
25 in inorder
37 in preorder
30 in preorder
30 in inorder
30 in postorder
37 in inorder
37 in postorder
25 in postorder
50 in inorder
75 in preorder
62 in preorder
62 in inorder
70 in preorder
70 in inorder
70 in postorder
62 in postorder
75 in inorder
87 in preorder
87 in inorder
87 in postorder
75 in postorder
50 in postorder

*/
import java.io.*;
import java.util.*;

public class Traversals_in_a_Binary_Tree {
  public static class Node {
    int data;
    Node left;
    Node right;

    Node(int data, Node left, Node right) {
      this.data = data;
      this.left = left;
      this.right = right;
    }
  }

  public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }

  public static Node construct(Integer[] arr) {
    Node root = new Node(arr[0], null, null);
    Pair rtp = new Pair(root, 1);

    Stack<Pair> st = new Stack<>();
    st.push(rtp);

    int idx = 0;
    while (st.size() > 0) {
      Pair top = st.peek();
      if (top.state == 1) {
        idx++;
        if (arr[idx] != null) {
          top.node.left = new Node(arr[idx], null, null);
          Pair lp = new Pair(top.node.left, 1);
          st.push(lp);
        } else {
          top.node.left = null;
        }

        top.state++;
      } else if (top.state == 2) {
        idx++;
        if (arr[idx] != null) {
          top.node.right = new Node(arr[idx], null, null);
          Pair rp = new Pair(top.node.right, 1);
          st.push(rp);
        } else {
          top.node.right = null;
        }

        top.state++;
      } else {
        st.pop();
      }
    }

    return root;
  }

  public static void display(Node node) {
    if (node == null) {
      return;
    }

    String str = "";
    str += node.left == null ? "." : node.left.data + "";
    str += " <- " + node.data + " -> ";
    str += node.right == null ? "." : node.right.data + "";
    System.out.println(str);

    display(node.left);
    display(node.right);
  }

  public static void traversalsPre(Node node){
      if(node == null){
          return;
      }
      System.out.println(node.data + " in preorder"); // eular left
      traversalsPre(node.left);
      System.out.println(node.data + " in inorder"); // eular between
      traversalsPre(node.right);
      System.out.println(node.data + " in postorder"); // eular right
  }
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    Integer[] arr = new Integer[n];
    String[] values = br.readLine().split(" ");
    for (int i = 0; i < n; i++) {
      if (values[i].equals("n") == false) {
        arr[i] = Integer.parseInt(values[i]);
      } else {
        arr[i] = null;
      }
    }

    Node root = construct(arr);
    traversalsPre(root);
  }

}

// today- 1.binary_tree_constructor 2.Display_A_Binary_Tree 3.introduction_to_binary_tree 4.Size_Sum_Maximum_And_Height_Of_A_Binary_Tree 5.Traversals_in_a_Binary_Tree