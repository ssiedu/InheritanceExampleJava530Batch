package university;
public class EngStud extends Stud {
    String branch;
    int sem;
    
    public void result(int per){
        if(per>=50){
            System.out.println("EngStud Passed "+per);
        }else{
            System.out.println("EngStud Failed "+per);
        }
    }
    
    public void setEnggData(String x, int y){
        branch=x;
        sem=y;
    }
    public void showEnggData(){
        System.out.println(branch+","+sem);
    }
    
    
}
