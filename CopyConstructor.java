// //A copy constructor in Java is a special constructor used to create a new object by copying the properties of an existing object.
class Car {
    int prize = 0;
    String color = "Red";

    Car() {
        // default const to create obj without using other obj
    }

    Car(Car c1) { // taking c1 object as a argument by constructor to initalise a new obj by
                  // copying the data of c1 object
        this.prize = c1.prize;
        this.color = c1.color;
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.prize = 1200;
        c1.color = "blue";

        // using the copy constructor we use the c1 objects data to initalise other
        // object
        Car c2 = new Car(c1);

        System.out.println(c2.color);
        System.out.println(c2.prize);
    }
}
