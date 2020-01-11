public class EngStud extends Stud {
    String branch;
    int sem;
    
    public void setEnggData(String x, int y){
        branch=x;
        sem=y;
    }
    public void showEnggData(){
        System.out.println(branch+","+sem);
    }
    
    
}
