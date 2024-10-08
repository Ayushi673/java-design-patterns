package designpatterns.creational.singleton.threadSafe;

public class Singleton {

    private static Singleton instance;
    private String data;

    private Singleton(String data) {
        this.data = data;
    }

    public static Singleton getInstance(String data) {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(data);
            }
            return instance;
        }
    }

    public static void main(String []args) {
        String data = Singleton.getInstance("Every thread has to wait it's turn to create an instance" +
                " of Singleton class, even if instance was already created.\nUnnecessary overhead can decrease " +
                "performance of our program.").data;
        System.out.println(data);

        /* solution : Double Checked Locking
            1. Once a singleton object is created, synchronization is no longer needed.
            2. Skip synchronization when object is already created
            3. Limit synchronization to the rare occasion of creating a brand-new instance of the class.
        */
    }
}
