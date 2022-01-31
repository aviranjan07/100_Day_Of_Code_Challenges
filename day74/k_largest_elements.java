/*
Q.k_largest_elements
simple input-
13
12
62
22
15
37
99
11
37
98
67
31
84
99
4
simple output-
84
98
99
99
*/
import java.io.*;
import java.util.*;

public class k_largest_elements {

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int k = Integer.parseInt(br.readLine());
      // write your code here
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i = 0; i < arr.length; i++){
          if(i < k){
              pq.add(arr[i]);
          }else{
              if(arr[i] > pq.peek()){
                  pq.remove();
                  pq.add(arr[i]);
              }
          }
      }
      while(pq.size() > 0){
          System.out.println(pq.remove());
      }
    }

}