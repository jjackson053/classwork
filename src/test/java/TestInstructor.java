import homework5.*;
import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

  @Test
   public void testImplementation(){
      //Given
      Instructor angel =new Instructor(49583423,"angel");
      boolean expected= false;

      //when
      boolean actual = angel instanceof Teacher;

      //then
      Assert.assertEquals(expected, actual);
  }
  @Test
    public void testInheritance() {
      //Given
      Instructor michael = new Instructor(93827493,"michael");
      boolean expected = true;

      //when
      boolean actual = michael instanceof Person;

      //then
      Assert.assertEquals(expected,actual);

  }
  @Test
   public void testTeach(){
   //Given
     Instructor john =new Instructor(12944256,"john");
     Student kyle = new Student(6658986,"kyle",9.0);
     double Expected = 12.0;

     //when
      double hours = kyle.getTotalStudyTime();
      double numberofhours= 3.0;
      kyle.learn(numberofhours);

      double actual= kyle.getTotalStudyTime() + numberofhours;

      //then
      Assert.assertEquals(Expected,actual, .001 );
  }

  @Test
    public void testLecture(){
      Student jackson = new Student(24535646, "jake",9.0);
      
  }
}
