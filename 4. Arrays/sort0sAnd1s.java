import java.util.Arrays;
public class sort0sAnd1s {

    static void count(int[] arr){
        int zeroCount = 0;
        int oneCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            } else{
                oneCount++;
            }

        }
        for(int i = 0;i<zeroCount; i++){
            arr[i] = 0;
        }
        for(int j =  zeroCount; j<arr.length; j++){
            arr[j] = 1;
        }
    }



    public static void main(String[] args){
        int[] arr = {0,1,0,1,1,0,0,0,0};
        // Arrays.sort(arr);
        
        // for(int i= 0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }


        count(arr);
        // Print the sorted array (conversion array to string)
        System.out.println(Arrays.toString(arr));

        //! String myString = "Hello"; (conversion string to array)
         //! char[] charArray = myString.toCharArray();
        
    }
}
