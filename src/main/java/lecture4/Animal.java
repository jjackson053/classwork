package lecture4;

public abstract class Animal {
    private String name;
    private String food;
    private String breed;
    private String gender;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public Animal(String name, String food, String breed, String gender) {
        this.name = name;
    this.food = food;
    this.breed = breed;
    this.gender = gender;
    }
    public abstract String eat();

    @Override    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", food='" + food + '\'' +
            '}';

}
}
