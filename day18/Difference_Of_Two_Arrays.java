/* Q. difference of arrays
input - 
3 (first)
2
6
7
4 (second)
1
0
0
0
output - 
7
3
3
*/

import java.io.*;
import java.util.*;

public class Difference_Of_Two_Arrays {

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
    //difference
    int[] diff = new int[n2];

    int i = one.length - 1;
    int j = two.length - 1;
    int k = diff.length - 1;

     int c = 0;
      while(k >= 0){
          int d = two[j] - c;
          if(i >= 0){
              d = d - one[i];
          }
          if(d < 0){
              d = d + 10;
              c = 1;
          }else{
              c = 0;
          }
          diff[k] = d;
          i--;
          j--;
          k--;
      }
      int idx = 0;
      while(idx < diff.length){
          if(diff[idx] != 0){
              break;
          }else{
              idx++;
          }
      }
      while(idx < diff.length){
          System.out.println(diff[idx]);
          idx++;
      }
  }

}