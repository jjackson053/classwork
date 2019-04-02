package lecture4;

public class Dog extends Canine implements Pet{
         private String furColor;

    public Dog(String name, String food, String breed, String furColor, String gender) {
        super(name, food, gender, breed);
    this.furColor = furColor;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "furColor='" + furColor + '\'' +
                '}';
    }

    @Override
    public String eat(){
        return "the dog eats " + getFood();
    }
    public String familyName(){
        return " the dogs family name is " + getName();
    }
    public String home(){
        return getName() + " lives in a home.";
    }
}
