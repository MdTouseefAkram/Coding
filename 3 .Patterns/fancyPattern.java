import java.util.*;

public class fancyPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int row= 0; row<n; row++){
            //stars
            for(int col = 0; col<2*n-row; col++){
                System.out.print("*");
            }

            //numeric + stars
            for(int col = 0; col<2*row+1; col++){
                //even
                if(col%2 == 0){
                    System.out.print(row+1);
                }
                else{
                    //even
                    System.out.print("*");
                }
            }

            //stars
            for(int col = 0; col<2*n-row; col++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
