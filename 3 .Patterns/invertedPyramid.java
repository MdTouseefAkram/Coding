import java.util.*;
public class invertedPyramid {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

         for(int row = 0; row<n; row++){
            for(int col = 0; col<n-row; col++){ //logic write here in inner loop
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}
