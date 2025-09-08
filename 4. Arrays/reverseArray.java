import java.util.*;
public class reverseArray {

    static void reverse(int[] arr){
        int left = 0;
        int right = arr.length-1;
        
        while(left <= right){
            //! swap logic in Java
            int temp = arr[left];
            // arr[left++] = arr[right--];//bot work , wrong o/p
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
            
        }

        //!  using for loop
        // for(int left = 0, right = arr.length-1; left<=right; left++, right--){
        //     //! swap
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;

        // }

        //Print Array
        System.out.println("Reversed Array");
       
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Array creation
        int[] arr = new int[6];
        System.out.println("Enter values: ");
        int n = arr.length;

        //Input
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //revese
       
        reverse(arr);
        //System.out.println(reverse(arr));

    }
}