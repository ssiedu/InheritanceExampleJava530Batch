public class SavingAccount extends Account {
    
    public SavingAccount(int x, String y, int z){
        super(x,y,z);
    }
    
    public void showInterest(){
        System.out.println("Interest On Saving Account : "+(balance*10/100));
    }
}
