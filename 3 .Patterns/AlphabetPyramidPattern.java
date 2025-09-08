import java.util.*;
public class AlphabetPyramidPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n");
        int n = sc.nextInt();

        for(int row = 0; row<n; row++){
            //Increase Pattern print
            char ch = 0; // Declare ch outside loop , if not declare then get error. But it work properly in C++.
           for(int col=0; col<row+1; col++){
            int number = col+1;
            ch = (char)(number + 'A' -1);
            System.out.print(ch);
           } 
           //Decrease pattern print in revese
           for(char alphabet = ch; alphabet>'A';){
            alphabet = (char)(alphabet-1);
            System.out.print(alphabet);
           }
           System.out.println();    
        }
        
    }

}

