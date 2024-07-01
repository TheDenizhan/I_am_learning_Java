public class DatabaseLogger implements I_Logger{
    @Override
    public void log(String message) {
        System.out.println("Database loglandi : "+message);
    }
}
