package firstprogram;

import java.util.HashMap;
import java.util.Map;

public class FirstProgram {

//    String input = "Hello";

    void display() {
        int f = 'A';
        System.out.println("Ascii Values 0f A is :" + f);

    }

    public static void main(String args[]) {
        Map<String, String> a = new HashMap<String, String>();
        a.put("hai", "HelloOWORLD");
        a.put("Hello", "hai");
        System.out.println(a);
        System.out.println("Contains Key " + a.containsKey("Hello"));

        for (Map.Entry Map : a.entrySet()) {
            System.out.println("the value :" + Map.getKey());

        }

        FirstProgram d = new FirstProgram();
        d.display();
    }
}
