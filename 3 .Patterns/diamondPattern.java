import java.util.*;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        //! Logic- combine full pyramid and inverse full pyramid to get diamond shape

        // first full pyramid
        for (int row = 0; row < n; row++) {
            // space
            for (int col = 0; col < n - row; col++) {
                System.out.print(" ");
            }

            // stars
            for (int col = 0; col < row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // inverse full pyramid
        for (int row = 0; row < n; row++) {

            // spaces
            for (int col = 0; col < row + 1; col++) {
                System.out.print(" ");
            }
            // stars
            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
