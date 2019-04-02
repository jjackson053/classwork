package lecture4;

public class Hippo extends Animal {
    private String weight;

    public Hippo(String name, String food, String breed, String gender, String weight) {
        super(name, food, breed, gender);
        this.weight= weight;
    }
    public String eat(){
        return "hippos eat " + getFood();
    }

    @Override
    public String toString() {
        return "Hippo{" +
                "weight='" + weight + '\'' +
                '}';
    }
}
