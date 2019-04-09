package homework5;

public class Student extends Person implements Learner{
   private double totalStudyTime;


    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public Student(long id, String personName, double totalStudyTime) {
        super(id, personName);
        this.totalStudyTime = totalStudyTime;


    }
    public void learn(double numberOfHours){
        double studyTime= numberOfHours + getTotalStudyTime();
        System.out.println(studyTime);
    }
}
