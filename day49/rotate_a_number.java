/* Q3. Rotate a number 
 input - 65473 , 2 se rotate karna hai
 output - 73
*/
import java.util.*;

public class rotate_a_number{

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
// today- 1.Gcd And Lcm  2. prime factorization is a number  3.print all primes till N 4.print fibonacci number till N 5.reverce a number 6.Rotate a number  