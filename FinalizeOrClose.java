//The finalize() method in Java is a protected method of the Object class that is invoked by the garbage collector before an object is removed from memory.

//It is called before the garbage collector destroys an object.
//It allows cleanup operations, such as closing resources (files, network connections, database connections, etc.).
//It is defined in java.lang.Object and can be overridden in user-defined classes.
//Not reliable because there is no guarantee when or if it will be called.

// NOTE :: finalize() method still exists in Java but is deprecated and marked for removal in future versions. If you're using Java 9 or later, you will get a warning when compiling code that overrides finalize():

// now we use  AutoCloseable for resource cleanup
// it does not depends on gc i.e, garbageCollector

class myclass implements AutoCloseable {
    int x = 0;

    @Override
    public void close() {
        System.out.println("Object cleaned");
    }
}

public class FinalizeOrClose {

    public static void main(String[] args) {
        // If the object implements AutoCloseable (like files, DB connections, streams),
        // it must be created inside the try block for automatic resource management.
        // if u dont want to cleanup the object then initialize object outside the try
        // block
        try (myclass m = new myclass()) {

            System.out.println("value of x is : " + m.x);
        } // close() automatically runs after the try ends

    }

}
