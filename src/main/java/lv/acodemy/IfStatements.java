package lv.acodemy;

public class IfStatements {
    public static void main(String[] args) {

        /*
        'If'
        if (condition) {
            Code to execute if the condition is true
        }

        'If-else'
        if (condition) {
            Code to execute if the condition is true
        } else {
            Code to execute if the condition is false
        }

        'If-else-if'
        if (condition1) {
            Code to execute if the condition1 is true
        } else if (condition2) {
            Code to execute if the condition2 is true
        } else {
            Code to execute if none of the above conditions are true
        }

        'Switch'
        switch (expression) {
            case value1:
                Code to execute for value1
                break;
            case value2:
                Code to execute for value2
                break;
            default:
                Code to execute if no value matches
        }
         */

        // Even or odd (if)
        int number = 7;
        if(number % 2 == 0) {
            System.out.println("The number is even");
        }

        // Check if a number is positive or negative (if-else)

        number = -5;

        if (number >= 0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }

        // Grade checker (if-else-if)
        // 90> A
        // 75-89 B
        // 50-74 C
        // < 50 F

        // 1) Create score variable
        // 2) Create logic if (score >= 90) -> A
        // else-if (score >= 75) -> B
        // else-if (score >= 50) -> C
        // else -> F

        int score = 68;

        if(score >= 90) {
            System.out.println("Grade: A");
        } else if(score >= 75) {
            System.out.println("Grade: B");
        } else if(score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // Task 1. Check if a person is allowed to buy alcohol

        int age = 15;
        if(age >= 18) {
            System.out.println("You are allowed to buy alcohol");
        }

        // Task 2. Check if a number can be divided by 5

        number = 10;
        if(number % 5 == 0){
            System.out.println("The number is ok");
        }

        // Task 3. Check if pass or fail
        // if score >= 50 - passed
        // other cases - failed

        score =9;
        if(score >= 50){
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }

        // Task 4. Temperature message
        // Above 30 (It's hot)
        // Temperature 15-30 (Nice weather)
        // Below 15 (It's cold)

        int temperature = 19;
        if(temperature > 30) {
            System.out.println("It's hot");
        } else if(temperature >= 15) {
            System.out.println("The weather is nice");
        } else {
            System.out.println("It is cold");
        }

        // Traffic light system
        // Green - go
        // Yellow - slow down
        // Red - stop
        // String colour
        // if(colour.equals("Green")) {}

        String colour = "purple";

        if(colour.equals("Green")) {
            System.out.println("Go");
        } else if(colour.equals("Yellow")){
            System.out.println("Slow down");
        } else if(colour.equals("Red")){
            System.out.println("Stop");
        } else {
            System.out.println("Invalid");
        }

    }
}
