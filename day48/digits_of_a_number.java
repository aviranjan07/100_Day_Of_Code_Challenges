 /*
 Q.Digits Of A Number
 simple input-
 65784383
 simple output-
6
5
7
8
4
3
8
3
 */
 import java.util.*;
    
 public class digits_of_a_number {
 
     public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
 
         int power = 1;
         int temp = n;
         while (temp >= 10) {
             temp /= 10;
             power *= 10;
         }
 
         temp = n;
         while(power != 0){
             int digit = temp / power;
             System.out.println(digit);
 
             temp = temp % power;
             power = power / 10;
         }
     }
 }