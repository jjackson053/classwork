package homework2;

public class Main {
    public static void main(String[] args) {
    SavingsAccount lol = new SavingsAccount("John",4000,"Chase",300,500, .2);
    CheckingAccount boi = new CheckingAccount("mike", 40, "chase", 0,50, 30, 50);
        System.out.println(lol.deposit());
        System.out.println(lol.InterestRate());
        System.out.println(lol.withDraw());
        System.out.println(boi.OverDraft());
    }
}
