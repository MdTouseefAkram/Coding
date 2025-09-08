import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;



public class Arrays {
    public static void main(String[] args) {
    //! Creating an Array (method 1) - with new keyword
//        int[] marks = new int[3];
//        marks[0] = 97;
//        marks[1] = 98;
//        marks[2] = 95;
//
//!      Creating an Array (method 2)
//        int[] marks1 = {98,97,95};

//! Declaration
    // int[] numbers; // Declares an integer array
    // String[] names; // Declares a String array

//! Initialization
    // int[] numbers = new int[5]; // Creates an integer array of size 5
    // String[] names = {"Alice", "Bob", "Charlie"}; // Initializes a String array with values

        // Taking Input and print elements
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //Input in array
        for(int i = 0;i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        //Print the numbers in array
        for(int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

 //! Converting Array to ArrayList

        Integer[] arr = {1, 2, 3};
        ArrayList<Integer> ls = new ArrayList<>(Arrays.asList(arr));  // ✅ VALID

    //! Convert Array to String in Java
        // import java.util.Arrays; it is required.

        // int[] intArray = {1, 2, 3, 4, 5};
        // String intString = Arrays.toString(intArray);
        // System.out.println(intString); // Output: [1, 2, 3, 4, 5]

        // String[] stringArray = {"apple", "banana", "cherry"};
        // String fruitString = Arrays.toString(stringArray);
        // System.out.println(fruitString); // Output: [apple, banana, cherry]

    }


}
