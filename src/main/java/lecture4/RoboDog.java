package lecture4;

public class RoboDog extends Robot implements Pet {
         private String orders;

    public RoboDog(String robotName, String creator, String orders) {
        super(robotName, creator);
        this.orders = orders;
    }

    public String familyName() {
        return "the Robot dogs family name is " + getRobotName();
    }

    public String home() {
        return getRobotName() + " lives with there " + getCreator();
    }
}
