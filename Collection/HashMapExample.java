package Collection;

import java.util.ArrayList;

public class HashMapExample {
    public static void main(String[] args) {
        ArrayList<Pokemon> arrayList = new ArrayList<>();
        arrayList.add(new Pokemon("이상해씨"));
        arrayList.add(new Pokemon("이상해풀"));
        arrayList.add(new Pokemon("이상해꽃"));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.get(2));

        // HashMapExample<key, value>
        // Key -> Value
        java.util.HashMap<String, Pokemon> pokeDex = new java.util.HashMap<>();

        // insert element using put method
        pokeDex.put("피카츄", new Pokemon("피카츄"));
        pokeDex.put("라이츄", new Pokemon("라이츄"));
        pokeDex.put("이상해씨", new Pokemon("이상해씨"));
        pokeDex.put("이상해풀", new Pokemon("이상해풀"));
        pokeDex.put("이상해꽃", new Pokemon("이상해꽃"));
        pokeDex.put("파이리", new Pokemon("파이리"));

        // get an element from HashMapExample
        Pokemon pikachu = pokeDex.get("피카츄");

        // remove an element from HashMapExample
        pokeDex.remove("파이리");

        // print all keys stored in pokeDex
        for(String key: pokeDex.keySet()) {
            System.out.println(pokeDex.get(key));
        }

    }
}
