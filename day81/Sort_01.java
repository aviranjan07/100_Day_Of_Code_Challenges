/*
Q.Sort_01
simple input-
5
0
1
0
1
0
simple output-
Swapping index 0 and index 0
Swapping index 2 and index 1
Swapping index 4 and index 2
0
0
0
1
1
*/
import java.io.*;
import java.util.*;

public class Sort_01 {

  public static void sort01(int[] arr){
    //write your code here
    int i = 0;
    int j = 0;
    while(i < arr.length){
      if(arr[i] == 1){
        i++;
      }else{
        swap(arr, i, j);
        i++;
        j++;
      }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort01(arr);
    print(arr);
  }

}