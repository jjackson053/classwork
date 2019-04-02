package lecture4;

public class Main {
    public static void main(String[] args) {
    Animal lol = new Tiger("fang", "meat", "N/A", "male", 3);
        System.out.println(lol.eat());
        Canine boi = new Dog("buddy", "bone", "beagle", "white and brown", "female");
        System.out.println(((Dog) boi).home());
     Robot god = new RoboDog("mx3", "John","barks");
    }
}
