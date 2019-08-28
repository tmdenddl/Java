package Variables;

public class Variables {
    public static void main(String[] args) {
        int age;
        age = 25;

        // Java distinguishes Capitals and small letters
        int Age = 25;

        // age = 25.5
        // This is an error because age is type <int>

        age = Age;
        age = age + 1;

        System.out.print("Hello, I am ");
        System.out.print(age);
        System.out.println(".");


        // Primitive Data Types
        byte myByte = 1;
        short myShort = 10;
        int myInt = 23;
        long myLong = 12345678909L;
        double myDouble = 3.14;
        float myFloat = 3.11f;

        char a1 = 'a';
        char a2 = 97; // ASCII value of 97
        char a3 = '\u0061'; // Unicode
        char a4 = '가';

        boolean myBoolean = false;

        // Non-Primitive Data Types
        String myString = "CodeIt";


    }
}
