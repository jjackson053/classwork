package homework2;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountOwner, int balance, String companyBank, int depositMoney, int withDrawMoney, double interestRate) {
        super(accountOwner, balance, companyBank, depositMoney, withDrawMoney);
        this.interestRate = interestRate;
    }


    public int deposit(){
     int e = getDepositMoney() + getBalance();
     return e;
    }
    public int withDraw(){
      int d = getBalance() - getWithDrawMoney();
      return d;

    }
    public String InterestRate(){
        String i = "";
        double x =  interestRate / 365;
        double y = x * getBalance();
        i+=y;
        return  i;

    }
}
