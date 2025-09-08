public class tripletPair {
    public static void main(String[] args){
        int[] arr = {10,20,30};

        for(int i = 0;i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                for(int k = 0; k<arr.length; k++){
                    System.out.print("("+ arr[i] + "," + arr[j] + "," + arr[k] + ") ");
                }
            }
        }
    }
}
