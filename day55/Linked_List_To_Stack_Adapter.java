/*
Q.Linked_List_To_Stack_Adapter
simple input -
push 10
push 20
push 5
push 8
push 2
push 4
push 11
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
top
size
pop
quit

output-
11
7
11
4
6
4
2
5
2
8
4
8
5
3
5
20
2
20
10
1
10
*/
import java.io.*;
import java.util.*;

public class Linked_List_To_Stack_Adapter {

  public static class LLToStackAdapter {
    LinkedList<Integer> list;

    public LLToStackAdapter() {
      list = new LinkedList<>();
    }


    int size() {
      // write your code here
      return list.size();
    }

    void push(int val) {
      // write your code here
      list.addFirst(val);
    }

    int pop() {
      // write your code here
      if(size() == 0){
        System.out.println("Stack underflow");
        return -1;
      }else{
        return list.removeFirst();
      }
    }

    int top() {
      // write your code here
      if(size() == 0){
        System.out.println("Stack underflow");
        return -1;
      }else{
        return list.getFirst();
      }
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    LLToStackAdapter st = new LLToStackAdapter();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      }
      str = br.readLine();
    }
  }
}