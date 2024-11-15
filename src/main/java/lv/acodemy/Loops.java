package lv.acodemy;

public class Loops {
    public static void main(String[] args) {

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"};

        /* For loop (known number of loops)
        for(initialisation; condition; increment) {
            code to be executed
        }
         */
        for (int i = 0; i < shoppingList.length; i++) {
            System.out.println("Current product is " + shoppingList[i]);
        }
        System.out.println("Goes next!");

        /* For-each loop (the whole list)
        for (String variable : list) {
        sout (" " + variable);
        }
         */
        for (String s : shoppingList) {
            System.out.println("Current product is " + s);
        }
        System.out.println("Goes next!");

        /* While loop (unknown number of loops)
        while(condition) {
            code to be executed
        }
         */
        int i = 0;
        while (i < shoppingList.length) {
            System.out.println("Current product is " + shoppingList[i]);
            i++;
        }

        /* Do-while loop
        do {
            code to be executed
        } while (condition);
         */

        int j = 0;
        do {
            System.out.println("Current product is " + shoppingList[j]);
            j++;
        } while (j < shoppingList.length);

        // Conditions
        boolean x = 1 < 5 && 6 > 3; // AND
        boolean y = 2 > 5 || 3 < 2; // OR
        System.out.println(x);
        System.out.println(y);

    }
}

