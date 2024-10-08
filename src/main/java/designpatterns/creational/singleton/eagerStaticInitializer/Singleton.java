package designpatterns.creational.singleton.eagerStaticInitializer;

public class Singleton {
    private static Singleton instance = new Singleton(); // static initializer based eager initialization
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }

    /*
    Q) Is eager initialization thread-safe ? How ?
    Ans - YES.
    - Class loading mechanism of JVM ensures that static variables are initialized only once
    when the class is loaded.
    - JVM guarantees class initialization is done by a single thread, no other thread can access the class
    until initialization is complete.
    - This process is synchronized internally and is thread-safe by default and does not need extra synchronization.

    Q) Disadvantage - class is always initialized so it is more resource intensive than DCL lazy initialization.
     */
}
