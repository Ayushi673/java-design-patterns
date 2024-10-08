package designpatterns.creational.singleton.notThreadSafe;

public class Singleton {
    private static Singleton instance;  //static member : ensures memory is allocated once
    private String data;

    // private constructor : barricade against external attempts to create multiple instances of class
    private Singleton(String data) {
        this.data = data;
    }

    // static factory method : provide single global point of access to Singleton object
    public static Singleton getInstance(String data) {
        if (instance == null) {
            instance = new Singleton(data);
        }
        return instance;
    }

    public static void main(String []args) {
        String data = Singleton.getInstance("If 2 threads access the static factory method at the same time, " +
                "2 different instances of the same singleton class will be returned.").data;
        System.out.println(data);

        /* solution :
        1. make the static factory method synchronized -
        public static synchronized Singleton getInstance(String data) { ... }
        OR
        2. wrap the instance creation logic within synchronized block
        */

    }
}
