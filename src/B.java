public class B extends A {
    
    public void disp(){
        System.out.println("Disp of B");
        show();
    }
    
    public void show(){
        System.out.println("Show from B");
    }
    
    public static void main(String args[]){
        B ob=new B();
        ob.disp();
    }
}
