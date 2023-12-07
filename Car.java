public class Car {

    private String colour;
    private int doors;
    private int wheels;
    private String motor;
    private String model;

    //These are all features that we added this Car class.


    public void setModel (String model) { //Set methods are used to reach private objects with different ways in other classes.

        this.model = model; /*We used "this" keyword because both of words were same. We had to match the model that feature and model that we will assign in Test class.
                            If we assigned another different word like "model1", it wouldnt necessary. Directly we could equal them.*/
    }
    public String getModel() { //Get methods are used to call private objects with different ways in another classes.
        return this.model;
    }

    /* We are able to set setter and getter method those all in this page shortly.
    Right click in this area > Refractor > Encapsulate Fields > Choose Setter and Getter block that you want to refractor > Click Refractor below
    In Intellij Idea Community Edition, Encapsulation Fields is disabled. We need to follow this instructions;
    Right click > Generate > Getter and Setter > Select Features of Object > Generate */

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        if (wheels < 0) {
            System.out.println("Wheels number cannot be under 0");
        }
        else {
            this.wheels = wheels;
        }
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
