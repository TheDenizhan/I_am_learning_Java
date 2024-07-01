public class Utils {
    public static void runLoggers(I_Logger[] loggers, String message){
        for(I_Logger logger:loggers){
            logger.log(message);
        }
    }
}
