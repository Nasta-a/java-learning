package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {
    public static void main(String[] args) {

        /* Principles
        1) Encapsulation (Getters, Setters)
        2) Inheritance
        3) Polymorphism
        4) Abstraction
        */

        Car audi = new Car("Blue", "RS6");
        audi.start();
        System.out.println(audi);

        // audi.colour = "Blue";
        // audi.model = "RS6";

        audi.setColour("Blue");
        audi.setModel("RS6");

        System.out.println(audi);

        // create BMW object
        // start it
        // set colour and model

        Car bmw = new Car();
        // bmw.colour = "Grey";
        // bmw.model = "X3";
        bmw.setColour("Grey");
        bmw.setModel("X3");

        bmw.start();
        System.out.println(bmw);

        // Print text: My car model is %s, and colour is %s

        System.out.println("My car model is " + bmw.getModel() + " and colour is " + bmw.getColour());
        System.out.println(String.format("My car model is %s and colour is %s", bmw.getModel(), bmw.getColour()));

        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();



    }
}
