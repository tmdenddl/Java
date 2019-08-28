package FlowControl;

public class Switch {
    public static void main(String[] args) {
        /*
        A+   : 100
        A    : 90-99
        B    : 80-89
        C    : 70-79
        D    : 60-69
        F    : 0-59
         */

        // Test Score
        int score = 97;

        // Letter Grade
        String grade;

        // FlowControl.Switch

        switch (score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default:
                grade = "F";
                break;
        }

        System.out.println("Grade: " + grade);

        switch (grade) {
            case "A+":
            case "A":
            case "B":
                System.out.println("Well Done!");
                break;
            case "C":
            case "D":
                System.out.println("Good!");
                break;
            case "F":
                System.out.println("You Failed");
            default:
                System.out.println("Please Retake The Course");
                break;
        }


        int number = 134354;

        number = number % 7;

        switch (number) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
        }
    }
}
