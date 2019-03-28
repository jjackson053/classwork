package classwork;

public class Main {
    public static void main(String[] args) {
        Hero spider = new Hero("spidermans",new String[]{"websling, ",  " spidersense, ", " acrobatics" });
        System.out.println(spider.printSuperPowers());

        Hero2 str = new Hero2("hulk",new String[]{"super strength, ", " super jump, ", " rage"} );
        System.out.println(str.printSuperPowers());
    }
}
