package Scanner;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        // Initialize scanner
        Scanner scanner = new Scanner(System.in);

        // Scanner.nextInt()
        System.out.println("How old are you?: ");

        int age = scanner.nextInt();

        System.out.println("I am " + age);

        // Scanner.next()
        System.out.println("What's your name?: ");

        String name = scanner.next();

        System.out.println("I am " + name);

        // print
        System.out.println("I am " + name + ", I am " + age + ".");
    }
}
