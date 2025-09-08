//! Abstraction is achieved in 2 ways :
//Abstract class
//Interfaces (Pure Abstraction)

//!--Interfaces--
//All the fields in interfaces are public, static and final by default.
//All methods are public & abstract by default.
//A class that implements an interface must implement all the methods declared in the interface.
//Interfaces support the functionality of multiple inheritance.


interface Animals { //pure abstraction, no unneccesary data is shown to the user in this Animal class.
    void walk(); // This method is hiiden from user, here no need to write asbtract keyword becoz this clas is pure abstract class(interface).
}

interface Herbivore{

}
//! multiple inheritance->  where a class(child) can inherit properties of more than one parent(base) class. Here Horses is a child class and Animals, Herbivore is base(parent) class.
//multiple inheritance in Java is done by interfaces not by classes like C++.
class Horses implements Animals, Herbivore { // here for inheritance, we use implements instead of extends keyword.
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }
 }

 class Chickens implements Animals {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
 }
public class OOPsInterfaces {
    public static void main(String[] args) {
        Horses horse = new Horses();
        horse.walk();
    }
}
