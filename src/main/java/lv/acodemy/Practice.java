package lv.acodemy;

public class Practice {
    public static void main(String[] args) {

        // Write a 'for loop' that prints numbers on separate lines

        // for(counter; condition; increment) {}

        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Using a 'for loop', print all even numbers from 2 to 20
        // i += 2 same as i = i + 2

        for(int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }

        // Use a 'for loop' to print the multiplication table of 5 up to 5*10

        for(int i = 1; i <= 10; i++) {
            System.out.println("5 * " + i + " * " + i + 5);
        }
    }
}
