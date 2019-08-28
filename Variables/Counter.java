package Variables;

public class Counter {
    static int count;

    // 만약 인스턴스와 직접적인 관계가 없는 클래스 변수를 바꾸려면, 아래와 같이 클래스 메소드를 사용할 수도 있겠죠?
    public static void increment() {
        count++;
    }

    /*
    언제 클래스 메소드를 쓰면 되나요?

    이제 인스턴스 메소드와 클래스 메소드의 차이가 이해 되시나요?

    언제 클래스 메소드를 써야할지 판단하기 어렵다면, 이 질문을 해보세요.

    "생성된 인스턴스가 하나도 없더라도 이 메소드를 호출하는 게 말이 되나요?"

    정답이 'Yes'라면 클래스 메소드, 즉 static 메소드를 사용하면 됩니다!
     */

    public static void main(String[] args) {
        System.out.println(Counter.count);

        Counter.increment();
        System.out.println(Counter.count);

        Counter.increment();
        System.out.println(Counter.count);

        Counter.increment();
        System.out.println(Counter.count);
    }
}
