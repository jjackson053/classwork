package homework3;

public class Main {
    public static void main(String[] args) {
        Dimension lol = new Dimension(10, 10,30);
        Case lol1 = new Case("NZXT", "H500i", "Slim Power",lol);
        Resolution lol3 = new Resolution(3840,2160);
        Monitor lol4= new Monitor("Thunderbolt 3 ","Samsung",34,lol3);
        MotherBoard lol5= new MotherBoard("Gigabyte","Aorus",4,4,"AMI");
        Pc John = new Pc(lol5,lol1,lol4);

        John.powerUp();
        System.out.println(John);
    }
}
