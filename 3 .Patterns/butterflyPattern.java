import java.util.*;
public class butterflyPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //! Logic - combine pattern 1 and inverse of pattern to get butterfly pattern
        //1st pattern
        for(int row = 0; row<n; row++){
            //stars
            for(int col =0; col<row+1; col++){
                System.out.print("*");
            }
            //space
            for(int col = 0; col<2*n-2*row-2; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0; col<row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd inverse Pattern
        for(int row = 0; row<n; row++){
            //stars
            for(int col = 0; col<n-row; col++){
                System.out.print("*");
            }
            //space
            for(int col = 0; col<2*row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0; col<n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
