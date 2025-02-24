// The super keyword refers to the parent class (superclass).
// it is used for --
// Accessing parent class variables
// Calling parent class function
// Calling parent class Constructor

class parent {
    int x = 10;

    void fun() {
        System.out.println("i am fun of parent class");
    }

    parent() {
        System.out.println("I am constructor of parent");
    }
}

class child extends parent {

    child() {
        super(); // calls parent class constructor
        System.out.println("I am constructor of child");

    }

    void fun() {
        super.fun(); // calling fun of superclass
        System.out.println("I am fun of child class");
    }

    int x = 12;

    void display() {

        System.out.println(super.x); // display the vlaue of x for parent class
        System.out.println(x);
    }
}

public class superKeyword {
    public static void main(String[] args) {
        child b = new child(); // calls the constructor
        b.fun();
        b.display();
    }
}
