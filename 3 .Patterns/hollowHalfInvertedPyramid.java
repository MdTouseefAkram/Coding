import java.util.*;
public class hollowHalfInvertedPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int row = 0; row<n; row++){
            int totalCol = n-row;
            for(int col = 0; col<totalCol; col++){
                if(row == 0 || col == 0 || col == totalCol-1){
                    //stars
                    System.out.print("* "); //either remov espace after * and remove one space in "  " to get same output
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


    }
}
