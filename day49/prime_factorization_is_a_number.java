/*
Q. prime factorization is a number 
simple input-
1440
output-
2 2 2 2 2 3 3 5
*/
import java.util.*;

public class prime_factorization_is_a_number {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i = 2; i * i <= n; i++){
            while(n % i == 0){
                System.out.print(i + " ");
                n = n / i;
            }
        }
        
        if(n != 1)
            System.out.print(n);
	}
}



                        


                        
                        
                                