package homework2;

public class Main {
    public static void main(String[] args) {
    SavingsAccount lol = new SavingsAccount("John",100,"Chase",50,50, .2);
    CheckingAccount boi = new CheckingAccount("mike", 40, "chase", 0,50, 30, 50);
        System.out.println(lol.setMyBalance());
        System.out.println(lol.deposit(50));
        System.out.println(lol.withDraw(50));


    }
}
