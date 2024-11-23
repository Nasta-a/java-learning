package lv.acodemy.objects;

public class Car {

    // fields
    private String colour;
    private String model;

    public Car(String colour, String model) {
        this.colour = colour;
        this.model = model;
    }

    public Car() {
    }

    // function/method
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    // Getters - methods that retrieve the value of a variable/object's private field
    // Setters - methods that modify or set the values in the variables


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
