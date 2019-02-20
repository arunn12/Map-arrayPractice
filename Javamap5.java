package javamap5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Javamap5 {

    public static void main(String[] args) {
        Map<String, Integer> phonebook = new HashMap<String, Integer>();

        phonebook.put("prabhu", 999999222);
        phonebook.put("arjun", 999999223);
        phonebook.put("karthi", 999999225);
        phonebook.put("naveen", 999999282);

        Set<String> keys = phonebook.keySet();
        for (String i : keys) {
//System.out.println(i);
//System.out.println(phonebook.get(i));
            System.out.println(i + "" + "Number is :" + phonebook.get(i));
        }

    }
}

