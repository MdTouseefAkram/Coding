import java.util.*;
public class hollowPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //! 1st inverse half pyramid and rest spaces to make a square like shape.
        for(int row = 0; row<n; row++){
            //spaces
            for(int col =0 ; col<n-row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0; col<1; col++){ // only 1 star is printed
                System.out.print("* ");
            }
            //spaces
            for(int col = 0; col<row; col++){
                System.out.print(" ");
            }

            //2nd
            //spaces
            for(int col =0; col<row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0; col<1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
 
//      *   * 
//     *     * 
//    *       * 
//   *         *
//  *           * 