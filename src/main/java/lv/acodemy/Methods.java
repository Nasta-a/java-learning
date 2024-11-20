package lv.acodemy;

public class Methods {
    public static void main(String[] args) {

        // Access modifier (public, private, protected, package-private)
        // Can return specific data type
        // void - if we do not return anything
        // Method name: should be unique, camelCase;
        // Parameters
        // return keyword if we return something


        /* To create method:
            [access modifier] [other modifiers] [return type] methodName {
                method body
                return [value]
         */

        // Create method that will print out Hello, World!


        sayHello();
        greet("Nastassia");

        System.out.println(add(8, 7));
        int x = add(10, 5);
        System.out.println(x);

        System.out.println(add(1.2, 1.8));

        double a = 1.2;
        double b = 2.1;
        System.out.println(add(a,b));

        var firstStudent = calculateGrade(70);
            System.out.println(firstStudent);
        var secondStudent = calculateGrade(90);
        System.out.println(secondStudent);

    }

    public static void sayHello() {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");

    }

    // method overloading (same method name, but different parameters)

    public static int add(int a, int b) {
        return a + b;
        // int c = a + b;
        // return c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static String calculateGrade(int score) {
        if(score >= 90) {
            return "A";
        } else if(score >= 75) {
            return "B";
        } else if(score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }
}
