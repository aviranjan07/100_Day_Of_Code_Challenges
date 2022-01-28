import java.util.*;

public class number_3k {

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
      
       if (n % 3 == 0){
            System.out.println("3k");
       }else if( n % 3 == 1){
           System.out.println("3k + 1");
       }else if (n % 3 == 2){
           System.out.println("3k + 2");
       }
    }
}