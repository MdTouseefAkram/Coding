import java.util.*;
public class inverseFullPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int row = 0; row<n; row++){
            //spaces
            for(int col = 0; col<row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0; col<n-row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
