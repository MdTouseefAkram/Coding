import java.util.Scanner;

public class replaceWithSpace {

    static void replace(String str){
        char[] ch = str.toCharArray();

        for(int i = 0; i<ch.length; i++){
            if(ch[i] == '@'){
                //! Replace @ with space
                ch[i] = ' ';
            }
        }
        System.out.println("New String: " + new String(ch));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        replace(str);



        //! ✅ Optimized replacement using built-in method
        // String result = str.replace('@', ' ');

        // System.out.println("New String: " + result);
    }
    
}
