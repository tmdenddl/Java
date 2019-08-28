package Collection;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        if (intArray.length < 2) {
            return 0;
        }

        int max = intArray[0];
        int min = intArray[0];

        for (int value : intArray) {
            if (max < value) {
                max = value;
            }
            if (min > value) {
                min = value;
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        GreatestDifferenceFinder finder = new GreatestDifferenceFinder();

        // 테스트 1
        int[] testArray1 = {-2, 7, 3};
        System.out.println(finder.greatestDifference(testArray1));

        // 테스트 2
        int[] testArray2 = {8, 3, 14, 1};
        System.out.println(finder.greatestDifference(testArray2));

        // 테스트 3
        int[] testArray3 = {4, 2, 3, 1};
        System.out.println(finder.greatestDifference(testArray3));

        // 테스트 4
        int[] testArray4 = {};
        System.out.println(finder.greatestDifference(testArray4));

        // 테스트 5
        int[] testArray5 = {1, 2, -3, 4, 5};
        System.out.println(finder.greatestDifference(testArray5));

        // 테스트 6
        int[] testArray6 = {1};
        System.out.println(finder.greatestDifference(testArray6));
    }
}