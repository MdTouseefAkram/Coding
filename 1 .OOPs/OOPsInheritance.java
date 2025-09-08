//! Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically.
// In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes.
//In Java, the class which inherits the members of another class is called derived class and the class whose members are
// inherited is called base class.

public class OOPsInheritance {

//! base class
    class Shape {
        public void area() {
            System.out.println("Display Area of Shape");
        }
    }
//! There are five types of inheritance in Java:

//! 1.--Single inheritance-- : When one class inherits another class, it is known as single level inheritance
    class Triangle extends Shape {
        public void area(int h, int b) {
            System.out.println((1/2)*b*h);
        }
    }

//! 2.--Multilevel inheritance--(Go deep for inheriting in single level) : Multilevel inheritance is a process of deriving a class from another derived class.
// A subclass inherits from a parent class, and another subclass inherits from the first subclass. For example, if A is
// the grandparent class, B is the parent, and C is the child class, then B inherits from A, and C inherits from B.

    // base class
    //class Shape {
    //    public void area() {
    //        System.out.println("Displays Area of Shape");
    //    }
    //}

    // Derived class
    //    class Triangle extends Shape {
    //        public void area(int h, int b) {
    //            System.out.println((1/2)*b*h);
    //        }
    //    }

    class EquilateralTriangle extends Triangle {
        int side;
    }

//! 3.--Hierarchical inheritance--(one Super class giving properties all lower branch sub class) : Hierarchical inheritance is defined as the process of deriving more than one class from a same base class.
//If a number of classes are derived from a single base class, it is called hierarchical inheritance.
//In Hierarchical Inheritance, one class serves as a superclass (base class) for more than one subclass.

    //base class (super class)
    // Step 1. class Shape {
    //    public void area() {
    //        System.out.println("Displays Area of Shape");
    //    }
    //}
    // Step 2. Deriving/inheriting properties(data) or methods from same the Shape class in this Triangle class.
    //    class Triangle extends Shape { // (sub class)
    //        public void area(int h, int b) {
    //            System.out.println((1/2)*b*h);
    //        }
    //    }

    // Step 3. Again Deriving from the same class Shape.
    class  Circle extends Shape { // (sub class)
        public void area(int r) {
            System.out.println((3.14)*r*r);
        }
    }


//! 5.--Multilple inheritance--( A sub class is inheriting data/properties from more than 1 base/parent class.).
// (Implements by interface, not by classes in Java like C++).
// Multiple inheritance->  where a class(child) can inherit properties of more than one parent(base) class.
// In Multiple inheritances, one class can have more than one superclass and inherit features from all parent classes.
// Multiple inheritance: A class inherits data/ properties from multiple base classes.
// Here Horses is a child class and Animals, Herbivore is base(parent) class.

    //1st base class
    interface Animals {
        void walk();
    }
    //2nd base class
    interface Herbivore{

    }
// Multiple inheritance done here.
    class Horses implements Animals, Herbivore { // here for inheritance, we use implements instead of extends keyword.
        public void walk() {
            System.out.println("Horse walks on 4 legs");
        }
    }

//! 4.--Hybrid inheritance-- : Hybrid inheritance is a combination of
    //simple, multiple inheritance and hierarchical inheritance.



    public static void main(String[] args) {
        Horse horse = new Horse();
    }
}
