package classwork3;

public class MotorCycle extends Vehicle{
    private String motorCycleName;
    private int yearRelease;

    public MotorCycle(String color, int wheel, int doors, int windows, String motorCycleName, int yearRelease) {
        super(color, wheel, doors, windows);
        this.motorCycleName = motorCycleName;
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "motorCycleName='" + motorCycleName + '\'' +
                ", yearRelease=" + yearRelease +
                '}';
    }

    @Override
    public String printVehicle(){
        return "this motor is called " + motorCycleName;
    }
}
