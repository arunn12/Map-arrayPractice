package javaarray4;

public class JavaArray4 {

    public static void main(String[] args) {
        int arr[];
        arr = new int[3];

        arr[0] = 1;
        arr[1] = 3;
        arr[2] = 6;

        for (int i = 0; i < 3; i++) {
            System.out.println(" index " + i + "  elements " + arr[i]);
        }
    }
}
