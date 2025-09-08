import java.util.*;
public class fullPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int row = 0; row<n; row++){ //outer loop repsrest the row
            // inner loop represents the col
            //spaces
            for(int col = 0; col<n-row-1; col++){
                System.out.print(" ");
            }
            
            //stars
            for(int col = 0; col<row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
