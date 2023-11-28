public class Car {

    private String colour;
    private int doors;
    private int wheels;
    private String motor;
    private String model;

    //These are all features that we added this Car class.


    public void setModel (String model) { //Set methods are used to reach private objects with different ways in another classes.

        this.model = model; /*We used "this" keyword because both of words were same. We had to match the model that feature and model that we will assign in Test class.
                            If we assigned another different word like "model1", it wouldnt necessary. Directly we could equal them.*/
    }
    public String getModel() { //Get methods are used to call private objects with different ways in another classes.
        return this.model;
    }


}
