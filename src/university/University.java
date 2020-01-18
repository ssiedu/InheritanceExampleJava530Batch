package university;
public class University {

    public static void main(String[] args) {
        EngStud s1=new EngStud();
        s1.setPersonalData(111, "AAA");
        s1.setEnggData("CS", 3);
        s1.showPersonalData();
        s1.showEnggData();
        s1.result(40);
        
        MediStud s2=new MediStud();
        s2.setPersonalData(112, "BBB");
        s2.setMData(2);
        s2.showPersonalData();
        s2.showMData();
        s2.result(44);
        
        MEStud s3=new MEStud();
        s3.setPersonalData(113, "CCC");
        s3.setEnggData("CS",2);
        s3.setRTopic("SpringFramework");
        s3.showPersonalData();
        s3.showEnggData();
        s3.showRTopic();
        s3.result(46);
        
        String str=s3.toString();
        System.out.println(str);
    }
}
