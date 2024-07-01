package Core;

import jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {
    @Override
    public void logToSytstem(String message) {
        JLoggerManager manager = new JLoggerManager();
        manager.log(message);
    }
}
