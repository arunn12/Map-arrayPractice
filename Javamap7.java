package javamap7;

import java.util.*;

class Javamap7 {

    public static void main(String args[]) {
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(100, "guru");
        map.put(102, "naveen");
        map.put(101, "prabhu");
        map.put(103, "keerthi");

        for (Map.Entry m : map.entrySet()) {
            System.out.println("Key is "+m.getKey() + " " +"Value is "+m.getValue());
        }
    }
}
