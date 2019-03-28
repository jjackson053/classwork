package classwork3;

public class Vehicle {
    private String color;
    private int wheel;
    private  int doors;
    private int windows;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "color='" + color + '\'' +
                ", wheel=" + wheel +
                ", doors=" + doors +
                ", windows=" + windows +
                '}';
    }

    public Vehicle(String color, int wheel, int doors, int windows) {
        this.color = color;
        this.wheel = wheel;
        this.doors = doors;
        this.windows = windows;
    }
    public String printVehicle(){
        return "the vehicle is a";
    }
}
