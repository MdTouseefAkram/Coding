public class printPairsElementsArray {
    public static void main(String[] args){
        //Array
        int[] arr = {10,20,30};

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print("("+ arr[i] + "," + arr[j] + ") ");
            }
        }
    }
}
