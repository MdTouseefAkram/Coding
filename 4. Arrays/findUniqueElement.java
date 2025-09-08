//import java.util.*; //not work for sorting
//import java.util.Collections; // for collection.reverseOrder
//import java.util.Arrays; //for sorting
public class findUniqueElement {

    //! Better Approach using XOR
    //working of xor -> ans = 0^2^10^11^13^10^2^15^13^15. -> same elemet like 2 and 2 is cancel by XOR and diff element like 0^2 = 2.
    //! Logic ->So all same elemnets get cancel by XOR and unique element is stored in ans varaible.
    // 0^0 = 0
    // 0^a = a
    static int uniqueElement(int[] arr){
        int ans = 0;
        for(int i =0; i<arr.length; i++){
            ans =ans^ arr[i];
        }
        return ans;
    }
    public static void main(String[] args){
        //Array
        int[] arr = {2,10,11,13,10,2,15,13,15};
        int res = uniqueElement(arr);
        System.out.println("Unique Element: "+ res);
      

        



        //! 2nd method
//      int ans = 0;            
        // //! Sort in descending order
        // // Arrays.sort(numbers, Collections.reverseOrder());

        // //sorting
        // //! Sort in ascending order
        // Arrays.sort(arr);

        // for(int i = 0; i< arr.length-1; i+=2){ // last end element not check, if we write arr.length; it give index outofbound. because if i = last index, then i+1 = outofbound.
        //     if(arr[i] != arr[i+1]){
        //         ans = arr[i];
        //         break;
        //     }
        // }

        // // If unique element is at the end
        // // if(ans = -1){
        // //     ans = arr[arr.length-1]
        // // }
        // if (ans == 12) {
        //     ans = arr[arr.length - 1];
        // }
        // System.out.println("Unique Element: "+ ans);


    }
}
