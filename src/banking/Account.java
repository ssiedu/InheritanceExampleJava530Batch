package banking;
public abstract class Account {
    int ano, balance;
    String name;
        
    public Account(int a, String b, int c){
        ano=a; name=b; balance=c;
    }
    
    public abstract void showInterest();
    
    public void setAccountDetails(int a, String b, int c){
        ano=a;
        name=b;
        balance=c;
    }
    public void showAccountDetails(){
        System.out.println(ano+","+name+","+balance);
    }
    
    public static void main(String args[]){
        System.out.println("Just To Check");
    }
}
