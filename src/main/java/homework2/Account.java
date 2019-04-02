package homework2;

public abstract class Account {
    private String accountOwner;
    private int balance;
    private String companyBank;
    private int depositMoney;
    private int withDrawMoney;

    public int getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(int depositMoney) {
        this.depositMoney = depositMoney;
    }

    public int getWithDrawMoney() {
        return withDrawMoney;
    }

    public void setWithDrawMoney(int withDrawMoney) {
        this.withDrawMoney = withDrawMoney;
    }

    public String getAccountOwner() {
        return accountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        this.accountOwner = accountOwner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCompanyBank() {
        return companyBank;
    }

    public void setCompanyBank(String companyBank) {
        this.companyBank = companyBank;
    }

    public Account(String accountOwner, int balance, String companyBank, int depositMoney, int withDrawMoney) {
        this.accountOwner = accountOwner;
        this.balance = balance;
        this.companyBank = companyBank;
        this.depositMoney= depositMoney;
        this.withDrawMoney= withDrawMoney;
    }
    public abstract int deposit();
    public abstract int withDraw();
}
