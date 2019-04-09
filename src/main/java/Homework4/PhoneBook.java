package Homework4;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private String name;
    private String phoneNumber;

    public PhoneBook() {
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
    Map<String, String> contacts =new HashMap<>();

    public void add(String name, String phoneNumber){
        contacts.put(name, phoneNumber);

    }

    public void remove(String name){
        contacts.remove(name);
    }
    public boolean hasEntry(String name){
        return contacts.containsKey(name);
    }
     public String lookup(String name){
         return contacts.get(name);
    }
    void reverseLookup(String phoneNumber){
    if (contacts.containsValue(phoneNumber)){
        for(Map.Entry<String ,String> entry : contacts.entrySet()){
            if(entry.getValue().equals(phoneNumber)){
                System.out.println(entry.getKey());
            }
        }
    }

    }

}
