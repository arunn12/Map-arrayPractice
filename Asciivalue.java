
import java.util.*;
import java.io.*;

public class Asciivalue {

    public static void main(String args[]) throws UnsupportedEncodingException {

        char A = 'A';
        int ab = A;
        System.out.println("ASCII value of 'A' is  : " + ab);

        char a = 'a';
        int value = (int) a;
        System.out.println("ASCII value of 'a' is  : " + value);

        String text = "ABCDEFGHIJKLMNOP";

        byte[] bytes;
        bytes = text.getBytes("US-ASCII");

        System.out.println("ASCII value of " + text + " is following");
        System.out.println(Arrays.toString(bytes));

    }
}
