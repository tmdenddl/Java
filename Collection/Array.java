package Collection;

public class Array {
    public static void main(String[] args) {
        // Collection.Array that can store 5 int values
        int[] intArray = new int[5];

        // Another ways of creating an array
        char[] charArray;
        charArray = new char[10];

        int[] numbers = {1, 2, 3, 4, 5};

        // insert int values into an array
        intArray[0] = 2;
        intArray[1] = 3;
        intArray[2] = 5;
        intArray[3] = 7;
        intArray[4] = 11;

        System.out.println(intArray[0] + intArray[4]);

        // print every elements in the array
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        // alternative way
        for (int i : intArray) {
            System.out.println(i);
        }

        // Aliasing
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = arr1; // arr2 points to arr1, thus the same array

        arr1[0] = 100;
        System.out.println(arr2[0]);

        // Cloning
        int[] arr3 = {1, 2, 3, 4, 5};
        int[] arr4 = arr3.clone(); // two distinguish array with the same elements

        arr3[0] = 100;
        System.out.println(arr3[0]);
        System.out.println(arr4[0]);

        // Practice Exercise
        // 크기가 30인 정수형 배열 intArray를 만들어 주세요.
        int[] intArr = new int[30];

        // 배열의 첫 번째(0번 인덱스) 칸부터 1001, 1002, 1003, ..., 1029, 1030을 순서대로 넣어주세요.
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = 1001 + i;
        }

        // 크기가 4인 문자열형 배열 remainders를 만들어 "Zero", "One", "Two", "Three"를 순서대로 넣어주세요.
        String[] stringArray = {"Zero", "One", "Two", "Three"};

        // 배열에 담긴 각 값을 4로 나눈 나머지를 영문으로 출력해주세요.
        for (int i: intArr) {
            System.out.println(stringArray[i % 4]);
        }

    }
}
