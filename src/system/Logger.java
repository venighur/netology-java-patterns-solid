package system;

public class Logger {
    public static void info(String message) {
        System.out.println();
        System.out.println("[ИНФО] - " + message);
        System.out.println();
    }

    public static void error(String message) {
        System.out.println();
        System.out.println("[ОШИБКА] - " + message);
        System.out.println();
    }
}
