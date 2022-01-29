/* Q3. Rotate a number 
 input - 65473 , 2 se rotate karna hai
 output - 73
*/
import java.util.*;

public class rotate_a_number {

  public static void main(String[] args) {
    // Write your code here
   Scanner scn = new Scanner(System.in);
   int n = scn.nextInt();
   int k = scn.nextInt();

 //find deviser
   int nod = 0;
   int temp = n;
   while(temp != 0){
      temp = temp / 10;
      nod++;
   }
   if(0 <= k){

   }

  }
}

// today- 1.Count digits in a number 2.Digits Of A Number 3.Inverce of a number 4.Is a number prime  5.Rotate a number  