public class CurrentAccount extends Account {
    
    public CurrentAccount(int x, String y, int z){
        super(x,y,z);
    }
    public void showInterest() {
        System.out.println("Interest On Current Account : "+(balance*8/100));
    }
}
