package Classes;

public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper 클래스의 인스턴스는 생성자로 생성할 수도 있고, 리터럴로 생성할 수도 있습니다.
        Integer a = new Integer(123);
        Integer b = 123;

        System.out.println(123 == 123); // true
        System.out.println(new Integer(123) == new Integer(123)); // false: not the same instance
        System.out.println(new Integer(123).equals(new Integer(123))); // true: compares the value
    }
}
