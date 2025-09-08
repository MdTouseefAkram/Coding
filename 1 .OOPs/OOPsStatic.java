//!--Static Keyword-- It is used to make a varaibe or method which is common among all objects in a class.
//! Static can be used before :
//Variable (also known as a class variable)
//Method (also known as a class method)
//Block
//Nested class
//Data inside static, memeory allocates only at once. using static for common data, it saves our memory. Object memory allocates again & again.
//static--  Attributes and methods belongs to the class, rather than an object.

//! The static keyword is a non-access modifier used for methods and attributes.
//! Static methods/attributes can be accessed without creating an object of a class.

//public class Main {
//  --Static method--
//  static void myStaticMethod() {
//    System.out.println("Static methods can be called without creating objects");
//  }

// Main method
//  public static void main(String[ ] args) {
//    myStaticMethod(); // Call the static method. Allocate memory once , for example if we want to print count so using static method count is increase gardaully.
// It does not inititialize from 0 again & again like objects called again & again.

class NewStudent {
    //! static variable (Kind of Global Variable). It is shared.It is common. It is a class thing. Memory Allocated once for static variable.
    //! -- static variable is a kind a global box(variable) which is common/same data(values) and properties and this static variable data is shared with all objects of a class and memory allocated for static variable only once.
    static String school; // static variable is created when class created so it can be access in main class by ClassName.staticVarName.
    String name; // it is non static varible, we cannot access using class without creating an object. Currently it is only bluePrint no actaul variable.

    //A static method can be accessed without creating an object of the class first:
    // static function
    public static void changeSchool(){
        school = "newSchool";
    }

    // static variable
    static int a = 10;
    private static int b; //-- we can use private, so for get & set , we can use getter and setter. we don't directly acces by ClassName.StaticVarName even in main class without getter.
    //!-- Make sure our getter & setter function is also static then we can access private static variable in our main class with getter and similarly for setter using "ClassName.staticgetVarName", directly by class not objects.
//    public static int getb() {
//
//    }

    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
   // --Static method--
   static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }
    // non-static method
    public void disp(){
        System.out.println("Hello");
    }
}

public class OOPsStatic {
    public static void main(String[] args) {
        //Static method or variables are directly accessed or modify by using Class.varName not by object.VarName becoz static is for Class thing which is common to all objects, It is not a object thing like student.name.
        //! We access static variable or methods without creating an object and without using . operator in object.
        NewStudent.school = "JMV"; //directly modify for all upcoming and present all objects, static data is common for all objects among in a class.
        NewStudent s1 = new NewStudent();
        NewStudent s2 = new NewStudent();

        s1.name = "Md Touseef";
        s2.name = "Akram";

        System.out.println(s1.school); //school name is common
        System.out.println(s2.school); // school name is common
    }
}


//!The static keyword in Java is mainly used for memory management. The static keyword in Java is used to share the same variable or method of a given class.
// The users can apply static keywords with variables, methods, blocks, and nested classes. The static keyword belongs to the class rather than an instance of the class.
// The static keyword is used for a constant variable or a method that is the same for every instance of a class.
//!--Static function is used if we want to access a function in the class through just className.staticVarName(staticFunctionName), without creating object.