import java.util.*;

public class Print_all_primes_Till_N {

  public static void main(String[] args) {
    // Write your code here

     Scanner scn = new Scanner(System.in);
     int low = scn.nextInt();
     int high = scn.nextInt();
     for(int n = low; n <= high; n++){
         boolean isPrime = true;
         int div = 2;
         while(div * div <= n){
             int rem = n % div;
             if(rem == 0){
                 isPrime = false;
                 break;
             }
             div++;
         }
         if(isPrime == true){
             System.out.println(n);
         }
     }
  }

}