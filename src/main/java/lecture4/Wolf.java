package lecture4;

public class Wolf extends Canine {
    private int Age;

    public Wolf(String name, String food, String gender, String breed, int age) {
        super(name, food, gender, breed);
        Age = age;
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "Age=" + Age +
                '}';
    }

    public String eat(){
        return "Wolf eat " + getFood();
    }
}
