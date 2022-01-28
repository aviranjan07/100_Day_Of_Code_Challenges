/* Q.2d array demo 
2 - row
4 - col
11
12
13
14
21
22
23
24
output--
11 12 13 14
21 22 23 24
*/
import java.io.*;
import java.util.*;

public class twoD_Arrays_Demo {

  public static void main(String[] args) throws Exception {
    Scanner scn =  new Scanner(System.in);
     int n = scn.nextInt();
     int m = scn.nextInt();
     
     int[][] arr = new int[n][m];
      for(int i = 0; i < n; i++){
          for(int j = 0; j < m; j++){
              arr[i][j] = scn.nextInt();
          }
      }
      for(int i = 0; i < arr.length; i++){
          for(int j = 0; j < arr[i].length;j++){
              System.out.print(arr[i][j] + " ");
          }
          System.out.println();
      }
  }

}