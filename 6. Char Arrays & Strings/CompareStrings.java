public class CompareStrings {
    public static void main(String[] args) {
        String name1 = "Tony";
        String name2 = "Tony";

        if(name1.equals(name2)) {
            System.out.println("They are same strings");
        } else {
            System.out.println("They are differenr strings");
        }

        //! Do NOT USE == to check for string equality, it sometimes gives incorrect ans for some test cases
        //but here it gives correct ans

        if(name1 == name2) {
            System.out.println("They are same");
        } else  {
            System.out.println("They are different");
        }

        // but Here it gives incorrect ans
        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are same");
        } else {
            System.out.println("They are different");
        }
    }
}
