import java.util.*;

public class minNumInArray {

    static int minimum(int[] arr){
    int mini = Integer.MAX_VALUE;
    for(int i = 0; i<arr.length; i++){
        // if(arr[i]<mini){
        //     mini = arr[i]; //work same, choti value ko store karo.
        // }
        mini = Math.min(arr[i], mini);
    }
    return mini;
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements: ");
        int[] arr = new int[5];

        //Input
        for(int i= 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int res = minimum(arr);
        System.out.println("Minimum Element: "+ res);


    }
}
