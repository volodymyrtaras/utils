package vtaras.own.utils.examples.patterns.singleton;

public class Singleton {

    private volatile Singleton instance = null;
    private volatile String name = "singleton";

    private Singleton() {

    }

    public synchronized Singleton getInstance() {
        if (instance == null) {
            synchronized (this) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
