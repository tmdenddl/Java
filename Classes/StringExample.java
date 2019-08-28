package Classes;

public class StringExample {
    public static void main(String[] args) {
        char data[] = {'a', 'b', 'c'};
        String myString = new String(data);

        // String myString = "abc";

        myString = "aBc";
        System.out.println(myString.toUpperCase()); // 모두 대문자로
        System.out.println(myString.toLowerCase()); // 모두 소문자로
        System.out.println(myString);               // 그대로


        myString = "aBc";
        System.out.println(myString.toLowerCase() == "abc");
        /*
        기본형의 비교 연산자는 양쪽의 값이 같으면 true가 나오는데요. 참조형의 비교 연산자는 가리키는 인스턴스가 같은 인스턴스인지 확인하는 역할을 합니다.

        위의 예시에서 두 인스턴스가 서로 다른 인스턴스이기 때문에 false가 나오는 거죠.
         */

        // 만약 두 문자열의 내용이 같은지 비교하려면 ==가 아니라 equals 메소드를 사용하셔야 합니다.
        System.out.println(myString.toLowerCase().equals("abc"));
    }
}
