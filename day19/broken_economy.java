/* Q.broken economy
input--
0
1
5
10
15
22
33
40
42
55
66
34 ka floor and seil
output - 
40(seil)
33(floor)
*/
import java.io.*;
import java.util.*;

public class broken_economy {

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int[] arr = new int[n];

     for(int i = 0; i < arr.length; i++){
       arr[i] = scn.nextInt();
     }
     int data = scn.nextInt();

     int left = 0;
     int right = arr.length - 1;
     int seil = -1;
     int floor = -1;
     while(left <= right){
       int mid = (left + right) / 2;

       if(data > arr[mid]){
           left = mid + 1;
           floor = arr[mid]; 
       }else if(data < arr[mid]){
           right = mid - 1;
           seil = arr[mid];
       }else{
         seil = arr[mid];
         floor = arr[mid];
         break;
       }
     }
     System.out.println(seil);
     System.out.println(floor);
  }

}