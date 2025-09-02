package paradigm_shift_java;

public class ConsoleLogger implements ILogger {

    @Override
    public void info(String message) {
        System.out.println("INFO: " + message);
    }

    @Override
    public void error(String message) {
        System.out.println("ERROR: " + message);
    }
}
