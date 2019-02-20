
package javaarray6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArray6 {

    public static void main(String[] args) {
        int sizeOfArray = 3;

        // Create an integer array 
        // using reflect.Array class 
        // This is done using the newInstance() method 
        int[] intArray = (int[]) Array.newInstance(int.class, sizeOfArray);

        // Add elements into the array 
        // This is done using the setInt() method 
        Array.setInt(intArray, 0, 10);
        Array.setInt(intArray, 1, 20);
        Array.setInt(intArray, 2, 30);

        // Printing the Array content 
        System.out.println(Arrays.toString(intArray));
    }
}
