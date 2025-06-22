package SingletonPatternExample;

public class Logger {
    // Step 1: Private static instance of Logger
    private static Logger singleInstance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger instance created.");
    }

    // Step 3: Public static method to provide access to the instance
    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    // Logging method
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
