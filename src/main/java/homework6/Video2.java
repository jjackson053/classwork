package homework6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Video2 {
    public static void main(String[] args) {
      /*
      ArrayList manage arrays internally.
      [0][1][2][3][4][5] ...
      */
      List<Integer> arrayList = new ArrayList<>();
      /*
      LinkedLists consists of elements where each element
      has a reference to the pervious and next element
      [0]->[1]->{2] ....
      */
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);

    }
    private static void doTimings(String type, List<Integer> list) {

        for(int i =0; i< 1E5; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        /*
        //Add items at the end of the list
        for(int i=0; i< 1E5; i++){
            list.add(i);
        }
        */

        // add items elsewhere in list
         for(int i=0; i< 1E5; i++){
             list.add(0,1);
         }
        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}
