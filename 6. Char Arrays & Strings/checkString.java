public class checkString {
    public static void main(String[] args){
        String str = "Touseef";
        String str1 = "e";
        
        //! contains()
        if(str.contains(str1)){
            System.out.println(true);
        } else{
            System.out.println(false);
        } //true

        //! comapre()
        if(str.compareTo(str1) == 0){
            System.out.println(true);
        } else{
            System.out.println(false);
        } //false

        //! equals
        if(str.equals(str1)){
            System.out.println(true);
        } else{
            System.out.println(false);
        } //false

        //! substring(int beginIndex, int endIndex) -> endIndex is exclusive
        if(str.substring(2, 6) == "eef"){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        // String originalString = "Hello World";
        // String sub1 = originalString.substring(6); // sub1 will be "World"
    }
}
