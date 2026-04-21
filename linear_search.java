//Write a Java program to perform linear search on an integer array. If the element is found, return its
//  index; otherwise, display ‘Not found’.


public class linear_search {

    public static int linearSearch(int numbers[], int key){
        for(int i=0 ; i<numbers.length; i++){
            if(numbers [i]== key){
                return i;
            }
        }
        return -1;
    
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 6, 8, 12 , 14, 16};
        int key = 10;
        
        int index = linearSearch(numbers, key);
            if(index == -1){
                System.out.print("NOT found");
            }else{
                System.out.print("key  is at index" + " " + index);
            
        }
    }

}