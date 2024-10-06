
class Vehicle{
    public Integer getNumberOfWheels(){
        return 2;
    }

    public Boolean hasEngine(){
        return true;
    }
}

public class LiskovSubstitution {
    public static void main(String[] args){
        System.out.println("Liskov substitution principle started");
        Vehicle v1 = new Vehicle();
        System.out.println(v1.getNumberOfWheels());
    }
}
