package classwork;

public class Hero extends SuperHero {

    public Hero(String name,String[] specialPowers){
        super(specialPowers);
        this.name = name;
    }

   @Override
    public String printSuperPowers() {
    return super.printSuperPowers();

   }
}
