import Homework4.PhoneBook;
import org.junit.Assert;
import org.junit.Test;

public class PhonebookTest {
    @Test
    public void addTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String expected= "302-568-2198";

        //when
         phoneBook.add("mike","302-568-2198");
        String actual = phoneBook.lookup("mike");

         // then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void removeTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        boolean expected = false;

        //when
        phoneBook.remove("mike");
        boolean actual = phoneBook.hasEntry("mike");

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void hasEntryTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        boolean expected= false;


        //when
       phoneBook.add("mike ", "302-444-6943");
        boolean actual =  phoneBook.hasEntry("mike");

        //then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void lookUpTest(){
        //Given
        PhoneBook phoneBook = new PhoneBook();
        String expected = "302-454-6928";

        //when
        phoneBook.add("mike", "302-454-6928");
        String actual = phoneBook.lookup("mike");

        //then
        Assert.assertEquals(expected,actual);

    }
}
