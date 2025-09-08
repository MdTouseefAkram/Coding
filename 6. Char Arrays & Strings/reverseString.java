import java.util.*;
public class reverseString {

    static void reverse(String str){
        char[] ch = str.toCharArray(); 
        int left = 0;
        int right = ch.length-1;
        while(left<= right){
            //swap
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
        System.out.println("Reversed String "+ new String(ch));
    }
    public static void main(String[] args){
        //! Generic Code
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        reverse(str);
        //String
        //String str = "Touseef";
        // String str = new String("Touseef");

      
    }
}
