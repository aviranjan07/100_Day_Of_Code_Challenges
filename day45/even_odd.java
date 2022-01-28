import java.util.*;

public class even_odd {

    public static void main(String[] args) {
        // Write your code here
        Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();
      
       if( n % 2 == 0){
           System.out.println("even");
       }else{
           System.out.println("odd");
       }
      
    }
}