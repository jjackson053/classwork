package homework6;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Video4 {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();


        testMap(hashMap);

    }
   public static void testMap(Map<Integer,String>map){
        map.put(10,"fox");
       map.put(6,"wolf");
       map.put(7,"cat");
       map.put(3,"dog");
       map.put(2,"lion");
       map.put(0,"ape");
       map.put(9,"tiger");

       for(Integer key : map.keySet()) {
       String value = map.get(key);
           System.out.println(key + ": "+ value);
       }


   }
}
