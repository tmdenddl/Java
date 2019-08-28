package ShapePrinter;

public class ShapePrinter {
    public void printTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            for(int j = 1; j <= height - i; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void printFloydsPyramid(int height) {
        // length of the biggest number
        int length = String.valueOf(height * (height + 1) / 2).length();

        // number to be printed
        int number = 1;

        // (1) for loop to change the rows
        for (int row = 1; row <= height; row++) {

            // String to store a line
            String line = "";

            // (2) for loop to change columns(numbers) in the row
            for (int col = 1; col <= row; col++) {

                // (3) for loop for the gap spacing
                for (int i = String.valueOf(number).length(); i < length; i++) {
                    line += " ";
                }

                line += (number + " ");
                number++;

            }

            // print the line
            System.out.println(line);
        }
    }
}
