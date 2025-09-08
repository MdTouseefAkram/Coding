import java.util.*;

public class extremePrintArray {

    static void extremePrintArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        System.out.println("Extreme Array");
        while (left <= right) {
            // odd case
            if (left == right) {
                System.out.print(arr[left]);
            } else {
                System.out.print(arr[left] + " " + arr[right] + " ");

            }
            left++;
            right--;

        }

        // //! using for loop
        // for(int left = 0, right = arr.length-1; left<=right; left++, right--){
        //     odd  array
        //     if(left == right){ //same index
        //         System.out.print(arr[left]);
        //     } else{
        //         System.out.print(arr[left] + " " + arr[right] + " ");
        //     }
        // }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Array
        int[] arr = new int[5];
        System.out.println("Enter n");

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        extremePrintArray(arr);

    }
}
