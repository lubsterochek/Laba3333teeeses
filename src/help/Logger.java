package help;

import java.util.ArrayList;
import java.util.List;

public class Logger {
    private static final List<ActionResult> logs = new ArrayList<>();

    public static void log(ActionResult result) {
        logs.add(result);
    }

    public static void printLogs() {
        if (logs.isEmpty()) {
            System.out.println("Лог пуст.");
            return;
        }
        System.out.println("История событий:");
        for (ActionResult result : logs) {
            //System.out.println(result.actor().getName() + result.actionType().getMessage() + result.object().getName());
            System.out.printf(result.actionType().getMessage(), result.actor().toString(), result.object().toString());
            System.out.println();
        }
    }
}
