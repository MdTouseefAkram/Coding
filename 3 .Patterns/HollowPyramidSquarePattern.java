import java.util.Scanner;

public class HollowPyramidSquarePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //logic - combine 1st hollow pyramid square and 2nd inverse hollow pyramid square separately to get desire result,
        //1st hollow pyramid square
        for(int row =0; row<n; row++){
            //stars
            for(int col = 0; col<n-row; col++){
                System.out.print("*");
            }

            //space
            for(int col = 0; col<2*row +1; col++){ //1,3,5,7 spaces needed//odd sequence so use 2*row +1 formula
                System.out.print(" ");
            }

            //stars
            for(int col = 0; col<n-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd inverse hollow pyramid square
        for(int row  = 0;row<n; row++){
            //stars
            for(int col =0; col<row+1; col++){
                System.out.print("*");
            }

            //space
            for(int col =0 ; col<2*n- 2*row -1; col++){ // 7,5,3,1 spaces needed so use 2*n-2*row-1 formula
                System.out.print(" ");
            }

            //stars
            for(int col = 0; col< row+1; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}