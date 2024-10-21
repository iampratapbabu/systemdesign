package WithStrategyPattern;

import WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategyObj;

    //this is known as constructor injection
    Vehicle(DriveStrategy driveStrategyObj){
        this.driveStrategyObj = driveStrategyObj;
    }

    public void drive(){
        driveStrategyObj.drive();
    }
}
