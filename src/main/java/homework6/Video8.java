package homework6;

import java.util.*;
class car implements Comparable<car>{
    private String name;
    public car (String name){
        this.name=name;
    }
    public String toString(){
        return name;
    }

    @Override
    public int compareTo(car o) {
        int len1 = name.length();
        int len2 = o.name.length();

        if(len1>len2){
            return 1;
        }
        else if (len1<len2){
            return -1;
        }
        else {
            return name.compareTo(o.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        car car = (car) o;
        return Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

public class Video8 {
    public static void main(String[] args) {
        List<car> list = new ArrayList<>();
        SortedSet<car> set = new TreeSet<>();

        addElement(list);
        addElement(set);

        Collections.sort(list);

        showElement(list);
        System.out.println();
        showElement(set);

    }
    private static void addElement(Collection<car> co1){
        co1.add(new car("joe"));
        co1.add(new car("Bob"));
        co1.add(new car("Juliet"));
        co1.add(new car("Clare"));
        co1.add(new car("Mike"));
    }

    private static void showElement(Collection<car> co1){
        for(car element: co1) {
            System.out.println(element);
        }
    }
}
