public class EmailLogger implements I_Logger{

    @Override
    public void log(String message) {
        System.out.println("Email gonderildi : "+message);
    }
}


