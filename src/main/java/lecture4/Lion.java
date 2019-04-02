package lecture4;

public class Lion extends Feline {
    private int amountOfHunts;

    public Lion(String name, String food, String breed, String gender, int amountOfHunts) {
        super(name, food, breed, gender);
        this.amountOfHunts = amountOfHunts;
    }
    public String eat(){
        return " lions eat " + getFood();
    }

    @Override
    public String toString() {
        return "Lion{" +
                "amountOfHunts=" + amountOfHunts +
                '}';
    }
}
