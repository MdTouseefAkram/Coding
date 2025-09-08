import java.util.*;
public class inverseHollowPyramid {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        // for(int row = 0; row<n; row++){
                //space
        //     for(int col = 0; col<row; col++){
        //         System.out.print(" ");
        //     }
                 //stars
        //     for(int col = 0; col<1; col++){
        //         System.out.print("* ");
        //     }

                //spaces
        //     for(int col =0; col<n-row; col++){
        //         System.out.print("  ");
        //     }

               //stars
        //     for(int col =0; col<1; col++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        //better and accurate approach
        for(int row = 0; row<n; row++){
            //spaces
            for(int col = 0; col<row; col++){
                System.out.print(" ");
            }

            //stars
            int totalCol = n - row;
            for(int col =0; col<totalCol; col++){
                if(col == 0 || col == totalCol-1){ //print star in fisrt and last column
                    //stars
                    System.out.print("* ");
                }
                else{
                    //spaces
                    System.out.print(" ");
                }

                // Add extra space after each character except last
                if (col < totalCol - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
