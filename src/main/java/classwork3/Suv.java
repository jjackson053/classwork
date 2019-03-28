package classwork3;

public class Suv extends Car {
    private int amountOfSeats;

    public Suv(String color, int wheel, int doors, int windows, String brandName, String speed, int amountOfSeats) {
        super(color, wheel, doors, windows, brandName, speed);
        this.amountOfSeats = amountOfSeats;
    }

    @Override
    public String toString() {
        return "Suv{" +
                "amountOfSeats=" + amountOfSeats +
                '}';
    }
    public String printVehicle(){
        return " this suv has " + amountOfSeats + " seats in it.";
    }
}
