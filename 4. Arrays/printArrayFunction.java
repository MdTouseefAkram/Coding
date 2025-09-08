import java.util.*;
public class printArrayFunction {
    //! Printing Array using function
    static void printArray(int[] arr){ //always write static keyword in Java.
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //! Linear Search
    static boolean linearSearch(int[] arr, int target){
    
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                //found
                return true;
            }
        }
        //not found
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //! Printing Array
        // int[5] arr = {1,2,4,5,6}; //error
        int[] arr = {1,2,4,5,6};
        //int size = 5;
        // printArray(arr, size);
        // printArray(arr);

        //! Linear Serach
        System.out.println("Enter Target");
        int target = sc.nextInt();
        boolean ans = linearSearch(arr, target);
        if(ans == true){ // ans == 1, not work in Java, incompatible types
            //found
            System.out.println("Found");
        } else{
            System.out.println("Not Found");
        }

    }
}
