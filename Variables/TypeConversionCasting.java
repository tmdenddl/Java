package Variables;

public class TypeConversionCasting {
    public static void main(String[] args) {
        // doulbe has stronger power than integer, thus must type cast it
        double x = 3.14;
        int y = (int) x;

        System.out.println(x);
        System.out.println(y);

        int a = 9;
        int b = 5;

        System.out.println((double)a / b);

        // Literals
        long e = 123;
        long f = 123L;   // long의 리터럴 표현방법

        // float g = 3.14;
        // 오류: 형이 맞지 않음. 필요한 값: float, 발견된 값: double

        float h = 3.14f; // float의 리터럴 표현방법
        float i = 314f;  // float의 리터럴 표현방법

        double j = 3.14;
        double k = 314d; // double의 리터럴 표현 방법

        /* If the type that needs to be changed has greater power than the type is has to be converted to,
           it will automatically type-cast it without any manual type-casting
         */

        int numInt = 3;
        double numDouble = (double) a;
        long numLong = (long) a;

        System.out.println(numInt);
        System.out.println(numDouble);
        System.out.println(numLong);
    }
}
