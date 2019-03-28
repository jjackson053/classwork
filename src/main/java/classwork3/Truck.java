package classwork3;

public class Truck extends Car{
    private String usage;
    private int weightCarry;

    public Truck(String color, int wheel, int doors, int windows, String brandName, String speed, String usage, int weightCarry) {
        super(color, wheel, doors, windows, brandName, speed);
        this.usage = usage;
        this.weightCarry = weightCarry;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "usage='" + usage + '\'' +
                ", weightCarry=" + weightCarry +
                '}';
    }
    @Override
    public String printVehicle(){
        return "this truck can" + usage + "and can carry" + weightCarry;
    }
}
