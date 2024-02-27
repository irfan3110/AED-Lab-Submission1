package edu.neu.mgen; 
public class lab1p1 {
    public static void main(String[] args) {
        // Initialize arrays x and y
        int[] x = { 3, 7, 2, 9, 5 };
        int[] y = { 8, 4, 1, 6, 10 };

        // Create array z containing max of x and y elements
        int[] z = new int[5];
        for (int i = 0; i < 5; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // Print arrays x, y, and z
        System.out.println("Array x = " + arrayToString(x));
        System.out.println("Array y = " + arrayToString(y));
        System.out.println("Array z = x + y = " + arrayToString(z));
    }

    // Method to convert array to string
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}