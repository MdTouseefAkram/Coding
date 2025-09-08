//! Encapsulation is the process of combining data and functions into a single unit called class. [Wrapping data(properties) and method(functions) in a single class is called encapsulation.]
// In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class.
// In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate
// these attributes. Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature
// to restrict access to members of an object, reducing the negative effect due to dependencies.
// e.g. "protected", "private" feature in Java). [Data hiding is implements using access modifiers (private and protected keyword)]

//!--Encapsulation--
//The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

//declare class variables/attributes as private
//provide public get and set methods to access and update the value of a private variable

class BankAccount {
    public String name;
    protected String email;
    private String password;

    //getter & setter -- This functions is used in case of getting or setting value of Private data or methods in encapsulation.
    //get
    public String getPassword(){
        return this.password;
    }
    //set
    public void setPassword(String pass) {
        this.password = pass;
    }
}
public class OOPsEncapsulation {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.name = "Md Touseef Akram";
        account1.email = "mdtouseefakram@gmail.com";
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
//These three are doing data hiding but..
//Abstraction is a design-level process that hides unnecessary details to simplify complex systems,
// while encapsulation is a way to control access to data and methods within a class using private and protected.

//! Encapsulation                                      --> Abstraction -->           Interface
// Wrapping data & Data hiding (private, protected)    - Data hiding              - Pure Abstraction (Data hiding)
//getter & setter used here.

//!---Abstraction	vs   ---Encapsulation---
//Abstraction is process of hiding the implementation details and showing only the functionality to the users.
//Main feature: reduce complexity, promote maintainability, and also provide clear separation between the interface and its concrete implementation.

//Encapsulation is a process of binding data and methods together in a single unit, providing controlled access to data.
//Main feature: data hiding, providing access control and modularity.
