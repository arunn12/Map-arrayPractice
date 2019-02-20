package javamap10;

import java.util.*;

class Javamap10 {

    public static void main(String args[]) {
        SortedMap<Integer, String> map = new TreeMap<Integer, String>();
        map.put(20, "abc");
        map.put(22, "efg");
        map.put(30, "mno");
        map.put(33, "pqr");
        //Returns key-value pairs whose keys are less than the specified key.  
        System.out.println("headMap: " + map.headMap(20));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.  
        System.out.println("tailMap: " + map.tailMap(20));
        //Returns key-value pairs exists in between the specified key.  
        System.out.println("subMap: " + map.subMap(20, 33));
    }
}
