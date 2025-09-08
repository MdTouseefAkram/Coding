import java.util.*;
public class numericPalindromeEquilateralPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();
        int count = 0;
        
        for(int row = 0; row<n; row++){
            //1st half pyramid tringale
            //space
            for(int col =0; col<n-row; col++){
                System.out.print(" ");
            }
            //Print numbers
            for(int col =0; col<row+1; col++){
                System.out.print(col+1);
            }
            // //2nd half pyramid triangle
            for(int col =0; col<row; col++){
                System.out.print(row-col); //pattern like, r-c = 0, 2-0 =0,2-1= 1, 3-0=3, 3-1= 3///
            }
            System.out.println();
        }
    }
}
