package javamap4;

import java.util.Map;
import java.util.HashMap;

public class Javamap4 {

    public static void main(String[] args) {
        Map<String, Integer> phonebook = new HashMap<String, Integer>();

        phonebook.put("prabhu", 999999222);
        phonebook.put("arjun", 999999223);
        phonebook.put("karthi", 999999225);
        phonebook.put("naveen", 999999282);

        System.out.println("Number is:" + phonebook.get("karthi"));

    }

}
