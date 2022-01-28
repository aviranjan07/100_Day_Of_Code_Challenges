/*Q. Print Permutations
simple input-
abc
simple output-
abc
acb
bac
bca
cab
cba
*/
import java.io.*;
import java.util.*;

public class Print_Permutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printPermutations(str, "");
    }

    public static void printPermutations(String ques, String asf) {
        if(ques.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i = 0; i < ques.length(); i++){
            char ch = ques.charAt(i);
            String qlpart = ques.substring(0 , i);
            String qrpart = ques.substring(i + 1);
            String roq = qlpart + qrpart;
            printPermutations(roq , asf + ch);
        }
    }

}

//today- 1.print Encodings 2.Print Permutations