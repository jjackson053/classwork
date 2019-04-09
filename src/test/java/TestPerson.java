import homework5.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor(){
        //Given
        Person jack = new Person(234565345,"Jack");
        Person expected = jack;

        //when

        Person actual = jack;

        //then

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testSetName(){
        //Given
        Person john = new Person(234213244,"john");
       String expected = "mark";

       //when
        john.setPersonName("mark");
        String actual= john.getpersonName();

        //then
        Assert.assertEquals(expected,actual);
    }
}
