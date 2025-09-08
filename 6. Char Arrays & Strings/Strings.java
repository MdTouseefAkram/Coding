import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {

        //! Declration
        String name = "Tony";

        // String s2 = new String("World"); //using the new keyword.
        // char[] charArray = {'J', 'a', 'v', 'a'};
        // String s3 = new String(charArray); 

        //input
        Scanner sc = new Scanner(System.in);
        String name1 = sc.next();



        //! Concatenation(Joining 2 Strings)
        String firstName = "Tony";
        String secondName = "Stark";

        String fullName = firstName + " " + secondName;
        System.out.println(fullName);

        //! print length of string (.length())
        System.out.println(fullName.length());

        //! Access characters of a string (.charAt(index))
         for (int i = 0; i<fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
        //! Access char Array by using their index, which starts from 0 for the first element.
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        char firstChar = charArray[0]; // Accesses the character at index 0 ('H')
        char thirdChar = charArray[2]; // Accesses the character at index 2 ('l')

        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]); // Prints each character
        }


         //! ToString Method of String class
        int number = 123;
        String str = Integer.toString(number);
        System.out.println(str.length());

        // The substring of a string is a subpart of it.
        String name2 = "TonyStark";

        System.out.println(name.substring(0, 4));

        //! Convert String to Array in Java.
        //! By Converting to a char[] (Character Array):
        String myString = "Hello";
        // char[] charArray = myString.toCharArray();

        // Example: Printing the characters
        for (char c : charArray) {
            System.out.println(c);
        }

        //! substring(int beginIndex, int endIndex) -> endIndex is exclusive
        // String originalString = "Hello World";
        // String sub1 = originalString.substring(6); // sub1 will be "World"

        // String str = "hello";
        // String str2 = str.substring(2, 6);

         //! Iterating in StringBuilder
    // for (int i = 0; i < sb.length(); i++) {
    //     System.out.println(sb.charAt(i));
    // }
    //!         | Operation | ArrayList                    | StringBuilder                    |
// | --------- | ---------------------------- | -------------------------------- |
// | Push      | `list.add(element)`          | `sb.append(char)`                |
// | Pop       | `list.remove(list.size()-1)` | `sb.deleteCharAt(sb.length()-1)` |


    //! Converting String to StringBuilder.
    String str1 = "hello";
    StringBuilder sb = new StringBuilder(str1);

    sb.append(" world");
    System.out.println(sb);  // Output: hello world



//!         | C++                | Java                         |
//! | ------------------ | ---------------------------- |
//! | `string`           | `StringBuilder`              |
//! | `ans.pop_back()`   | `ans.deleteCharAt(length-1)` |
//! | `ans.push_back(c)` | `ans.append(c)`              |
//! | `s[index]`         | `s.charAt(index)`            |


    }

    //! String Index Accessing
    String myString = "Hello";
    char firstChar = myString.charAt(0); // 'H'
    char thirdChar = myString.charAt(2);  // 'l'

    //! String Array and Index accesssing. (Both above and this are different. Don;t confuse between String and String Array.)
    String[] colors = {"Red", "Green", "Blue"};

    // Accessing elements by index
    String firstColor = colors[0]; // firstColor will be "Red"
    String secondColor = colors[1]; // secondColor will be "Green"
    String lastColor = colors[colors.length - 1]; // lastColor will be "Blue"

    // Modifying an element at a specific index
    colors[1] = "Yellow"; // The array now is {"Red", "Yellow", "Blue"}
}
