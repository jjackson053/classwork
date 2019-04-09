package homework6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Video5 {
    public static void main(String[] args) {
        //HashSet does not retain order
        //Set<String> set1= new HashSet<>();

        //Linked HashSet remembers the order you add items in
        //Set<String> set1= new LinkedHashSet<>();

        //TreeSet sorts in natural order
        Set<String> set1= new TreeSet<>();

       if(set1.isEmpty()){
           System.out.println("set is empty at start");
       }

        set1.add("dog");
        set1.add("cat");
        set1.add("mouse");
        set1.add("snake");
        set1.add("bear");

        //Adding diplicate items does nothing
        set1.add("mouse");

        System.out.println(set1);


        for(String element: set1){
            System.out.println(element);
        }

        if(set1.contains("aardvark")){
            System.out.println("contains aardvark");
        }



        Set<String> set2= new TreeSet<>();

        if(set1.isEmpty()){
            System.out.println("set is empty at start");
        }

        set2.add("dog");
        set2.add("cat");
        set2.add("giraffe");
        set2.add("monkey");
        set2.add("ant");


        Set<String> intersection = new HashSet<>(set1);

        intersection.retainAll(set2);

        System.out.println(intersection);




        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);



    }
}
