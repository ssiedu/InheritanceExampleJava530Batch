public class B extends A {
    
    int x=20;
    
    public void disp(){
        //System.out.print(super.x);
        super.show();
    }
   
    
    public void show(){
        System.out.println("Show from B");
    }
    
    public static void main(String args[]){
        B ob=new B();
        ob.disp();
    }
}
