package javamap2;

import java.util.Map;
import java.util.HashMap;

public class Javamap2 {

    public static void main(String[] arg) {
        Map<Integer, String> abc = new HashMap<Integer, String>();

        abc.put(1, "bac");
        abc.put(2, "def");
        abc.put(3, "ghi");
        abc.put(4, "mno");
         //   System.out.println(abc);
         //    }}
        for (Integer number : abc.keySet()) {
            System.out.println("key: " + number);
        }

        for (String url : abc.values()) {
            System.out.println("value: " + url);
        }
    }
}
