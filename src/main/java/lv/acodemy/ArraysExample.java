package lv.acodemy;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        // Arrays
        int[] numbers;
        String[] names;

        // Also an option, but not recommended
        int numbers1[];
        String name1[];

        numbers = new int[5]; // [0, 0, 0, 0, 0]
        names = new String[3]; // [null, null, null]

        int[] numberz = {1, 2, 3, 4, 5};
        String[] namez = {"John", "Alex", "Mary", "Bob"};

        // Element access
        System.out.println(namez[2]);
        namez[2] = "Jerry";
        System.out.println(Arrays.toString(namez));

        System.out.println(namez.length);

        String myName = "John";
        myName.charAt(1);
        System.out.println(myName.charAt(0));
    }
}
