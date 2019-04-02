package lecture4;

public abstract class Robot {
    private String robotName;
    private String creator;


    public String getRobotName() {
        return robotName;
    }

    public void setRobotName(String robotName) {
        this.robotName = robotName;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Robot(String robotName, String creator) {
        this.robotName = robotName;
        this.creator = creator;
    }
}
