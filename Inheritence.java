// It is the mechanism in Java by which one class is allowed to inherit the features(fields and methods) of another class
// The extends keyword is used for inheritance in Java.

//Types
// 1> Single Inheritance -- subclass derived from one super class -- A->B
// 2> Multilevel Inheritance -- class derived from other derived class A->B->C
// 3> Hierarchical Inheritance -- one class serve as superclass for many subclass 
// 4> Multiple Inheritance -- one subclass many superclass !! not supported by java ----- achived by interface
// 6> Hybrid Inheritance -- mix of above types of inheritence

class Vehicle {
    int price = 0;
    int wheel = 0;

    void show() {
        System.out.println("Prize of the Bike is :" + price);
    }
}

// single Inheritence
class Bike extends Vehicle {
    // it has now price and wheel and show()
    String color = "red";
}

// multilevel Inheritence
class RacingBike extends Bike {
    // it has now price , wheel and color variable and show()

}

public class Inheritence {
    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.price = 1200; // we are accessing these in Bike class bcoz these are
                         // inherited from Vehicle class
        b1.wheel = 2;
        b1.show();

        RacingBike rb = new RacingBike();
        rb.price = 70000;
        rb.color = "blue";

    }
}
