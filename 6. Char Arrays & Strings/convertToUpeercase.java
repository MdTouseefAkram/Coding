import java.util.*;
public class convertToUpeercase {

    static void upperCase(String str){
        char[] ch = str.toCharArray();
        for(int i =0; i<ch.length; i++){
            //! convert lowercase to uppercase
            if(ch[i] >= 'a' && ch[i]<='z'){
                ch[i] =  (char)(ch[i] - 'a' +'A');
            }
        }
        //! covert char to String because we want string not char in output. write this in outside the loop otherwise it print in each iteration
        System.out.println("Uppercase String: " + new String(ch));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        upperCase(str);


        //! 2nd Optimiszed approach
        // String upper = str.toUpperCase();
        // System.out.println(upper);

        //! Formula
       // lowercase_char = (char)(uppercase_char + 'a' - 'A');
       // uppercase_char = (char)(lowercase_char - 'a' + 'A');


    }
}
