/* Q. search in a sorted array 
input-
4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 42 44 
let's find out 31
output -
3,1
*/

import java.io.*;
import java.util.*;

public class Search_In_A_Sorted_2d_Array {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();

     int[][]arr = new int[n][n];
     for(int i = 0; i < arr.length; i++){
         for(int j = 0; j < arr[0].length; j++){
             arr[i][j] = scn.nextInt();
         }
     }
     int x = scn.nextInt();

     int i = 0;
     int j = arr[0].length - 1;
     while(i < arr.length && j >= 0){
         if(x > arr[i][j]){
             i++;
         }else if(x < arr[i][j]){
             j--;
         }else{
             System.out.println(i);
             System.out.println(j);
             return;
         }
     }
     System.out.println("Not Found");
  }

}