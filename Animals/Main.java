package Animals;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<AbstractAnimal> animals = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i ++) {
            System.out.println("동물원에 어떤 동물을 키울까요?");
            String name = scanner.next();
            System.out.println(name + "의 울음소리는 어떤가요?");
            String sound = scanner.next();

            // User typed Animal
            animals.add(new AbstractAnimal(name) {
                @Override
                public void cry() {
                    System.out.println(sound);
                }
            });
        }
    }
}
