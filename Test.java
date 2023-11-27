import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {

        Car car1 = new Car(); //We created a new object from Car class with car1 reference.

        car1.colour = "Devil's Red";
        car1.doors = 4;
        car1.wheels = 4;
        car1.motor = "16V";
        car1.model = "ZR1";

        System.out.println(car1.motor);
        System.out.println(car1.colour);

    }


}
