/*
Q.Write_Priority_Queue_Using_Heap
simple input-
add 10
add 20
add 30
add 40
peek
add 50
peek
remove
peek
remove
peek
remove
peek
remove
peek
simple output-
10
10
10
20
20
30
30
40
40
50
quit
*/
import java.io.*;
import java.util.*;

public class Write_Priority_Queue_Using_Heap {

  public static class PriorityQueue {
    ArrayList<Integer> data;

    public PriorityQueue() {
      data = new ArrayList<>();
    }

    public void add(int val) {
      // write your code here
      data.add(val);
      upheapify(data.size() - 1);
    }
    private void upheapify(int i){
        if(i == 0){
            return;
        }

        int pi = (i - 1) / 2;
        if(data.get(i) < data.get(pi)){
            swap(i, pi);
            upheapify(pi);
        }
    }
    private void swap (int i , int j){
        int ith = data.get(i);
        int jth = data.get(j);
        data.set(i, jth);
        data.set(j, ith);
    }

    public int remove() {
      // write your code here
      if(this.size() == 0){
        System.out.println("Underflow");
        return -1;
    }
    swap(0, data.size() - 1);
    int val = data.remove(data.size() - 1);
    downheapify(0);
    return val;
  }

  private void downheapify(int pi){
     int mini = pi;

     int li = 2 * pi + 1;
     if(li < data.size() && data.get(li) < data.get(mini)){
         mini = li;
     }

     int ri = 2 * pi + 2;
     if(ri < data.size() && data.get(ri) < data.get(mini)){
         mini = ri;
     }
   
      if(mini != pi){
          swap(pi, mini);
          downheapify(mini);
      }

  }

    public int peek() {
      // write your code here
      if(this.size() == 0){
          System.out.println("Underflow");
          return -1;
      }
      return data.get(0);
      
    }

    public int size() {
      // write your code here
      return data.size();
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    PriorityQueue qu = new PriorityQueue();

    String str = br.readLine();
    while (str.equals("quit") == false) {
      if (str.startsWith("add")) {
        int val = Integer.parseInt(str.split(" ")[1]);
        qu.add(val);
      } else if (str.startsWith("remove")) {
        int val = qu.remove();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("peek")) {
        int val = qu.peek();
        if (val != -1) {
          System.out.println(val);
        }
      } else if (str.startsWith("size")) {
        System.out.println(qu.size());
      }
      str = br.readLine();
    }
  }
}