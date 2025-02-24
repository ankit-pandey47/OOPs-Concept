//The final keyword in Java is used to restrict modifications to variables, methods, and classes.

//final variable -- A final variable cannot be reassigned after initialization. assign while declaration
// final method --  A final method cannot be overridden by subclasses.
// final class -- A final class cannot be inherited

class parent {
    final int x = 12;
    // x=12; // cant be done bcoz final var cant be reassigned

    final void show() {
        System.out.println("I am show() of parent");
    }

}

final class child extends parent { // this class cant be inherited

    // void show() { // cant be override bcox show is final function

    // }

}

public class finalKeyword {
    public static void main(String[] args) {

    }
}
