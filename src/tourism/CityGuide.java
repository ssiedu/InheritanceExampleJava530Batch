package tourism;
public class CityGuide {
    
    public static void info(CityInfo city){
        city.showPoppulation();
        city.showState();
        city.showImportantPoints();
    }
    
    public static void main(String args[]){
        IndoreInfo indore=new IndoreInfo();
        MumbaiInfo mumbai=new MumbaiInfo();
        //info(indore);
        info(mumbai);
    }
}
