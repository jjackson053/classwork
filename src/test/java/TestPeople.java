import homework5.People;
import homework5.Person;
import org.junit.Assert;
import org.junit.Test;

public class TestPeople {
    @Test
    public void testAdd(){
        //Given
        People people =new People();
        people.add(new Person(123,"John"));
         int expected = 1;

         //when
        int Actual = people.count();

        //then
        Assert.assertEquals(expected,Actual);

    }
    @Test
    public void testRemove(){
        //Given
        People people = new People();
        people.add(new Person(545, "will"));
        people.add(new Person(756,"cass"));

        int expect = 1;
        //when
        people.remove(545);
        int actual = people.count();
        //then
        Assert.assertEquals(expect,actual);
    }
}
