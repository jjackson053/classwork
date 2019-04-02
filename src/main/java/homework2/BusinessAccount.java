package homework2;

public class BusinessAccount extends Account{

    public BusinessAccount(String accountOwner, int balance, String companyBank, int depositMoney, int withDrawMoney) {
        super(accountOwner, balance, companyBank, depositMoney, withDrawMoney);
    }
    public int deposit(){
     int b = getDepositMoney() + getBalance();
     return  b;
    }
    public int withDraw(){
        int f = getBalance() - getWithDrawMoney();
        return f;
    }
}
