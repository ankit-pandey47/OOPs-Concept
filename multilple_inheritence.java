//Java does not support multiple inheritance with classes due to the Diamond Problem (ambiguity when two parent classes have methods with the same signature). However, multiple inheritance is possible in Java using interfaces.

// Java allows a class to implement multiple interfaces

interface car {
    void show();
}

interface Bike {
    void show();
}

class derived implements Bike, car {
    public void show() {
        System.out.println("I am show()");
    }
}

public class multilple_inheritence {
    public static void main(String[] args) {
        derived d = new derived();
        d.show();
    }
}
