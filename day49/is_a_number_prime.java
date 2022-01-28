import java.util.*;

public class Is_a_Number_Prime {

  public static void main(String[] args) {
    // Write your code here
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for(int i = 1; i <= t; i++){
        int x = scn.nextInt();
      boolean isPrime = true;
        int div = 2;
        while(div * div <= x){
            int rem = x % div;
            if(rem == 0){
            isPrime = false;
            break;
            }
            div++;
        }
        if(isPrime == true){
        System.out.println("Prime");
        }else{
        System.out.println("Not Prime");
        }
    }

  }
}




















