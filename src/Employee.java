public class Employee extends Person {
    
    private String desg;
    private int sal;
    
    public Employee(String p1, int p2, String p3, int p4){
        super(p1,p2);
        desg=p3;
        sal=p4;
    }
   
    public void info(){
        super.info();
        System.out.println("Desg  : "+desg);
        System.out.println("Sal   : "+sal);
    }
    public static void main(String args[]){
        Employee e=new Employee("ABC",25, "Manager", 50000);
        e.info();
    }
    
}
