//Binary search in an array

public class binary_search {
  public static int binary_search(int numbers[], int key){
    int start = 0, end = numbers.length-1;
    while(start <= end){
        int mid =(start + end)/2;

        //comparisons
        if(numbers[mid] == key){
            return mid;
        }
        if(numbers[mid] > key){
            end = mid-1;
            }else{
              start = mid+1;
            }
    }
    return -1;

  }    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key =10; 
        System.out.print(" index for key is: " + binary_search(numbers, key));
    }
    }
