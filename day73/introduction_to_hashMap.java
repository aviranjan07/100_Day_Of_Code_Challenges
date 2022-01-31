// introduction_to_hashMap
import java.io.*;
import java.util.HashMap;
import java.util.*;

public class introduction_to_hashMap{
  public static void main(String[] args) throws Exception{
     HashMap <String, Integer> hm = new HashMap<>();        
        hm.put("india", 130);
        hm.put("china",140);
        hm.put("us", 40);
        hm.put("uk", 50);
        hm.put("thailand", 60);
       
       System.out.println(hm); 
      System.out.println();

       hm.put("australia", 70);
       hm.put("us", 80);
       System.out.println(hm);
      System.out.println();
      
       System.out.println(hm.get("india"));
       System.out.println(hm.get("pakistan"));
      System.out.println();

       System.out.println(hm.containsKey("india"));
       System.out.println(hm.containsKey("pakistan"));
       System.out.println();

       Set<String> Keys = hm.keySet();
       System.out.println(Keys);
       System.out.println();

       for(String Key: hm.keySet()){
           Integer Val = hm.get(Key);
           System.out.println(Key + " " + Val);
       }
    }
}

//today- 1.get_common_elements_1 2.get_common_elements_2 3.Hightest_frequency_character 4.introduction_to_hashMap