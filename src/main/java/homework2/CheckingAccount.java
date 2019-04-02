package homework2;

public class CheckingAccount extends Account {
    private int overDraft;
    private int priceOfItem;

    public CheckingAccount(String accountOwner, int balance, String companyBank, int depositMoney, int withDrawMoney, int overDraft, int priceOfItem) {
        super(accountOwner, balance, companyBank, depositMoney, withDrawMoney);
        this.overDraft = overDraft;
        this.priceOfItem = priceOfItem;
    }
    public int deposit(){
        int x = getDepositMoney() + getBalance();
        return  x;
    }

    public int withDraw(){
        int y = getBalance() - getWithDrawMoney();
        return  y;
    }

    public  int OverDraft(){
        int c = getBalance() - priceOfItem;
        int v = getBalance() - overDraft;
        if (c < overDraft){
            return v;
        }
        return getBalance();
    }

}

