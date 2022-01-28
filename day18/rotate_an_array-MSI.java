/* Q. rotate an array 
input-
5 number
1
2
3
4
5
3 se rotate 
output--
3 4 5 1 2
*/
import java.io.*;
import java.util.*;

public class rotate_an_array {
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }
  public static void reverse(int[] arr, int low,int hi){
      while(low <= hi){
          int temp = arr[low];
          arr[low] = arr[hi];
          arr[hi] = temp;

          low++;
          hi--;
      }
  }

  public static void rotate(int[] a, int k){
    // write your code here
    k = k % a.length;
     if(k < 0){
         k = k + a.length;
     }

    reverse(a, 0, a.length - 1 - k);
    reverse(a, a.length - k, a.length - 1);
    reverse(a, 0, a.length - 1);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}