public class instanceAndinstanceOf {
//!----🔹 Is an instance an object?
// 👉 Yes.
// An instance is just another word for an object that has been created from a class using the new keyword.

//! Car myCar = new Car();  // myCar is an instance (i.e., an object) of class Car


//!----🔹 What is instanceof in Java?
// instanceof is a keyword used to check whether an object is an instance of a specific class (or subclass).

//✅ Syntax:
//! objectName instanceof ClassName

//!✅ Example:
//! Car myCar = new Car();

//System.out.println(myCar instanceof Car);   // true
// It checks: "Is myCar an instance of Car?"

// The answer is true.

//!🔸 Another Example with Inheritance:

class Animal {}
class Dog extends Animal {}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();

        System.out.println(a instanceof Animal); // true
        System.out.println(a instanceof Dog);    // true
    }
}
// Even though a is declared as type Animal, it actually holds a Dog object.
// So both instanceof Animal and instanceof Dog return true.

//!🔹 Summary:
// Term	Meaning
// Instance--	A real object created from a class
// Object-- 	Same as instance in this context
// instanceof--	Keyword to check object type

//! 📌 Why We Use instanceof
// | Use Case                   | Description                                                                                |
// | -------------------------- | ------------------------------------------------------------------------------------------ |
// | ✅ Type Checking            | Before performing a type cast, you can safely check the object’s type.                     |
// | ✅ Avoid ClassCastException | Prevents runtime errors due to wrong type casting.                                         |
// | ✅ Polymorphism Handling    | Helps to write logic based on actual object types when dealing with superclass references. |

}
