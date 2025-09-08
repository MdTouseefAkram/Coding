import java.util.*;

public class checkPalindrome {
    static void palindrome(String str){
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length-1;


        //! Reverse
        for(int i =0; i<ch.length; i++){
            // swap
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
       String reversed = new String(ch);
        if(str.equals(reversed)){ //! Don't user str == reversed, it give wrong ans.
            System.out.println("Valid Palindrome");
        } else{
        System.out.println("Invalid Palindrome");
        }




        //! Optimised approach
//         int left = 0;
//     int right = str.length() - 1;

//     while (left < right) {
//         if (str.charAt(left) != str.charAt(right)) {
//             System.out.println("Invalid Palindrome");
//             return;
//         }
//         left++;
//         right--;
//     }
//     System.out.println("Valid Palindrome");
// }
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        //! String can also access by indexing by using toChar(index).
        // for(int i = 0; i<str.length(); i++){
        //     System.out.print(str.charAt(i));
        // }

       palindrome(str);


    }
}
