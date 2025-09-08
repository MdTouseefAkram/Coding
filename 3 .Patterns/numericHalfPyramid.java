import java.util.*;
public class numericHalfPyramid {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        for(int row = 0; row<n;row++){
            for(int col = 0; col< row+1; col++){ // for iteration use row logic, where col< goes
                System.out.print(col+1); //for printing use col logic, it print row wise col value
            }
            System.out.println();
        }
    }
}
