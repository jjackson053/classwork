package lecture4;

public abstract class  Canine extends Animal {
    public Canine(String name, String food, String gender, String breed) {
        super(name, food, breed, gender);
    }
    public abstract String eat();
}
