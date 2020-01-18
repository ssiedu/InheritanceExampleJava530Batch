package university;
public class Stud {
    int rno;
    String name;
    
    public void result(int per){
        if(per>=33){
            System.out.println("Stud Passed "+per);
        }else{
            System.out.println("Stud Failed "+per);
        }
    }
    public void setPersonalData(int a, String b){
        rno=a; name=b;
    }
    public void showPersonalData(){
        System.out.println(rno+","+name);
    }
    public static void main(String args[]){
        System.out.println("from main of Student");
    }
}
