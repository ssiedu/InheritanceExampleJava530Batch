public class Person {
    private String name;
    private int age;
    public Person(){}
    public Person(String a, int b){
        name=a; age=b;
    }
    public void info(){
        System.out.println("Name : "+name);
        System.out.println("Age  : "+age);
    }
}
