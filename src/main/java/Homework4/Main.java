package Homework4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
      PhoneBook book = new PhoneBook();
       book.add("Jake", "302-444-6943");
       book.add("mike", "302-568-2198");
       book.add("mark", "302-222-0932");
       book.add("kate", "302-535-2039");
       book.remove("mike");
      book.hasEntry("jake");
       book.lookup("mark");
       book.reverseLookup("302-535-2039");
        System.out.println(book.contacts);
    }
}
