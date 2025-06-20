package week1.singleton;

public class Logger {
    private static Logger instance;

    private Logger() {
        System.out.println("week1.singleton.Logger instance created.");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
