//The static keyword in Java is used for memory management. It can be applied to variables, methods, blocks, and nested classes. Static members belong to the class itself rather than any specific object.

// static variables: Shared among all instances.
// static methods: Called without creating an object. cannot access non-static  variables or methods directly.
// static block: Runs before the main() method and only once when the class is loaded.
// static nested class: Can be used without an outer class object.

class Data {
    static int x = 12; // for any object the value of x will be same , if x get updated by one object
                       // then it also get updated for all other objects

    static {
        System.out.println("I will be executed before main only once when class is loaded");
    }

    int r = 0;

    static void fun() {
        System.out.println("I am static fun cant access non-static variiable");
        System.out.println("static variable x is :" + x);
        // System.out.println(r);
    }

}

public class StaticKeyword {
    public static void main(String[] args) {
        Data.fun(); // static methods are called as classname.fun() without creating
         object
        Data data = new Data();

    }
}
