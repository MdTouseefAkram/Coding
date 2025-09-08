//! Abstraction - In simple terms, it is hiding the unnecessary details & showing only the essential parts/functionalities to the user.

//! Data binding : Data binding is a process of binding the application UI and business logic.
// Any change made in the business logic will reflect directly to the application UI.

//! Abstraction is achieved in 2 ways :
//Abstract class
//Interfaces (Pure Abstraction)

//! Abstract Class--
//An abstract class must be declared with an abstract keyword.
//It can have abstract and non-abstract methods.
//It cannot be instantiated.
//It can have constructors and static methods also.
//It can have final methods which will force the subclass not to change the body of the method.


//! --abstract-- Can only be used in an abstract class, and can only be used on methods. The method does not have a body,
// for example abstract void run();. The body is provided by the subclass (inherited from).

//The abstract keyword is a non-access modifier, used for classes and methods:

//1. Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

//2. Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
//An abstract class can have both abstract and regular methods:

//abstract class Animal {
//  public abstract void animalSound();
//  public void sleep() {
//    System.out.println("Zzz");
//  }
//}

//From the example above, it is not possible to create an object of the Animal class:
//Animal myObj = new Animal(); // will generate an error.

//ExampleGet your own Java Server

//! -- Abstract class--
//abstract class Animal {
//  -- Abstract method (does not have a body)
//  public abstract void animalSound();

//  -- Regular method
//  public void sleep() {
//    System.out.println("Zzz");
//  }
//}

//!-- Subclass (inherit from Animal)
//class Dog extends Animal {
//  public void animalSound() {
//    --The body of animalSound() is provided here
//    System.out.println("The dog says: bark");
//  }
//}

//class Main {
//  public static void main(String[] args) {
//    Dog d1 = new Dog(); // Create a Dog object
//    d1.animalSound();
//    d1.sleep();
//  }
//}

abstract class Animal { // only neccessary data is shown to the user and other uneccesary data is hide in this abstract class. we can use a abstract class to hide uncessary method by making it abstract method, which method we want to hide from user and other data is shown normally.
    abstract void walk(); //abstract method, it does not show to user.
    void breathe() { // non-abstract method, it shows to the user
        System.out.println("This animal breathes air");
    }

    Animal(){
        System.out.println("You are about to create an Animal.");
    }
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse, you have created a Horse!");
    }

    void walk() {
        System.out.println("Horse walks on 4 legs");
    }
}

class Chicken extends Animal {
    Chicken() {
        System.out.println("Wow, you have created a Chicken!");
    }

    void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}
public class OOPsAbstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.breathe();
    }
}
