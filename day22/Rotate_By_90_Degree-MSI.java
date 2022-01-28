/* Q. rotate by 90 degre 
input - 
4
11 12 13 14 
21 22 23 24 
31 32 33 34 
41 42 43 44
output- 
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14
*/
import java.io.*;
import java.util.*;

public class Rotate_By_90_Degree {

  public static void main(String[] args) throws Exception {
    // write your code here
     Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int[][] arr = new int[n][n];
      for(int i = 0; i < arr.length; i++){
          for(int j = 0; j < arr[0].length; j++){
              arr[i][j] = scn.nextInt();
          }
      }
      //transpose
      for(int i = 0; i < arr.length; i++){
          for(int j = i; j < arr[0].length; j++){
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
          }
      }
      //reverse colums 
      for(int i = 0; i < arr.length; i++){
          int left = 0;
          int right = arr[i].length - 1;
          while(left < right){
              int temp = arr[i][left];
              arr[i][left] = arr[i][right];
              arr[i][right] = temp;
              left++;
              right--;
          }
      }
    //   print 
    display(arr);
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }

}