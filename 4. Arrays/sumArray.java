import java.util.Scanner;

public class sumArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 values: ");
        int sum = 0;

      // Input  and claculate sum
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        //print arr elements
        System.out.println("Array Elements");
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
       //print sum
       System.out.println("Sum: "+ sum);
    }
}
