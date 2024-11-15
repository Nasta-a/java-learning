package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        // This is my comment

        /*
        This is first line
        second
         */

        // int (integer) - natural numbers
        int age = 33;
        int currentYear = 2024;

        // currentYear - camel case (lower camel case)
        // current_year - snake case
        // current-year - kebab case

        int inventoryItemCount = 100;

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        // double - fractional numbers
        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        System.out.println(temperature);
        System.out.println(price);
        System.out.println(distance);

        // char - symbols
        char grade = 'A';
        char myInitial = 'N';
        char currencySymbol = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        // boolean - logical type, true/false
        // How to name? has or is
        // Ex. isSummer / if(isSummer) {}; isLoggedIn;
        // Ex. hasAccess / if(hasAccess) {};

        boolean hasAccess = true;
        System.out.println(hasAccess);

        boolean isSummer = false;
        System.out.println(isSummer); // \n

        System.out.print("Hello World\n");
        System.out.print("Hello World");

        // long
        long phoneNumber = 1234566;

        // float
        float interestRate = 4.5f;

        // Arithmetic operators

        int a = 10;
        int b = 5;
        int sum = a + b; // add
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int m = 7;
        int n = 3;
        int result = m * n;
        System.out.println(result);

        // division

        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult);

        // % (remainder of a division)

        int f = 12;
        int g = 5;
        int remainder = f % g; // 12 = 2 * 5 + 2
        System.out.println(remainder);

        int number = 9;
        boolean isEven = (number % 2 == 0); // == comparison operator
        System.out.println(isEven);

        // Increment ++ (+1)
        // ++ preIncrement (+1 before)
        // Decrement -- (-1)
        // --decrement

        number++;
        System.out.println(number);
        number--;
        System.out.println(number);

        int counter = 10;
        counter++;
        int postIncrement = counter++; // postIncrement = 11; counter = 12;
        int preIncerement = ++counter; // preIncerement = 13; counter = 13;
        System.out.println(postIncrement);
        System.out.println(preIncerement);

        String name = "John";
        String lastName = "Doe";

        // print them out separately
        System.out.println(name);
        System.out.println(lastName);

        // Concatenation
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        // Interpolation
        // %s - for String
        // %d - for digits
        System.out.println(String.format("My name is: %s, My surname is: %s", name, lastName));
        System.out.printf("My name is: %s, My surname is: %s\n", name, lastName);
        System.out.printf("My name is: %s, My surname is: %s%n", name, lastName);

        // Implicit variable
        var myCurrentAge = 33;
        var text = "Hello World";

        String myVar;
        myVar = "Hello, World!";
    }
}