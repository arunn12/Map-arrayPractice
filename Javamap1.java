package javamap1;

import java.util.*;
import java.util.Map;
import java.util.HashMap;

class Javamap1 {

    public static void main(String args[]) {
        Map< String, Integer> abc = new HashMap< String, Integer>();
        abc.put("a", 100);
        abc.put("b", 200);
        abc.put("c", 300);
        abc.put("d", 400);
//System.out.println(abc);
//    }
//}
        Set< Map.Entry< String, Integer>> st = abc.entrySet();
        for (Map.Entry< String, Integer> mp : st) {
            System.out.println("Key = " + mp.getKey());
            System.out.println("Value = " + mp.getValue());

        }
    }
}
