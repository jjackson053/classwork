package lecture4;

public abstract class Feline extends Animal {
    public Feline(String name, String food, String breed, String gender) {
        super(name, food, breed, gender);

    }
    public abstract String eat();
}
