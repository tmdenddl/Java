package ShapePrinter;

public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // Test for printTriangle
        printer.printTriangle(3);
        System.out.println("----------");
        printer.printTriangle(5);
        System.out.println("----------");
        printer.printTriangle(10);
        System.out.println("----------");

        // Test for printPyramid
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);

        // Test for printFloydsPyramid
        printer.printFloydsPyramid(3);
        System.out.println("----------");
        printer.printFloydsPyramid(5);
        System.out.println("----------");
        printer.printFloydsPyramid(15);
    }
}
