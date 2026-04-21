//Write a Java program to create an array, take input from the
//  user, and display the length of the array.


import java.util.*;
public class output_input {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int marks[]= new int [3];
        
        // marks[0] = sc.nextInt();
        // marks [1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("marks of student 0 is" + " " + marks[0]);
        //  System.out.println("marks of student 1 is" + " "+ marks[1]);
        //   System.out.println("marks of student 2 is" + " " + marks[2]);

        //   int percentage =(marks[0]+ marks[1]+marks[2])/3;
        //   System.out.println("percentage of student is" + percentage);

          System.out.println("the length of an array is" + " "+ marks.length);


    }
    
}
