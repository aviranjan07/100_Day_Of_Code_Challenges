/*
Q.Hightest_frequency_character
simple input-
zmszeqxllzvheqwrofgcuntypejcxovtaqbnqyqlmrwitc
simpleoutput-
q
*/
import java.io.*;
import java.util.*;
public class Highest_Frequency_Character{
    public static void main(String[] args) throws Exception{
        // Write your code here 
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(hm.containsKey(ch)){
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch,nf);
            }else{
                hm.put(ch, 1);
            }
        }
        char mfc = str.charAt(0);
        for(Character Key: hm.keySet()){
            if(hm.get(Key) > hm.get(mfc)){
                mfc = Key;
            }
        }
        System.out.println(mfc);
    }
}