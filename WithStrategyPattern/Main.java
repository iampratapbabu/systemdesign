package WithStrategyPattern;

public class Main {
    public static void main(String[] args){
        Vehicle vc1 = new SportsVehicle();
        vc1.drive();

        Vehicle vc2 = new GoodsVehicle();
        vc2.drive();
    }
}
