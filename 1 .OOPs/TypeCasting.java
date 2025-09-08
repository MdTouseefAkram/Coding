import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num1 = input.nextInt();
//        System.out.println(num);
//        System.out.println(num1);
//
//!        type casting
//        int num2 = (int) (67.67f);
//        System.out.println(num2);

        // automatic type promotion in expression
//        int a =  40;
//        byte b = (byte)(a); // 257 % 256 = 1
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;
//
//        System.out.println(d);

//        byte b = 50;
//        b = b*2; // error
        int number = 'A';
        System.out.println("Hi");

        System.out.println(3*6);

        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);

    }
}
