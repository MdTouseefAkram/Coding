public class StringBuilders {
    public static void main(String[] args) {

        //! Declaration
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // Get a character from Index in StringBuilder
        //get char
        System.out.println(sb.charAt(0));

        // set a character at Index
        //set char
        sb.setCharAt(0, 'P'); //start index, end index
        System.out.println(sb);


        //Insert a character at some Index
        //Insert char
        sb.insert(0, 's'); //start index, end index
        System.out.println(sb);

        //Delete char at some Index
        //delete char
        sb.delete(0,1); // start index, end index
        //sb.deleteCharAt(index);
        System.out.println(sb);

        //Append a char
        sb.append("Stark");
        System.out.println(sb);

        //Print length of string
        System.out.println(sb.length());

    }
}
