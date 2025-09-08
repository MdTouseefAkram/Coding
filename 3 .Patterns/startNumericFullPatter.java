import java.util.Scanner;
public class startNumericFullPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int row = 0; row<n;row++){
            for(int col =0; col<2*row+1; col++){
                if(col%2 == 1){
                    //odd
                    System.out.print("*");
                }
                else{ //even
                    System.out.print(row+1);
                }
            }
            System.out.println();
        }

        //inverse startnumeric pattern
        for(int row = 0; row<n; row++){
            for(int col= 0; col<2*n-2*row-1; col++){
                if(col%2 == 1){
                    //odd
                    System.out.print("*");
                }
                else{
                    System.out.print(n-row-1);
                }
            }
            System.out.println();
        }
    }
}