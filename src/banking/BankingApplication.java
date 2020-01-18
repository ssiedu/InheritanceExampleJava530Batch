package banking;
import java.util.LinkedList;


public class BankingApplication {

    
    
    public static void interest(Account account){
        account.showInterest();
    }
    
    public static void main(String[] args) {
        
        Account ac1=new SavingAccount(111,"AAA",10000);
        Account ac2=new CurrentAccount(112,"BBB",20000);
        ac1.showAccountDetails();
        ac2.showAccountDetails();
        interest(ac1);
        interest(ac2);
    }
}
