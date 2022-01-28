import java.util.*;

public class pattern16 {

/*  pattern 16, when input is 5 
1								1	
1	2						2	1	
1	2	3				3	2	1	
1	2	3	4		4	3	2	1	
1	2	3	4	5	4	3	2	1
*/	
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();

      int sp = n * 2 - 3;
      int st = 1;

       for(int i = 1; i <= n; i++){
           int val = 1;
           for(int j = 1; j <= st; j++){
               System.out.print(val + "\t");
               val++;
           }
           for(int j = 1; j <= sp; j++){
               System.out.print("\t");
           }
           if(i == n){
             st--;
             val--;
           }

           for(int j = 1; j <= st; j++){
               val--;
               System.out.print(val + "\t");
           }
           sp-=2;
           st++;
           System.out.println();
       }  

  }
}