import java.util.*;
public class hollowDiamond {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();


        //! Logic - combine 1st hollow pyradmid and 2nd inverse hollow pyramid code separately.
        //1st hollow pyramid
        for(int row = 0; row<n; row++){
            //space
            for(int col = 0; col<n-row-1; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0; col<1; col++){
                System.out.print("* ");
            }
            //space
            for(int col = 0; col<row; col++){
                System.out.print("  ");
            }
            //star
            for(int col = 0; col<1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //2nd inverse hollow pyramid
        for(int row =0; row<n; row++){
            //space
            for(int col = 0; col<row; col++){
                System.out.print(" ");
            }
            //stars
            for(int col = 0; col <1; col++){
                System.out.print("* ");
            }
            //space
            for(int col = 0; col<n-row-1; col++){
                System.out.print("  ");
            }
            //stars
            for(int col = 0; col<1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
