package javamap8;

import java.util.*;

public class Javamap8 {

    public static void main(String args[]) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "ghi");
        map.put(4, "jkl");
        System.out.println("Before invoking remove() method");
        for (Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        
        System.out.println(map.remove(2));
        System.out.println(map);
        
    }
}
