/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamap9;

import java.util.*;

class Javamap9 {

    public static void main(String args[]) {
        NavigableMap<Integer, String> map;
        map = new TreeMap<Integer, String>();
        map.put(10,"Sachin");
        map.put(11, "Kaif");
        map.put(12, "Yuvi");
        map.put(18, "Kholi");
        map.put(3, "Raina");
        //Maintains descending order  
        System.out.println("descendingMap: " + map.descendingMap());
        //Returns key-value pairs whose keys are less than or equal to the specified key.  
        System.out.println("headMap: " + map.headMap(12, true));
        //Returns key-value pairs whose keys are greater than or equal to the specified key.  
        System.out.println("tailMap: " + map.tailMap(10, true));
        //Returns key-value pairs exists in between the specified key.  
        System.out.println("subMap: " + map.subMap(10, false, 18, true));
    }
}
