/* Q.Digit Frequency

 input - 7654636 , 6
 output - 3

*/ 

import java.util.*;

public class digit_frequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int num, int dig) {
        
        int f = 0;
         while(num > 0){
             int rem = num % 10;
             num = num / 10;

             if(rem == dig){
                 f++;
             }
         }
         return f;
    }
}