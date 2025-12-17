
public class Activity {

    public static void main(String[] args) {

        
        Car myCar = new Car();

       
        myCar.color = "Black";
        myCar.transmission = "Manual";
        myCar.make = 2014;

        myCar.displayCharacteristics();
        myCar.accelerate();
        myCar.brake();
    }
}
