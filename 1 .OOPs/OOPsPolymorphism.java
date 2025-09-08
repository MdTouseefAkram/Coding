//! Polymorphism is the ability to present the same interface for differing underlying forms (data types).
// Poly means ‘many’ and morphism means ‘forms’.
// With polymorphism, each of these classes will have different underlying data.

//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

//Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods from another class.
// Polymorphism uses those methods to perform different tasks. This allows us to perform a single action in different ways.

//For example, think of a superclass called Animal that has a method called animalSound(). Subclasses of Animals could be Pigs, Cats, Dogs,
// Birds - And they also have their own implementation of an animal sound (the pig oinks, and the cat meows, etc.):
//ExampleGet your own Java Server
class Annimals {
    //polymorphism (Compile Time - Method Overloading) [Same Methods name used but with diiferent task]
  public void animalSound() {
    System.out.println("The animal makes a sound");
  }
}

class Pig extends Annimals {
    //polymorphism (Compile Time - Method Overloading)
  public void animalSound() {
    System.out.println("The pig says: wee wee");
  }
}

class Dog extends Annimals {
    //polymorphism (Compile Time - Method Overloading)
  public void animalSound() {
    System.out.println("The dog says: bow wow");
  }
}


//! Types of Polymorphism IMP
//1. Compile Time Polymorphism (Static) - Method overloading
//2. Runtime Polymorphism (Dynamic) - Method overriding

class Stduent {
    String name;
    int age;

    //! Compile Time Polymorphism : The polymorphism which is implemented at the compile time is known as compile-time polymorphism.
    // Example - Method Overloading

    //! Method Overloading : Method overloading is a technique which allows you to have more than one function
    // with the same function name but with different functionality.

    //! Method overloading can be possible on the following basis:
    //1. The type of the parameters passed to the function.
    //2. The number of parameters passed to the function.
    public void displayInfo(String name) {
        System.out.println(name);
    }

    public void displayInfo(int age) {
        System.out.println(age);
    }

    public void displayInfo(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}


//! Runtime Polymorphism : Runtime polymorphism is also known as dynamic polymorphism. Function overriding is an example of runtime polymorphism. Function overriding means when the child class contains the method which
// is already present in the parent class. Hence, the child class overrides the method of the parent class. In case of function overriding, parent and child classes both contain the same function with a different definition.
// The call to the function is determined at runtime is known as runtime polymorphism.

//Method overriding
class Shape {
    public void area() {
        System.out.println("Display Area of Shape");
    }
}

class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}
public class OOPsPolymorphism {
    public static void main(String[] args) {

    }
}
