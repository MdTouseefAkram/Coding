import java.util.*;
public class floydTrianglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //work internally by complier
        System.out.println("Enter n"); //print string enter n in terminal
        int n = sc.nextInt(); // user can enter n value in terminal
        int count = 0;
        for(int row= 0; row<n; row++){
            for(int col =0; col<row+1; col++){
                System.out.print(++count);
            }
            System.out.println();
        }
    }
}
