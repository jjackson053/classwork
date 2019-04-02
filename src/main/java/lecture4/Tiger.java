package lecture4;

public class Tiger extends Feline{
    private int tailLength;

    public Tiger(String name, String food, String breed, String gender, int tailLength) {
        super(name, food, breed, gender);
        this.tailLength = tailLength;
    }
    public String eat(){
        return "tigers eat " + getFood();
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "tailLength=" + tailLength +
                '}';
    }
}
