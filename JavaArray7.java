
package javaarray7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JavaArray7 {

    public static void main(String[] args) {

          int sizeOfArray = 3;

        // Create an integer array 
        // using reflect.Array class 
        // This is done using the newInstance() method 
        int[] intArray = (int[]) Array
                .newInstance(int.class,
                        sizeOfArray);

        // Add elements from the array 
        // This is done using the getInt() method 
        Array.setInt(intArray, 0, 10);
        Array.setInt(intArray, 1, 20);
        Array.setInt(intArray, 2, 30);

        // Printing the Array content 
        System.out.println(Arrays.toString(intArray));

        // Retrieve elements from the array 
        // This is done using the getInt() method 
        System.out.println("Element at index 0: "
                + Array.getInt(intArray, 0));
        System.out.println("Element at index 1: "
                + Array.getInt(intArray, 1));
        System.out.println("Element at index 2: "
                + Array.getInt(intArray, 2));
    }
}
