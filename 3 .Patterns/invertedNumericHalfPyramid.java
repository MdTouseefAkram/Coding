import java.util.*;
public class invertedNumericHalfPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int row = 0; row<n; row++){ //n is fixed in each iteartion , like n = 5 so in each iter. n-1 = 4, n-1 = 4, n doesn't change.
            for(int col = 0; col<n-row; col++){ //we don't use col so row is used like col<n-row
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
}
