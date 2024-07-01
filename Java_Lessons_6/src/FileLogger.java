public class FileLogger implements I_Logger{
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglandi : "+message);
    }
}

