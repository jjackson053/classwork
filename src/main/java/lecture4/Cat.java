package lecture4;

public class Cat extends Feline implements Pet {
     private String colorPattern;


    public Cat(String name, String food,String breed, String gender,String colorPattern) {
        super(name,food,breed,gender);
        this.colorPattern= colorPattern;
    }
    public String eat() {
        return "cats eat " + getFood();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "colorPattern='" + colorPattern + '\'' +
                '}';
    }
    public String familyName(){
        return "the cats family name is " + getName();
    }
    public String home(){
        return  getName() + " doesn't have a home.";
    }

}
