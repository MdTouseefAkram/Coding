public class countZerosOnes {

    //! Generic code
    static void countZeroOne(int[] arr){
        int countZero = 0;
        int countOne = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 0){
                countZero++;
            } else{
                countOne++;
            }
        }
        System.out.println("Count 0s: " + countZero + " Count 1s: "+ countOne);
    }
    public static void main(String[] args){

        int[] arr = {0,1,1,1,0,0,1,1};
        // int countZero = 0;
        // int countOnes = 0; //! initilize these variales with 0 otherwise while using these in loop it give error , variable not initialize.
        // for(int i = 0;i<arr.length; i++){
        //     if(arr[i] == 0){
        //         countZero++;
        //     }
        //     else {
        //         countOnes++;
        //     }
        // }
        // System.out.println("Count 0s: " + countZero + " Count 1s: "+ countOnes);

        //Generic code
        countZeroOne(arr);
    }
}
