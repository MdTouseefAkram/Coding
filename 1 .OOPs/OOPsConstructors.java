//! Constructor : Constructor is a special method which is invoked automatically at the time of object creation.
// It is used to initialize the data members of new objects generally.
//Constructors have the same name as class or structure.
//Constructors don’t have a return type. (Not even void)
//Constructors are only called once, at object creation.

//! A constructor in Java is a special method that is used to initialize or construct objects.
// The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

class Students {
    String name;
    int age;

    //There can be three types of constructors in Java.
    //Non-Parameterized constructor
    Students() {
        System.out.println("constructor called");
    }

    //Parameterized constructor
    Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //! In java copy constructor is user define. It is used to copy a object in another object.
    //Copy Constructor ->  A Copy constructor is an overloaded constructor used to declare and initialize an object from another object.
    Students(Students s2) { // here students is a class and s2 is new object of students class where we want to copy all data and methods from its previos object s1 to s2.
        this.name = s2.name;
        this.age = s2.age;
    }
}

// we can use public keyword before writing constructor function.
//   public Students() { //default constructor.
//
//   }

public class OOPsConstructors {
    public static void main(String[] args) {
        //student objects
        Students s1 = new Students();
        //Students s1 = new Students("Touseef",22); //for parameterize using constructor. This data is send to parametrized constructor
        // and this construtor assigned these values to s1 object properties (name, age). Now we can access these age, name properties in main class.
        s1.name = "Touseef";
        s1.age = 22;

        Students s2 = new Students(s1); // use of copy constructor to copy all data and methods from object s1 to s2 object.

//        Students s2 = new Students();
//        s2.name = "Akram";
//        s2.age = 22;

        //optimized use of contructor.
        Students s3 = new Students("Touseef", 23);// This works as same below in just one line.
//        s3.name = "Touseef"; // no need to initialize like this in two or three lines.
//        s3.age = 23;
    }
}

//! ----- Contructor chaining----- is used while making objects using iheritance.
// When we create an object of derived class then first constructor of base class is called and then constructor of derived class is called.
//This concept in Java is called "Contructor Chaining". Chain of construcor is run when we try to make objects in inheritance.

//interface Animals {
//    void walk(){ // [contructor chaining]
//        System.out.println("Animal is created");  // first this base class contructor is called when horse object is created becoz it is base class and it invoke first for inheriting properties.
//    }
//}
//class Horses extends Animals {
//    public void walk() {  // then this derived constructor is called.
//        System.out.println("Horse walks on 4 legs");
//    }
//}
//
//public static void main(String[] args) {
//    Horse horse = new Horse();
//}