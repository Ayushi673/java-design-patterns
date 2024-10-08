package designpatterns.creational.singleton.threadSafeEfficient;

public class Singleton {

    private static volatile Singleton instance;

    /*
    Q) Why 'volatile' is needed ?
    Ans - Without 'volatile' it is possible that partially constructed object is visible to threads,
    due to Java's out-of-order writes problem.

    'Volatile'-
    - ensures proper construction (fully constructed object)
    - ensures proper visibility of singleton instance across multiple threads.
    */

    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        if (instance == null) { // no locking : avoids cost of synchronization if instance is already initialized
            synchronized (Singleton.class) {
                /* after acquiring lock : ensures only one instance is created even if multiple threads attempt
                to create instance concurrently
                */
                if (instance == null) {
                    instance = new Singleton(data);
                }
            }
        }
        return instance;
    }

    public static void main(String [] args) {
        /* Lazy Initialization : creates instance of class only
        when it is requested by calling the static factory method getInstance();
        */
        String info = Singleton.getInstance("Double Checked Locking with volatile keyword is the" +
                " most efficient thread safe implementation of Singleton Pattern").data;
        System.out.println(info);
    }
}
