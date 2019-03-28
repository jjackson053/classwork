package classwork;

public class Hero2 extends SuperHero{
    public Hero2(String name, String[] specialPowers){
        super(specialPowers);
        this.name= name;
    }

    @Override
    public String printSuperPowers(){
        return super.printSuperPowers();
    }
}
