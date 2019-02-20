package javamap6;

import java.util.*;

public class Javamap6 {

    public static void main(String a[]) {
        LinkedHashMap<String, String> abc = new LinkedHashMap<String, String>();
        abc.put("one", "welcome");
        abc.put("two", "goog luck");
        abc.put("three", "all the best");

        System.out.println(abc);

        System.out.println("Getting value for key 'one': " + abc.get("one"));
        System.out.println("Size of the map: " + abc.size());
        System.out.println("Is map empty? " + abc.isEmpty());
        System.out.println("Contains key 'two'? " + abc.containsKey("two"));
        System.out.println("delete element 'one': " + abc.remove("one"));
        System.out.println(abc);
    }
}
