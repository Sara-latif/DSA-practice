//Write a Java program to perform linear search on a string array and return the index
//  of the searched element. If the element is not found, return -1.

public class 04_strings_LS {

    public static int linear_search(String sub[], String key) {
        for (int i = 0; i < sub.length; i++) {
            if (sub[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        String sub[] = {"math", "english", "computer", "chem", "Bio"};
        String key = "computer";

        int index = linear_search(sub, key);

        if (index == -1) {
            System.out.print("NOT found");
        } else {
            System.out.print("key is found at index " + index);
        }
    }
}