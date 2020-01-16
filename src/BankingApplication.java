
public class BankingApplication {

    public static void main(String[] args) {
        SavingAccount ac1=new SavingAccount(111,"AAA",10000);
        CurrentAccount ac2=new CurrentAccount(112,"BBB",20000);
        ac1.showAccountDetails();
        ac2.showAccountDetails();
    }
}
