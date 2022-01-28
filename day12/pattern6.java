/* Q.pattern 6 , when input is 5 
* * *  * * *
* *      * *
*          *
* *      * *
* * *  * * * 
*/

import java.util.*;

public class pattern6 {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int nosp = 1;
        int nost = n / 2 + 1;

     for(int i = 1; i <= n; i++){
         for(int j = 1; j <= nost; j++){
             System.out.print("*\t");
         }
         for(int j = 1; j <= nosp; j++){
             System.out.print("\t");
         }
         for( int j = 1; j <= nost; j++){
             System.out.print("*\t");
         }
         if(i <= n/2){
             nosp+= 2;
             nost--;
         }else{
             nosp -= 2;
             nost++;
         }
        System.out.println(); 
     }  
     

  }
}
// aviranjan07