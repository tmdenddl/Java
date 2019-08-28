package ExceptionHandling;

public class Exception {
    public static void main(String[] args) {
        int[] smallArray = new int[3];

        for (int i = 0; i < 10; i++) {
            try {
                smallArray[i] = i;
                System.out.println(i + "번 째 시도 통과");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(i + "번 째 시도에서 예외 발생");
            }
        }

        // RESULTS
        for (int i: smallArray) {
            System.out.println(i);
        }
    }
}
