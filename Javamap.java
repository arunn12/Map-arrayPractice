package javamap;

import java.util.Map;
import java.util.HashMap;

class Javamap {

    public static void main(String[] arg) {
        Map<Integer, String> abc = new HashMap<Integer, String>();
        abc.put(01, "prabhu");
        abc.put(02, "aanand");
        abc.put(03, "navin");
        abc.put(04, "hari");
        for (Map.Entry<Integer, String> entry : abc.entrySet()) {
            System.out.println("Key = " + entry.getKey()
                    + ", Value = " + entry.getValue());
        }
    }
}
