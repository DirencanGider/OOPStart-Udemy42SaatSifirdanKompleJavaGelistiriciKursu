
public class Test {
    public static void main(String[] args) {

        Car car1 = new Car(); //We created a new object from Car class with car1 reference. Yes, car1 is a reference.

        /*
        car1.colour = "Devil's Red";
        car1.doors = 4;
        car1.wheels = 4;
        car1.motor = "16V";
        car1.model = "ZR1";
        System.out.println(car1.motor);
        System.out.println(car1.colour);
         */

        /*car1.setModel("ZR1");

        System.out.println("Car model: " + car1.getModel());*/


        car1.setWheels(-4);

        System.out.println("Wheels number : " + car1.getWheels());


        Car car2 = null; /*If we don't identify object and equal "null" value, Java doesn't show any error in command window.
                         But if we run in this way, IDE gives an error like "Exception in thread "main" java.lang.NullPointerException:
                         Cannot invoke "Car.setModel(String)" because "car2" is null at Test.main(Test.java:28)"*/

        car2.setModel("Renault");


    }


}
