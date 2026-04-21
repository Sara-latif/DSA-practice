//Write a Java program to find the largest element in an integer array using a
 //loop and return the maximum value.

public class largest_array {

    public static int largest_number(int numbers[]){
        int largest =Integer.MIN_VALUE; //- infinity

        for(int i=0; i<numbers.length; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
            
        }
       return largest;
    }
    public static void main(String args[]){
        int numbers[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.print(" the largest value is" + largest_number(numbers));

    }
}
