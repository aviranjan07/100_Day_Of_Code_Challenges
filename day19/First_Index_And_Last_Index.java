/* Q. first index and last index 
input --
15(number)
1
5
10
15
22
33
33
33
33
33
40
42
55
66
77
33 ka first and last index
output--
5
9
*/
import java.util.*;

public class First_Index_And_Last_Index {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
         int[] arr = new int[n];

         for(int i = 0; i < arr.length; i++){
             arr[i] = scn.nextInt();
         } 
        int data = scn.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int fi = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(data > arr[mid]){
                left = mid + 1;
            }else if (data < arr[mid]){
                right = mid - 1;
            }else{
                fi = mid;
                right = mid - 1;
            }
        }
        System.out.println(fi);
      
       
         left = 0;
        right = arr.length - 1;
        int li = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(data > arr[mid]){
                left = mid + 1;
            }else if (data < arr[mid]){
                right = mid - 1;
            }else{
                li = mid;
                left = mid + 1;
            }
        } 
        System.out.println(li);
    }
}

