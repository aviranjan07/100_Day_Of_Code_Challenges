// introduction_and_usage_og_heaps
import java.io.*;
import java.util.*;
public class introduction_and_usage_og_heaps {
    public static void main (String[] args) throws Exception{
    //    Write your code here 
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      int[] ranks = {23, 45, 67, 78, 68, 40, 90,};

      for(int val:ranks){
          pq.add(val);
      }

      while(pq.size() > 0){
          System.out.println(pq.peek());
          pq.remove();
      }
    } 
}