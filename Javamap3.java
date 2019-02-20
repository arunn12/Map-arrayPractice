package javamap3;

import java.util.Map;
import java.util.HashMap;

class Javamap3 {

    public static void main(String[] arg) {
        Map<String, Integer> abc = new HashMap<String, Integer>();

        abc.put("error1:", 200);
        abc.put("error2", 202);
        abc.put("error3:", 204);
        abc.put("error4:", 400);
        for (String err : abc.keySet()) {

           Integer des = abc.get(err);
            System.out.println("Key = " + err + ", Value = " + des);
        }
    }
}
