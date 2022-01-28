/* sum of two arary
input -
5 (first 5 number)
3
1
0
7
5
6 (second 6 number)
1
1
1
1
1
1
output-
1
4
2
1
8
6
*/
import java.io.*;
import java.util.*;

public class Sum_Of_Two_Arrays {

  public static void main(String[] args) throws Exception {
   
     Scanner scn = new Scanner(System.in);
      //first array ready
     int n1 = scn.nextInt();
     int[] one = new int[n1];
     for(int i = 0; i < one.length; i++){
         one[i] = scn.nextInt();
     }
     //second array ready
     int n2 = scn.nextInt();
     int[] two = new int[n2];
     for(int i = 0; i < two.length; i++){
         two[i] = scn.nextInt();
     }
    //  sum
    int[] sum = new int[n1  > n2? n1: n2];
      int c = 0;

      int i = one.length - 1;
      int j = two.length - 1;
      int k = sum.length - 1;

      
      while(k >= 0){
        int d = c;
        if(i >= 0){
            d = d + one[i];
        }
        if(j >= 0){
            d = d + two[j];
        }
        c = d / 10;
        d = d % 10;
        sum[k] = d;

        i--;
        j--;
        k--;

      }
      if(c != 0){
          System.out.println(c);
      }
        for(int val: sum){
            System.out.println(val);
        }
      }
  }

// today - 1. bar chart  2.difference of arrays 3.reverse an array 4.rotate an array 5.sum of two arary 