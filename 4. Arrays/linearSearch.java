import java.util.*;
public class linearSearch {
    public static void main(String[] args){

        //! Normal code
        // int[] arr = {2,4,6,8,10,12};
        // int target = 10;

        //! Generic Code
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        boolean flag = false; 
    
        // Taking input array
        System.out.println("Enter Values");
        for(int i =0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Taking input target
        System.out.println("Enter Target");
        int target = sc.nextInt(); 

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                //found
                flag = true;
                break;
            }
        }
        if(flag){ //true ->Found
            System.out.println("Target Found");
        } else{
            //not found
            System.out.println("Not Found");
        }
    }
}

