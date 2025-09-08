public class shift1ElementArray {

    static void shift(int[] arr){
        int temp = arr[arr.length-1]; // arr.length -1 because if elemnets is 6 and indexx start with 0 so arr.lentgth -1 = 7-1 = 6. use like this otherwise it give indexoutofbound exception. 
        for(int i = arr.length-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp; // insert 0th index value in last after all shifting done then place this value otherwise while writing in loop , arr[0] it cause misplace.

        //print (work same as above in function print)
        for(int i = 0; i<arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        //Array
        int[] arr = {10,20,30,40,50,60};
        shift(arr);

       

    }
}
