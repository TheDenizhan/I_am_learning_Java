public class SmsLogger implements I_Logger{
    @Override
    public void log(String message) {
        System.out.println("Sms gonderildi : "+message);
    }
}
