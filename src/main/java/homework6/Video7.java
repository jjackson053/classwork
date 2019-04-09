package homework6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class reverseAlphabeticalComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {

        return -o1.compareTo(o2);
    }
}


    public class Video7 {
        public static void main(String[] args) {
            List<String> animals = new ArrayList<>();
            animals.add("cat");
            animals.add("elephant");
            animals.add("tigers");
            animals.add("lion");
            animals.add("snake");
            animals.add("mongoose");

            //Collections.sort(animals, new StringLengthComparator());
            Collections.sort(animals, new reverseAlphabeticalComparator());

            for (String animal : animals) {
                System.out.println(animal);
            }
            List<Integer> numbers = new ArrayList<>();
            numbers.add(3);
            numbers.add(1);
            numbers.add(36);
            numbers.add(73);
            numbers.add(40);

            Collections.sort(numbers, new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return -o1.compareTo(o2);
                }
            });

            for (Integer number : numbers) {
                System.out.println(number);
            }

        }
    }
