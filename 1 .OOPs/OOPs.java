//! Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects.
// It simplifies the software development and maintenance by providing some concepts defined below :
//OOps is used to organize things systematically. To implement real world systematic things into our code. To implents good concepts in code using OOPS.

//! Class is a user-defined data type which defines its properties and its functions. Class is the only logical
// representation of the data. For example, Human being is a class. The body parts of a human being are its properties,
// and the actions performed by the body parts are known as functions. The class does not occupy any memory space till the
// time an object is instantiated.

//! Object is a run-time entity. It is an instance of the class. An object can represent a person, place or any other item.
// An object can operate on both data members and member functions.


//! ‘this’ keyword :  ‘this’ keyword in Java that refers to the current instance of the class. In OOPS it is used to:
//pass the current object as a parameter to another method
//refer to the current class instance variable


//Class is a user-defined data type which defines its properties and its functions
//! Need of class--. if we want to built class details of students by writing student roll->using Array and for name-> using string and for percent-> using double data type. We can do these same thing using classes by making user defined data type which is class, it makes our coding life more easier.

//class student
//! Desi define--student is a user defined data type which have different type of attributes/properties and behaviour(data type like int, String). we can say it is a new data type which has ability to store multiple different data types in a single new user define data type. It is a blueprint only.
// if int has one box so Student data type have two boxes of name and age data type small boxes in it or say in a single big Student user define data type box.
class Student { //--Student is class (user define data type)
    String name;
    int age;

    public void getInfo() {
        System.out.println("The name of this Student is " + this.name);
        System.out.println("The age of this Student is " + this.age); //use this is good practice but it will work without here this.
    }
}

//class pen
class Pen{
    String color;

    public void printColor() {
        System.out.println("This color of this Pen is " + this.color);
    }
}

public class OOPs {
    public static void main(String[] args) {

//        Object is a run-time entity. It is an instance of the class

        //student objects
        Student s1 = new Student(); //-- Student is user define data type(class) and s1 is variable name (object) or box.
        s1.name = "Touseef";
        s1.age = 22;
        s1.getInfo();

        Student s2 = new Student();
        s2.name = "Akram";
        s2.age = 22;
        s2.getInfo();


        // pen objects
        Pen p1 = new Pen();
        p1.color = "blue";

        Pen p2 = new Pen();
        p2.color = "black";

        Pen p3 = new Pen();
        p3.color = "red";

        p1.printColor();
        p2.printColor();
        p3.printColor();

    }
}


//! Java Classes--
//A class in Java is a set of objects which shares common characteristics and common properties.
// It is a user-defined blueprint or prototype from which objects are created. For example, Student is a class while a particular student named Ravi is an object.
//No memory is allocated when a class is declared. A class is a group of similar objects. Class is a logical entity. A class can only be declared once.
//An example of class can be a car.

//--Properties of Java Classes--
//1. Class is not a real-world entity. It is just a template or blueprint or prototype from which objects are created.
//2. Class does not occupy memory.
//3. Class is a group of variables of different data types and a group of methods.
//4. A Class in Java can contain:
    //Data member
    //Method
    //Constructor
    //Nested Class
    //Interface

//! Java Objects--
//An object in Java is a basic unit of Object-Oriented Programming and represents real-life entities.
// Objects are the instances of a class that are created to use the attributes and methods of a class.
//Memory is allocated as soon as an object is created. An object is a real-world entity such as a book, car, etc.
// An object is a physical entity.
// Objects can be created many times as per requirement.
//Objects of the class car can be BMW, Mercedes, Ferrari, etc.

// A typical Java program creates many objects, which as you know, interact by invoking methods. An object consists of:

//1. State: It is represented by attributes of an object. It also reflects the properties of an object.
//2. Behavior: It is represented by the methods of an object. It also reflects the response of an object with other objects.
//3. Identity: It gives a unique name to an object and enables one object to interact with other objects.


//! Object-Oriented Programming-- or Java OOPs concept refers to programming languages that use objects in programming.
// They use objects as a primary source to implement what is to happen in the code. Objects are seen by the viewer or user, performing tasks you assign.

//Object-oriented programming aims to implement real-world entities like inheritance, hiding, polymorphism, etc. in programming.
// The main aim of OOPs is to bind together the data and the functions that operate on them so that no other part of the code can access this data except that function.

//! Object-oriented programming has several advantages over procedural programming:

//1. OOP is faster and easier to execute
//2. OOP provides a clear structure for the programs
//3. OOP helps to keep the Java code DRY "Don't Repeat Yourself", and makes the code easier to maintain, modify and debug
//4. OOP makes it possible to create full reusable applications with less code and shorter development time.


//Oriented Programming is a methodology or paradigm to design a program using classes and objects.
// It simplifies software development and maintenance by providing some concepts:

//Object
//Class
//Inheritance
//Polymorphism
//Abstraction
//Encapsulation