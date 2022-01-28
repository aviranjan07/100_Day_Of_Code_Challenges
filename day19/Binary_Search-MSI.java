/*Q. binary scarch 
input --
5 (numbers)
10
20
30
40
50
30(let's find out)
output- 2
*/

import java.util.*;

public class Binary_Search {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int[] arr = new int[n];

         for(int i = 0; i < arr.length; i++){
             arr[i] = scn.nextInt();
         } 
        int data = scn.nextInt();

        int lo = 0;
        int hi = arr.length - 1;
        int foundAt = -1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            
            if(data > arr[mid]){
                lo = mid + 1;
            }else if (data < arr[mid]){
                hi = mid - 1;
            }else{
                foundAt = mid;
                break;
            }
        }
        System.out.println(foundAt);
    }
}


    /* type -- 2 

import java.util.*;

public class Binary_Search {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = (10, 20, 30, 40, 50, 60, 70, 80, 90, 100);
        int data = 60;

        int lo = 0;
        int hi = arr.length - 1;
        while(lo <= hi){
            int mid = (lo + hi) / 2;
            
            if(data > arr[mid]){
                lo = mid + 1;
            }else if (data < arr[mid]){
                hi = mid - 1;
            }else{
               System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
*/