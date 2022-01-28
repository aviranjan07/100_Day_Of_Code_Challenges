/* Q. span of array 
input - 
6
15
30
40
4
11
9
output -
36
*/

import java.io.*;
import java.util.*;

public class Span_Of_Array {

public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

     for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
     }
     int min = arr[0];
     int max = arr[0];
     for(int i = 1; i < arr.length; i++){
         if(arr[i] < min){
             min = arr[i];
         }
         if(arr[i] > max){
             max = arr[i];
         }
     }
     int span = max - min;
     System.out.println(span);
 }

}