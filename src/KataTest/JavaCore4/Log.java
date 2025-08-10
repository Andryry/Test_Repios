package KataTest.JavaCore4;

import java.util.logging.Logger;

public class Log {
    public static void logging() {
        Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.warning("Произошла ошибка");
        logger.info("Все хорошо");
    }
}
