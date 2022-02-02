/*
Q.Pivot_In_Sorted_And_Rotated_Array
simple input-
9
15
16
19
21
23
24
1
2
12
simple output-
1
*/
import java.io.*;
import java.util.*;

public class Pivot_In_Sorted_And_Rotated_Array {

  public static int findPivot(int[] arr) {
    // write your code here
    int lo = 0;
    int hi = arr.length - 1;

    while(lo < hi){
      int mid = (lo + hi) / 2;
      if(arr[mid] < arr[hi]){
        hi = mid;
      }else {
        lo = mid + 1;
      }
    }
    return arr[hi];
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
  }

}