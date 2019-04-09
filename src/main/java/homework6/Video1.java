package homework6;

import java.util.ArrayList;
import java.util.List;

public class Video1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        //adding
        numbers.add(10);
        numbers.add(100);
        numbers.add(40);

        //Retrieving
        System.out.println(numbers.get(0));
        System.out.println("interation #1: ");

        //Remove items
        numbers.remove(numbers.size() - 1);

        //this is VERY slow
        numbers.remove(0);


        //Indexed for loop iteration
        for(int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }
        System.out.println("interation #2: ");
        for(Integer value: numbers){
            System.out.println(value);
        }

        //more in video 2
        // List Interface...
        List<String> values = new ArrayList<>();

    }
}
