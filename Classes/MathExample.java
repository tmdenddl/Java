package Classes;

import java.util.Random;
import java.lang.Math;

public class MathExample {
    public static void main(String[] args) {
        // Absolute Value
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(8));

        // Min & Max Value
        System.out.println(Math.min(4, 10));  // 최솟값
        System.out.println(Math.max(4, 10));  // 최댓값

        Random rand = new Random();
        System.out.println(rand.nextInt(10));   // 0 이상 9 이하의 랜덤한 값
        int min = 10;
        int max = 30;

        // 0 + 10 <= nextInt <= 20 + 10
        // 10 <= nextInt <= 30
        System.out.println(rand.nextInt((max - min) + 1) + min);   // 10 이상 30 이하의 랜덤한 값

    }
}
