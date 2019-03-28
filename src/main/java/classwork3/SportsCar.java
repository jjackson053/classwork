package classwork3;

public class SportsCar extends Car {
    private int costOfCar;

    public SportsCar(String color, int wheel, int doors, int windows, String brandName, String speed, int costOfCar) {
        super(color, wheel, doors, windows, brandName, speed);
        this.costOfCar = costOfCar;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "costOfCar=" + costOfCar +
                '}';
    }
    public String printVehicle(){
        return "this sport car cost" + costOfCar;
    }
}
