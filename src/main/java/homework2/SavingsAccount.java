package homework2;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountOwner, int balance, String companyBank, int depositMoney, int withDrawMoney, double interestRate) {
        super(accountOwner, balance, companyBank, depositMoney, withDrawMoney);
        this.interestRate = interestRate;
    }


    public int deposit(int addMoney){
     int e = addMoney + getBalance();
     return e;
    }
    public int withDraw(int takeMoney){
        int d = getBalance() - takeMoney;
        return d;

    }

    public String InterestRate(){
        String i = "";
        double x =  interestRate / 365;
        double y = x * getBalance();
        i+=y;
        return  i;

    }
    public int setMyBalance(){
        return   getBalance();

    }

}
