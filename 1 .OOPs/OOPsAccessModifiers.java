//! Package is a group of similar types of classes, interfaces and sub-packages. Packages can be built-in or user defined.
//Built-in packages - java, util, io etc.


//! Access Modifiers in Java
//! Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.

//! Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
// If you do not specify any access level, it will be the default.

//! Protected: The access level of a protected modifier is within the package and outside the package through child class.
// If you do not make the child class (sub_class), it cannot be accessed from outside the package.

//! Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within
// the package and outside the package

//!--Non-Access Modifiers--
//For classes, we can use either final or abstract:

//! Modifier
//final-- The class cannot be inherited by other classes.
//abstract-- The class cannot be used to create objects (To access an abstract class, it must be inherited from another class.

//! --Final--
//If we don't want the ability to override existing attribute values, declare attributes as final:
//final	Attributes and methods cannot be overridden/modified.

class Account {
    public String name;
    protected String email;
    private String password;

    final int x = 10; // this variable x , it cannot be modified or override using object.x.
    final double PI = 3.14;

    public void setPassword(String password){
        this.password = password;
    }
}

public class OOPsAccessModifiers {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Md Touseef Akram";
        a1.setPassword("abcd");
        a1.email = "mdtouseefakram@gmail.com";
//        a1.PI = 2.12; //gives error becoz it is final
//        a1.x = 34; // similarly it gives error becoz it variable is final
    }
}
