import java.util.*;

//! InterviewSubstringPatternMatching -- imp. question
public class SubstringPatternMatching {

    static int checkStr(String txt, String pat) {
        char[] text = txt.toCharArray();
        char[] pattern = pat.toCharArray();

        int textLength = text.length;
        int patternLength = pattern.length;

        // Loop through the text
        for (int i = 0; i <= textLength - patternLength; i++) {
            int j;

            // Check each character of pattern
            for (j = 0; j < patternLength; j++) {
                if (text[i + j] != pattern[j]) {
                    break;
                }
            }

            // If pattern matched completely
            if (j == patternLength) {
                return 1;
            }
        }

        // Pattern not found
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String txt = sc.nextLine();

        System.out.print("Enter Pattern: ");
        String pat = sc.nextLine();

        int result = checkStr(txt, pat);

        if (result == 1) {
            System.out.println("Pattern found.");
        } else {
            System.out.println("Pattern not found.");
        }

        sc.close();
    }
}


//error code
/**
 * public class interviewSubstringPatternMatching {
    
    static int checkStr(String txt, String pat){
        char text = txt.toCharArray();
        char pattern = pat.toCharArray();
        
        for(int i = 0; i<text.length; i++){
            for(int j = 0; j<pattern.length; j++){
                if(text[i] != pattern[j]){
                    return -1;
                    break;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String txt = " ";
        String pat = " ";
        System.out.println("Enter String : ");
        txt = sc.nextLine();
        System.out.println("Enter Pattern");
        pat = sc.nextLine();

        checkStr(txt, pat);

    }
}
 */