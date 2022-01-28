// Q3. Rotate a number 
// input - 65473 , 2 se rotate karna hai
// output - 73654
import java.util.*;
   
   public class rotate_a_number{
   
   public static void main(String[] args) {
     // write your code here 
     Scanner scn = new Seanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();

     int nod = 0;
     int temp = n;
     while(temp != 0){
         temp = temp /10;
         nod++;
     }
     int div = 1;
     int mult = 1;
     for(int i = 1; i <= nod; i++){
         if(i <= k){
             div = div * 10;
         }else{
             mult = mult * 10;
         }
     }
        int q = n /div;
        int r = n % div;
        int ans = r * mult + q;
        System.out.println(ans);
    }
   }
   // 1.Inverce of a number 2.reverce a number 3.Rotate a number