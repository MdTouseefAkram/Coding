import java.util.Scanner;

public class numericTrainglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int row = 0; row<n; row++){
            for(int col =0; col<row+1; col++){
                System.out.print(row+1);
            }
            System.out.println();
        }
    }
}
