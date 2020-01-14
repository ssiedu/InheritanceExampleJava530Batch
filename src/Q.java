public class Q extends P {
    public Q(){
        super(1);
        System.out.println("Q-0");
    }
    public Q(int x){
        super(1,2);
        System.out.println("Q-1");
    }
    public Q(int x, int y){
        System.out.println("Q-2");
    }
    public static void main(String args[]){
        
        Q ob=new Q(5);
        
    }
}
