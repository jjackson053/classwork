package homework6;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.LinkedList;

public class Video10 {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabit");

        Iterator <String> it = animals.iterator();
       while(it.hasNext()) {
           String value = it.next();
           System.out.println(value);
           if(value.equals("cat")){
              it.remove();
           }
       }
        System.out.println();


         // modern iteration, java 5 and later

        for(String animal : animals){
            System.out.println(animal);

            animals.remove(2);
        }

    }
}
