package Classes;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        String[] newArray = new String[5];

        newArray[0] = "김선의";
        newArray[2] = "강영훈";
        newArray[3] = "서혜린";
        newArray[4] = "문중모";

        // Error because newArray[1] == null
        for (String name: newArray) {
            System.out.println(name);
        }

        // Another Way (ArrayList)
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.add("김선의");
        newArrayList.add("강영훈");
        newArrayList.add("서혜린");
        newArrayList.add("문중모");

        System.out.println(newArrayList.size());
        System.out.println(newArrayList.get(0));

        // Remove, Size, Get
        newArrayList.remove("강영훈");
        System.out.println(newArrayList.size());
        System.out.println(newArrayList.get(1));

        // Contains
        System.out.println(newArrayList.contains("김선의")); // true

        // Clear
        newArrayList.clear();
        System.out.println(newArrayList.size());



    }
}
