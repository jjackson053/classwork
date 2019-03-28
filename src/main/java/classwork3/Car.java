package classwork3;

public class Car extends Vehicle {
    private String brandName;
    private String speed;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public Car(String color, int wheel, int doors, int windows, String brandName, String speed) {
        super(color, wheel, doors, windows);
        this.brandName = brandName;
        this.speed = speed;
    }
    @Override
    public String printVehicle(){
        return " this cars brand is " + brandName+ " and it goes " + speed;
    }
}
