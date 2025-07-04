public class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
        System.out.println("Singleton instance created.");
    }

    public static MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Doing something in the singleton instance.");
    }
}
