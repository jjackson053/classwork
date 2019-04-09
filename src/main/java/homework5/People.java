package homework5;

import java.util.ArrayList;

public class People {

        ArrayList<Person> personList = new ArrayList<>();


    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        Person givePerson = null;
        for(Person value : personList){
            if(value.equals(id)){
                givePerson = value;
            }
        }
        return givePerson;
      }


    public boolean getPersonList() {
        for (Person person: personList){
           return personList.contains(person);
        }
        return false;
    }

    public void remove(Person person){
       personList.remove(person);
    }
    public void remove(long id){
        for(Person value : personList){
            if (value.getId() == id){
               personList.remove(value);
    }
}
    }
    public void removeALL(){
        personList.removeAll(personList);
    }
    public int count(){
         return personList.size();
    }
    public Object[] toArray(){
        return personList.toArray();
    }
}


