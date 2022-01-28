/*Q. fint element in array
input -
6 number 
15
30
40
4
11
9
40
output - 
2 index per hai 40
*/
import java.io.*;
import java.util.*;

public class Find_Element_In_An_Array {

  public static void main(String[] args) throws Exception {
    
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int[] arr = new int[n];

     for(int i = 0; i < arr.length; i++){
      arr[i] = scn.nextInt();
     }
     int num = scn.nextInt();
      int foundat = -1;
     for(int i = 0; i < arr.length; i++){
        if(arr[i] == num){
           foundat = i;
           break;
        }
     }
     System.out.println(foundat);
  }


}