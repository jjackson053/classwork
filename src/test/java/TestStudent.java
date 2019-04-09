import homework5.Learner;
import homework5.Person;
import homework5.Student;
import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
       // Given
        Student jame = new Student(242342342,"james",4);
        boolean expected = true;

        //when
        boolean actual = jame instanceof Learner;

        //then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testInheritance(){
        Student mike = new Student(23423445, "mike", 8);
        boolean expected =true;

        //when
        boolean actual = mike instanceof Person;

        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void testLearn(){
        //Given
        Student jeff = new Student(934535223,"Jeff", 9.0);
        double expected = 9.0;

        //when
        jeff.learn(9.0);
        double actual = jeff.getTotalStudyTime();

        //then
        Assert.assertEquals(expected,actual,.001);
    }
}
