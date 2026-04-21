//Write a Java program to perform linear search on a float array using tolerance (Math.abs) for comparison, and return the index of the key if found, otherwise return -1.

public class float_LS {

    public static int linear_search(float arr[], float key) {
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - key) < 0.0001) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {

        float arr[] = {1.2f, 3.5f, 4.7f, 6.8f, 9.0f};
        float key = 4.7f;

        int index = linear_search(arr, key);

        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("Key found at index " + index);
        }
    }
}