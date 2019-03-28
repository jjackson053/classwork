package classwork3;

public class Main {
    public static void main(String[] args) {
     MotorCycle motorCycle = new MotorCycle("blue",2,0,0,"suzuki", 2004);
     Car car= new Car("black", 4 ,4,6,"nissan", "196mph");
     Suv suv = new Suv("red",4, 4,6,"honda","125mph", 6);
     Truck truck= new Truck("sliver",4,2,4,"chevei","130pmh", "moving",13000);
     SportsCar sportsCar= new SportsCar("yellow",4,2,4,"corvette","195mph",52000);

        System.out.println(motorCycle.printVehicle());
        System.out.println(car.printVehicle());
        System.out.println(suv.printVehicle());
        System.out.println(truck.printVehicle());
        System.out.println(sportsCar.printVehicle());
    }
}
