package homework6;

import java.util.HashMap;
import java.util.Map;

public class Video3 {
    public static void main(String[] args) {


    HashMap<Integer, String> map = new HashMap();

    map.put(5,"five");
    map.put(4,"four");
    map.put(6,"six");
    map.put(1,"one");
    map.put(3,"five");


    String text = map.get(4);
        System.out.println(text);

     for(Map.Entry<Integer,String> entry: map.entrySet()){
         int key= entry.getKey();
         String value = entry.getValue();
         System.out.println(key + ": " + value);
     }

    }
}